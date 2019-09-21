/**
 * generated by Xtext 2.18.0
 */
package org.jucmnav.turn.turn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jucmnav.turn.turn.Connect;
import org.jucmnav.turn.turn.ConnectElement;
import org.jucmnav.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.jucmnav.turn.turn.impl.ConnectImpl#getConnectsTo <em>Connects To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectImpl extends PathBodyNodeImpl implements Connect
{
  /**
   * The cached value of the '{@link #getConnectsTo() <em>Connects To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectsTo()
   * @generated
   * @ordered
   */
  protected ConnectElement connectsTo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TurnPackage.Literals.CONNECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectElement getConnectsTo()
  {
    if (connectsTo != null && connectsTo.eIsProxy())
    {
      InternalEObject oldConnectsTo = (InternalEObject)connectsTo;
      connectsTo = (ConnectElement)eResolveProxy(oldConnectsTo);
      if (connectsTo != oldConnectsTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.CONNECT__CONNECTS_TO, oldConnectsTo, connectsTo));
      }
    }
    return connectsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectElement basicGetConnectsTo()
  {
    return connectsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectsTo(ConnectElement newConnectsTo)
  {
    ConnectElement oldConnectsTo = connectsTo;
    connectsTo = newConnectsTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONNECT__CONNECTS_TO, oldConnectsTo, connectsTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TurnPackage.CONNECT__CONNECTS_TO:
        if (resolve) return getConnectsTo();
        return basicGetConnectsTo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TurnPackage.CONNECT__CONNECTS_TO:
        setConnectsTo((ConnectElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TurnPackage.CONNECT__CONNECTS_TO:
        setConnectsTo((ConnectElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TurnPackage.CONNECT__CONNECTS_TO:
        return connectsTo != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectImpl