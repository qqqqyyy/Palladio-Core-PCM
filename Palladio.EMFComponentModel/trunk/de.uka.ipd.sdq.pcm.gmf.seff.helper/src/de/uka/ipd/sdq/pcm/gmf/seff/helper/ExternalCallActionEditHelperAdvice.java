/**
 * 
 */
package de.uka.ipd.sdq.pcm.gmf.seff.helper;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.pcm.dialogs.selection.PalladioSelectEObjectDialog;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;
import de.uka.ipd.sdq.pcm.repository.RequiredRole;
import de.uka.ipd.sdq.pcm.repository.Signature;

/**
 * @author Roman Andrej
 * 
 */
public class ExternalCallActionEditHelperAdvice extends
		AbstractEditHelperAdvice implements IEditHelperAdvice {

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterConfigureCommand(org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest)
	 */
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		EObject eObject = searchBasicComponent(request.getElementToConfigure());
		Signature signature = null;
		RequiredRole requiredRole = null;
		ArrayList<Object> filterList = new ArrayList<Object>();
		filterList.add(RequiredRole.class);
		filterList.add(Interface.class);
		filterList.add(Signature.class);
		ArrayList<Object> additionalReferences = new ArrayList<Object>();
		additionalReferences.add(RepositoryPackage.eINSTANCE
				.getRequiredRole_RequiredInterface__RequiredRole());
		PalladioSelectEObjectDialog dialog = new PalladioSelectEObjectDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				filterList, additionalReferences, eObject);
		dialog.setProvidedService(Signature.class);
		dialog.open();
		if (dialog.getResult() == null)
			return new CanceledCommand();
		if (!(dialog.getResult() instanceof Signature))
			return new CanceledCommand();
		signature = (Signature) dialog.getResult();
		requiredRole = getRequiredRole(eObject, signature);

		return new ExternalCallActionConfigureCommand(request, signature,
				requiredRole);
	}

	private EObject searchBasicComponent(EObject elementToConfigure) {
		EObject o = elementToConfigure;
		while (!(o instanceof BasicComponent))
			o = o.eContainer();
		return o;
	}
	
	/**
	 * The method supplies back the RequiredRole, from which the service call
	 * originates.
	 */
	public RequiredRole getRequiredRole(EObject input, Signature signature) {

		if (input instanceof BasicComponent) {
			BasicComponent component = (BasicComponent) input;
			EList<RequiredRole> roles = component
					.getRequiredRoles_InterfaceRequiringEntity();

			for (RequiredRole requiredRole : roles) {
				Interface reqInterface = requiredRole
						.getRequiredInterface__RequiredRole();
				if (signature.getInterface_Signature().equals(reqInterface)) {
					return requiredRole;
				}
			}
		}

		return null;
	}
}
