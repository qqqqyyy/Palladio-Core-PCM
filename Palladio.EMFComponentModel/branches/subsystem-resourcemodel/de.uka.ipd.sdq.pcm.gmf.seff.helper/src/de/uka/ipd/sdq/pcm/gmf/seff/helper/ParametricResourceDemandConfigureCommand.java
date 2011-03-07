package de.uka.ipd.sdq.pcm.gmf.seff.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.dialogs.stoex.StochasticExpressionEditDialog;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceRequiredRole;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceService;
import de.uka.ipd.sdq.pcm.seff.performance.ParametricResourceDemand;
import de.uka.ipd.sdq.pcm.seff.performance.PerformancePackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.stoex.analyser.visitors.TypeEnum;

/** @author roman, hauck */
public class ParametricResourceDemandConfigureCommand extends
		ConfigureElementCommand {

	private ConfigureRequest request = null;
	private ResourceService resourceService = null;
	private ResourceRequiredRole resourceRequiredRole = null;
	
	public ParametricResourceDemandConfigureCommand(ConfigureRequest request, ResourceService resourceService, ResourceRequiredRole resourceRequiredRole){
		super(request);
		this.request = request;
		this.resourceService = resourceService;
		this.resourceRequiredRole = resourceRequiredRole;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		CommandResult commandResult = setRequiredResource_ParametricResourceDemand(
				monitor, info);
		if (!isOK(commandResult)) {
			return CommandResult
					.newErrorCommandResult("Set RequiredResource for the ParametricResourceDemand failed!");
		}
		commandResult = setResourceService_ParametricResourceDemand(monitor, info);
		if (!isOK(commandResult)) {
			return CommandResult
					.newErrorCommandResult("Set ResourceService for the ParametricResourceDemand failed!");
		}
		commandResult = setSpecification_ParametricResourceDemand(monitor, info);
		if (!isOK(commandResult)) {
			return CommandResult
					.newErrorCommandResult("Set Action for the ParametricResourceDemand failed!");
		}
		return CommandResult.newOKCommandResult();
		
	}

	private CommandResult setRequiredResource_ParametricResourceDemand(
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {

		ICommand cmd = new SetValueCommand(new SetRequest(request
				.getElementToConfigure(), PerformancePackage.eINSTANCE
				.getParametricResourceDemand_ResourceRequiredRole_ParametricResourceDemand(),
				resourceRequiredRole));

		cmd.execute(monitor, info);

		return cmd.getCommandResult();
	}
	
	private CommandResult setResourceService_ParametricResourceDemand(
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {

		ICommand cmd = new SetValueCommand(new SetRequest(request
				.getElementToConfigure(), PerformancePackage.eINSTANCE
				.getParametricResourceDemand_CalledResourceService_ParametricResourceDemand(), resourceService));

		cmd.execute(monitor, info);

		return cmd.getCommandResult();
	}

	private CommandResult setSpecification_ParametricResourceDemand(
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {

		StochasticExpressionEditDialog dialog = new StochasticExpressionEditDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				TypeEnum.DOUBLE, request.getElementToConfigure());
		dialog.open();

		if (dialog.getReturnCode() == Dialog.CANCEL)
			return CommandResult.newCancelledCommandResult();

		ICommand cmd = new SetValueCommand(
				new SetRequest(((ParametricResourceDemand)request
					.getElementToConfigure()).getSpecification_ParametericResourceDemand(),
				StoexPackage.eINSTANCE
					.getRandomVariable_Specification(),
				dialog.getResultText()));
		cmd.execute(monitor, info);

		return cmd.getCommandResult();
	}
}