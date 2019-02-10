/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.Contribution#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Contribution#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Contribution#getDest <em>Dest</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Contribution#isCorrelation <em>Correlation</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Contribution#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.Contribution#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends URNmodelElement, ElementLink
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getContribution_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Contribution#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' containment reference.
   * @see #setLongName(LongName)
   * @see org.xtext.project.turn.turn.TurnPackage#getContribution_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Contribution#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference.
   * @see #setDest(IntentionalElement)
   * @see org.xtext.project.turn.turn.TurnPackage#getContribution_Dest()
   * @model
   * @generated
   */
  IntentionalElement getDest();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Contribution#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(IntentionalElement value);

  /**
   * Returns the value of the '<em><b>Correlation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Correlation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Correlation</em>' attribute.
   * @see #setCorrelation(boolean)
   * @see org.xtext.project.turn.turn.TurnPackage#getContribution_Correlation()
   * @model
   * @generated
   */
  boolean isCorrelation();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Contribution#isCorrelation <em>Correlation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Correlation</em>' attribute.
   * @see #isCorrelation()
   * @generated
   */
  void setCorrelation(boolean value);

  /**
   * Returns the value of the '<em><b>Contribution</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.project.turn.turn.ContributionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution</em>' attribute.
   * @see org.xtext.project.turn.turn.ContributionType
   * @see #setContribution(ContributionType)
   * @see org.xtext.project.turn.turn.TurnPackage#getContribution_Contribution()
   * @model
   * @generated
   */
  ContributionType getContribution();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Contribution#getContribution <em>Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution</em>' attribute.
   * @see org.xtext.project.turn.turn.ContributionType
   * @see #getContribution()
   * @generated
   */
  void setContribution(ContributionType value);

  /**
   * Returns the value of the '<em><b>Quantitative Contribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantitative Contribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantitative Contribution</em>' attribute.
   * @see #setQuantitativeContribution(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getContribution_QuantitativeContribution()
   * @model
   * @generated
   */
  int getQuantitativeContribution();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Contribution#getQuantitativeContribution <em>Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantitative Contribution</em>' attribute.
   * @see #getQuantitativeContribution()
   * @generated
   */
  void setQuantitativeContribution(int value);

} // Contribution
