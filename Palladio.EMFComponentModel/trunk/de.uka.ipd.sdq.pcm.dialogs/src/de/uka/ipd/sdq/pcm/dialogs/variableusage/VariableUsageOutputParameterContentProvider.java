package de.uka.ipd.sdq.pcm.dialogs.variableusage;

import java.util.ArrayList;

import de.uka.ipd.sdq.pcm.repository.OperationSignature;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.repository.ParameterModifier;
import de.uka.ipd.sdq.pcm.repository.RepositoryFactory;

public class VariableUsageOutputParameterContentProvider extends
		VariableUsageContentProvider {

	@Override
	public Object[] getChildren(Object parent) {
		/**
		 * Signatur
		 */
		if (parent instanceof OperationSignature) {
			OperationSignature signature = (OperationSignature) parent;
			ArrayList<Parameter> outputParameter = new ArrayList<Parameter>();
			for (Parameter p : signature.getParameters__OperationSignature()) {
				if (p.getModifier__Parameter() == ParameterModifier.OUT || 
					p.getModifier__Parameter() == ParameterModifier.INOUT){
					outputParameter.add(p);
				}
			}
			if (signature.getReturnType__OperationSignature() != null){
				Parameter ret = RepositoryFactory.eINSTANCE.createParameter();
				ret.setDatatype__Parameter(signature.getReturnType__OperationSignature());
				ret.setParameterName("RETURN");
				outputParameter.add(ret);
			}
			return outputParameter.toArray();
		} else 
			return super.getChildren(parent);
	}

}