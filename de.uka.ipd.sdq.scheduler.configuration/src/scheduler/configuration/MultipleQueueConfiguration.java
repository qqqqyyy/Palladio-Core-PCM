/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package scheduler.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Queue Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scheduler.configuration.MultipleQueueConfiguration#getLoadBalancing <em>Load Balancing</em>}</li>
 * </ul>
 * </p>
 *
 * @see scheduler.configuration.ConfigurationPackage#getMultipleQueueConfiguration()
 * @model
 * @generated
 */
public interface MultipleQueueConfiguration extends QueueingConfiguration {
	/**
	 * Returns the value of the '<em><b>Load Balancing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balancing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancing</em>' containment reference.
	 * @see #setLoadBalancing(LoadBalancing)
	 * @see scheduler.configuration.ConfigurationPackage#getMultipleQueueConfiguration_LoadBalancing()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	LoadBalancing getLoadBalancing();

	/**
	 * Sets the value of the '{@link scheduler.configuration.MultipleQueueConfiguration#getLoadBalancing <em>Load Balancing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancing</em>' containment reference.
	 * @see #getLoadBalancing()
	 * @generated
	 */
	void setLoadBalancing(LoadBalancing value);

} // MultipleQueueConfiguration
