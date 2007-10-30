package de.uka.sdq.pcm.transformations.builder.connectors;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector;
import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;
import de.uka.sdq.pcm.transformations.builder.IComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.infrastructure.DelayMiddlewareComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.infrastructure.IMiddlewareInteractingComponentBuilder;
import de.uka.sdq.pcm.transformations.builder.util.PCMAndCompletionModelHolder;

/**
 * Implementation of an InnerConnectorCompletionBuilder which adds dummy components on both sides 
 * causing themselfs a CPU demand according to the passed StoEx.
 * @author Snowball
 *
 */
public class DelayInnerConnectorCompletionBuilder
extends AbstractClientServerConnectorCompletionBuilder {

	private String delaySpec;

	public DelayInnerConnectorCompletionBuilder(
			PCMAndCompletionModelHolder models,
			AssemblyConnector connector,
			LinkingResource linkingRes,
			IComponentBuilder innerBuilder,
			String delaySpec) {
		super(models, connector, linkingRes, innerBuilder);
		if (delaySpec == null)
			throw new IllegalArgumentException("Stoex cannot be null");
		this.delaySpec = delaySpec;
	}

	/**
	 * By default, a dummy component is created which does nothing besides delegating the call.
	 * Override if more actions are needed
	 * @return
	 */
	@Override
	protected IMiddlewareInteractingComponentBuilder createClientSideBuilder() {
		return 	new DelayMiddlewareComponentBuilder(
				myModels, 
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.middlewareInterface,
				this.myLinkingResource.getFromResourceContainer_LinkingResource().get(0),
				delaySpec);
	}
	
	/**
	 * By default, a dummy component is created which does nothing besides delegating the call.
	 * Override if more actions are needed
	 * @return
	 */
	@Override
	protected IMiddlewareInteractingComponentBuilder createServerSideBuilder() {
		return new DelayMiddlewareComponentBuilder(
				myModels, 
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.connectorToReplace.getRequiredRole_CompositeAssemblyConnector().getRequiredInterface__RequiredRole(),
				this.middlewareInterface,
				this.myLinkingResource.getToResourceContainer_LinkingResource().get(0),
				delaySpec);
	}
}
