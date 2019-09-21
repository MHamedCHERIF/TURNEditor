/**
 * generated by Xtext 2.18.0
 */
package org.jucmnav.turn.turn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.jucmnav.turn.turn.Text#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.jucmnav.turn.turn.TurnPackage#getText()
 * @model
 * @generated
 */
public interface Text extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute list.
   * @see org.jucmnav.turn.turn.TurnPackage#getText_Content()
   * @model unique="false"
   * @generated
   */
  EList<String> getContent();

} // Text