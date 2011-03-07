/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LqnCore.tests;

import junit.textui.TestRunner;
import LqnCore.LqnCoreFactory;
import LqnCore.TaskActivityGraph;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskActivityGraphTest extends ActivityGraphBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskActivityGraphTest.class);
	}

	/**
	 * Constructs a new Task Activity Graph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActivityGraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Activity Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskActivityGraph getFixture() {
		return (TaskActivityGraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LqnCoreFactory.eINSTANCE.createTaskActivityGraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TaskActivityGraphTest
