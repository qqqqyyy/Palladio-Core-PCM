package de.uka.ipd.sdq.codegen.ejb;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuConfigurationTab;
import de.uka.ipd.sdq.workflow.launchconfig.ConstantsContainer;


public class CodeGenerationConfigurationTab extends SimuConfigurationTab {
	
	protected Combo comboModelToTextTarget;

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		final ModifyListener modifyListener = new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				CodeGenerationConfigurationTab.this.setDirty(true);
				CodeGenerationConfigurationTab.this.updateLaunchConfigurationDialog();
			}
		};
		
		Composite container = (Composite) getControl();
		
		comboModelToTextTarget = new Combo (container, SWT.READ_ONLY);
		comboModelToTextTarget.setItems (new String [] {
				ConstantsContainer.MODEL_TO_TEXT_TARGET_EJB,
				ConstantsContainer.MODEL_TO_TEXT_TARGET_PROTO
				});
		comboModelToTextTarget.setSize (400, 200);
		comboModelToTextTarget.addModifyListener(modifyListener);
		
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		super.initializeFrom(configuration);
		
		try{
			String solverStr = configuration.getAttribute(ConstantsContainer.MODEL_TO_TEXT_CHOICE, 
					ConstantsContainer.MODEL_TO_TEXT_TARGET_EJB);
			String[] items = comboModelToTextTarget.getItems();
			for (int i=0; i<items.length; i++){
				String str = items[i];
				if (str.equals(solverStr)){
					comboModelToTextTarget.select(i);
				}
			}
		} catch(CoreException e){
			comboModelToTextTarget.select(0);
		}
		
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		super.performApply(configuration);
		
		configuration.setAttribute(ConstantsContainer.MODEL_TO_TEXT_CHOICE,
				comboModelToTextTarget.getText());
		
	}

	
	
}
