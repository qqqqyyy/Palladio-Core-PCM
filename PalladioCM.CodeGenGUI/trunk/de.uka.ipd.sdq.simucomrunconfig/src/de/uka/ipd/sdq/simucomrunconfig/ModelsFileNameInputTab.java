package de.uka.ipd.sdq.simucomrunconfig;

import java.io.File;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.actions.ImportResourcesAction;
import org.eclipse.core.filesystem.*;
import org.eclipse.core.resources.*;
/**
 * @author admin
 * 
 */
public class ModelsFileNameInputTab extends AbstractLaunchConfigurationTab {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		return ResourceManagerTab.getModelsListImage();
	}
	/**
	 * TODO
	 * The default value for the 'width' attribute.
	 */
	//public static String REPOSITORY_FILE;
	//public static String SYSTEM_FILE;
	//public static String ALLOCATION_FILE;
	//public static String USAGE_FILE;
	

	//The default value for the button Name.
	private final String BUTTON_NAME = "Browse...";

	/**
	 * The default value for the 'height' Layout attribute.
	 */
	private final int LAYOUT_WIDTH = 554;

	/**
	 * Set the file extensions which the dialog will use to filter the files it
	 * shows to the argument.
	 */
	private final String[] REPOSITORY_EXTENSION = new String[] { "*.repository" };
	private final String[] SYSTEM_EXTENSION = new String[] { "*.system" };
	private final String[] ALLOCATION_EXTENSION = new String[] { "*.allocation" };
	private final String[] USAGEMODEL_EXTENSION = new String[] { "*.usagemodel" };
	
	private Text textRepository;
	private Text textSystem;
	private Text textAllocation;
	private Text textUsage;
	


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());
		
		// Create reposetory section
		final Group repositoryFileGroup = new Group(container, SWT.NONE);
		final GridLayout glReposetoryGroup = new GridLayout();
		glReposetoryGroup.numColumns = 2;
		repositoryFileGroup.setLayout(glReposetoryGroup);
		repositoryFileGroup.setText("Repository File");
		repositoryFileGroup.setLayoutData(new GridData(LAYOUT_WIDTH,
				SWT.DEFAULT));

		textRepository = new Text(repositoryFileGroup, SWT.SINGLE
				| SWT.BORDER);
		textRepository.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));

		final Button buttonRepository = new Button(repositoryFileGroup,
				SWT.NONE);
		buttonRepository.setText(BUTTON_NAME);
		buttonRepository.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				textRepository.setText(openFileDialog(e, REPOSITORY_EXTENSION));
			}
		});

		// Create system Section
		final Group systemFileGroup = new Group(container, SWT.NONE);
		final GridLayout glFileGroup = new GridLayout();
		glFileGroup.numColumns = 2;
		systemFileGroup.setLayout(glFileGroup);
		systemFileGroup.setText("System File");
		systemFileGroup.setLayoutData(new GridData(LAYOUT_WIDTH, SWT.DEFAULT));

		textSystem = new Text(systemFileGroup, SWT.SINGLE
				| SWT.BORDER);
		textSystem
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		final Button buttonSystem = new Button(systemFileGroup, SWT.NONE);
		buttonSystem.setText(BUTTON_NAME);
		buttonSystem.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				textSystem.setText(openFileDialog(e, SYSTEM_EXTENSION));
			}
		});

		// Create allocation section
		final Group allocationFileGroup = new Group(container, SWT.NONE);
		final GridLayout dlAllocationGroup = new GridLayout();
		dlAllocationGroup.numColumns = 2;
		allocationFileGroup.setLayout(dlAllocationGroup);
		allocationFileGroup.setText("Allocation File");
		allocationFileGroup.setLayoutData(new GridData(LAYOUT_WIDTH,
				SWT.DEFAULT));

		textAllocation = new Text(allocationFileGroup, SWT.SINGLE
				| SWT.BORDER);
		textAllocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));

		final Button buttonAllocation = new Button(allocationFileGroup,
				SWT.NONE);
		buttonAllocation.setText(BUTTON_NAME);
		buttonAllocation.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				textAllocation.setText(openFileDialog(e, ALLOCATION_EXTENSION));
			}
		});

		// Create usage section
		final Group usageFileGroup = new Group(container, SWT.NONE);
		final GridLayout glUsageGroup = new GridLayout();
		glUsageGroup.numColumns = 2;
		usageFileGroup.setLayout(glUsageGroup);
		usageFileGroup.setText("Usage File");
		usageFileGroup.setLayoutData(new GridData(LAYOUT_WIDTH, SWT.DEFAULT));

		textUsage = new Text(usageFileGroup, SWT.SINGLE | SWT.BORDER);
		textUsage
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		final Button buttonUsage = new Button(usageFileGroup, SWT.NONE);
		buttonUsage.setText(BUTTON_NAME);
		buttonUsage.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				textUsage.setText(openFileDialog(e, USAGEMODEL_EXTENSION));
			}
		});

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Models file";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		/*textAllocation.setText("");
		textRepository.setText("");
		textSystem.setText("");
		textUsage.setText("");*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		
	//	IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	//	IProject project = root.getProject(ResourceManagerTab.getGeneretePluginPath());
	//	System.err.println(project.getFullPath().toString());
		
		
		// TODO Entscheiden, wo m�ssen die Attribute gespeichert werden!!!
		/*configuration.setAttribute(REPOSITORY_FILE, textRepository.getText());
		configuration.setAttribute(SYSTEM_FILE, textSystem.getText());
		configuration.setAttribute(ALLOCATION_FILE, textAllocation.getText());
		configuration.setAttribute(USAGE_FILE, textUsage.getText());*/

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}
	/**
	 * The function calls the FileDialog and give back absolute path on the file as String
	 * 
	 * @param shell which will be the parent of the new instance
	 * @param extensions which the dialog will use to filter the files it shows to the argument
	 * @return absolute path to a file
	 */
	private String openFileDialog(SelectionEvent e, String[] extensions) {

		Shell shell = e.display.getActiveShell();
		String filename = "";

		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(extensions);
		dialog.setText("Select model file");

		if (dialog.open() != null) {
			String root = dialog.getFilterPath() + File.separatorChar;
			filename = root + dialog.getFileName();
		}
		return filename;
	}
}
