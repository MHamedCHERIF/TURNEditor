/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stub Out Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.StubOutPath#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.StubOutPath#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.StubOutPath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getStubOutPath()
 * @model
 * @generated
 */
public interface StubOutPath extends EObject
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getStubOutPath_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.StubOutPath#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getStubOutPath_Threshold()
   * @model
   * @generated
   */
  int getThreshold();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.StubOutPath#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(int value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(PathBody)
   * @see org.xtext.project.turn.turn.TurnPackage#getStubOutPath_Path()
   * @model containment="true"
   * @generated
   */
  PathBody getPath();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.StubOutPath#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(PathBody value);

} // StubOutPath
