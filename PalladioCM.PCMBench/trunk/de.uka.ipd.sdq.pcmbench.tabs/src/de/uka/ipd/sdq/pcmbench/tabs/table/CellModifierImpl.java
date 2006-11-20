package de.uka.ipd.sdq.pcmbench.tabs.table;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;

import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.repository.Signature;


/**
 * @author roman
 * 
 * This class implements an ICellModifier. An ICellModifier is called when the user modifes a cell in the tableViewer
 */

public class CellModifierImpl implements ICellModifier {
	
	private List columnNames; 	
	private Signature signature;
	
	/**
	 * The transactional editing domain which is used to get the commands and alter the model 
	 */
	final protected TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE
					.getEditingDomain(TabResources.EDITING_DOMAIN_ID);
	
	
	/**
	 * @param columnNames
	 */
	public CellModifierImpl(List columnNames) {
		this.columnNames = columnNames;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(Object element, String property)
	 */
	public boolean canModify(Object element, String property) {
		return true;
	}

	public Object getValue(Object element, String property) {
		    int columnIndex = columnNames.indexOf(property);
			String result = "";
			Signature signature = (Signature)element;
			
			switch (columnIndex) {
				case OperationsTabViewer.ICON_COLUMN_INDEX:
					break;
				case OperationsTabViewer.PARAMETER_COLUMN_INDEX :
					result = setParametersToString(signature.getParameters__Signature());
					break;
				case OperationsTabViewer.RETURNTYPE_COLUMN_INDEX :
					if(signature.getReturntype__Signature() != null){
						result = signature.getReturntype__Signature().getType(); 
					} else result = "void";
					break;
				case OperationsTabViewer.SIGNATURENAME_COLUMN_INDEX :
					result = signature.getServiceName();
					break;
				case OperationsTabViewer.EXCEPTIONS_COLUMN_INDEX :
					result = setParametersToString(signature.getExceptions__Signature());
					break;
				default :
					break; 	
			}
			return result == null ? "" : result;
		}


	public void modify(Object element, String property, Object value) {

		// Find the index of the column 
		int columnIndex	= columnNames.indexOf(property);
		
		Assert.isNotNull(element);
		TableItem item = (TableItem) element;
		signature = (Signature) item.getData();
	
		switch (columnIndex) {
			case OperationsTabViewer.ICON_COLUMN_INDEX : // COMPLETED_COLUMN 
				break;
			case OperationsTabViewer.RETURNTYPE_COLUMN_INDEX : // RETURNTYPE_COLUMN 
				break;
			case OperationsTabViewer.SIGNATURENAME_COLUMN_INDEX : // SERVICENAME_COLUMN
				String valueString = ((String) value).trim();
				textChanged(valueString);
				break;
			case OperationsTabViewer.PARAMETER_COLUMN_INDEX : // OWNEDPARAMETER_COLUMN 
				break;
			case OperationsTabViewer.EXCEPTIONS_COLUMN_INDEX : // EXEPTIONTYPE_COLUM 
				break;
			default :
		}
	}
	
	
	private void textChanged(String valueString) {
		final String value = valueString;
		
		RecordingCommand recCommand = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				signature.setServiceName(value);
			}
		};
		
		if (!value.equals(signature.getServiceName())){
			recCommand.setDescription("Edit Signature Property");
			recCommand.setLabel("Set ServiceName");
			editingDomain.getCommandStack().execute(recCommand);
		}
	}
	
	private String setParametersToString(EList parameters) {
		
		String result = "";
		Parameter parameter;
		
		for(Iterator<Parameter> it = parameters.iterator(); it.hasNext(); ){
			parameter = it.next();
			if(parameter.getDatatype__Parameter() != null){
				result += parameter.getDatatype__Parameter().getType()
				+ " " + parameter.getParameterName() + ", ";
				
			} else result += "void";
		}
		if(!result.equals("") && !result.equals("void")){
			result = result.substring(0, result.length()-2);
		}
		return result;
	}
}
