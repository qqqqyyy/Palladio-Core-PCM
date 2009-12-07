/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.sourcecodedecorator.loggerlink;

import de.uka.ipd.sdq.pcm.seff.LoopAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Logging Position Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.sourcecodedecorator.loggerlink.LoopLoggingPositionLink#getLinkedLoopAction <em>Linked Loop Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.sourcecodedecorator.loggerlink.LoggerlinkPackage#getLoopLoggingPositionLink()
 * @model
 * @generated
 */
public interface LoopLoggingPositionLink extends OutputLoggingPositionLink {
	/**
	 * Returns the value of the '<em><b>Linked Loop Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Loop Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Loop Action</em>' reference.
	 * @see #setLinkedLoopAction(LoopAction)
	 * @see de.uka.ipd.sdq.pcm.sourcecodedecorator.loggerlink.LoggerlinkPackage#getLoopLoggingPositionLink_LinkedLoopAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LoopAction getLinkedLoopAction();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.sourcecodedecorator.loggerlink.LoopLoggingPositionLink#getLinkedLoopAction <em>Linked Loop Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Loop Action</em>' reference.
	 * @see #getLinkedLoopAction()
	 * @generated
	 */
	void setLinkedLoopAction(LoopAction value);

} // LoopLoggingPositionLink