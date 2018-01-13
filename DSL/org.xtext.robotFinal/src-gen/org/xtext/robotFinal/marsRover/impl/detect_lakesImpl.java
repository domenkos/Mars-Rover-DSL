/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal.marsRover.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.robotFinal.marsRover.Color;
import org.xtext.robotFinal.marsRover.MarsRoverPackage;
import org.xtext.robotFinal.marsRover.after_action;
import org.xtext.robotFinal.marsRover.detect_lakes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>detect lakes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.robotFinal.marsRover.impl.detect_lakesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.impl.detect_lakesImpl#getNumber_of_lakes <em>Number of lakes</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.impl.detect_lakesImpl#getLakes_colors <em>Lakes colors</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.impl.detect_lakesImpl#getAfter_examinating <em>After examinating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class detect_lakesImpl extends MinimalEObjectImpl.Container implements detect_lakes
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumber_of_lakes() <em>Number of lakes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_of_lakes()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_LAKES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber_of_lakes() <em>Number of lakes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber_of_lakes()
   * @generated
   * @ordered
   */
  protected int number_of_lakes = NUMBER_OF_LAKES_EDEFAULT;

  /**
   * The cached value of the '{@link #getLakes_colors() <em>Lakes colors</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLakes_colors()
   * @generated
   * @ordered
   */
  protected EList<Color> lakes_colors;

  /**
   * The cached value of the '{@link #getAfter_examinating() <em>After examinating</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter_examinating()
   * @generated
   * @ordered
   */
  protected after_action after_examinating;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected detect_lakesImpl()
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
    return MarsRoverPackage.Literals.DETECT_LAKES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarsRoverPackage.DETECT_LAKES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumber_of_lakes()
  {
    return number_of_lakes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber_of_lakes(int newNumber_of_lakes)
  {
    int oldNumber_of_lakes = number_of_lakes;
    number_of_lakes = newNumber_of_lakes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarsRoverPackage.DETECT_LAKES__NUMBER_OF_LAKES, oldNumber_of_lakes, number_of_lakes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getLakes_colors()
  {
    if (lakes_colors == null)
    {
      lakes_colors = new EDataTypeEList<Color>(Color.class, this, MarsRoverPackage.DETECT_LAKES__LAKES_COLORS);
    }
    return lakes_colors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public after_action getAfter_examinating()
  {
    return after_examinating;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAfter_examinating(after_action newAfter_examinating, NotificationChain msgs)
  {
    after_action oldAfter_examinating = after_examinating;
    after_examinating = newAfter_examinating;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING, oldAfter_examinating, newAfter_examinating);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter_examinating(after_action newAfter_examinating)
  {
    if (newAfter_examinating != after_examinating)
    {
      NotificationChain msgs = null;
      if (after_examinating != null)
        msgs = ((InternalEObject)after_examinating).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING, null, msgs);
      if (newAfter_examinating != null)
        msgs = ((InternalEObject)newAfter_examinating).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING, null, msgs);
      msgs = basicSetAfter_examinating(newAfter_examinating, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING, newAfter_examinating, newAfter_examinating));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING:
        return basicSetAfter_examinating(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MarsRoverPackage.DETECT_LAKES__NAME:
        return getName();
      case MarsRoverPackage.DETECT_LAKES__NUMBER_OF_LAKES:
        return getNumber_of_lakes();
      case MarsRoverPackage.DETECT_LAKES__LAKES_COLORS:
        return getLakes_colors();
      case MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING:
        return getAfter_examinating();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MarsRoverPackage.DETECT_LAKES__NAME:
        setName((String)newValue);
        return;
      case MarsRoverPackage.DETECT_LAKES__NUMBER_OF_LAKES:
        setNumber_of_lakes((Integer)newValue);
        return;
      case MarsRoverPackage.DETECT_LAKES__LAKES_COLORS:
        getLakes_colors().clear();
        getLakes_colors().addAll((Collection<? extends Color>)newValue);
        return;
      case MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING:
        setAfter_examinating((after_action)newValue);
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
      case MarsRoverPackage.DETECT_LAKES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MarsRoverPackage.DETECT_LAKES__NUMBER_OF_LAKES:
        setNumber_of_lakes(NUMBER_OF_LAKES_EDEFAULT);
        return;
      case MarsRoverPackage.DETECT_LAKES__LAKES_COLORS:
        getLakes_colors().clear();
        return;
      case MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING:
        setAfter_examinating((after_action)null);
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
      case MarsRoverPackage.DETECT_LAKES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MarsRoverPackage.DETECT_LAKES__NUMBER_OF_LAKES:
        return number_of_lakes != NUMBER_OF_LAKES_EDEFAULT;
      case MarsRoverPackage.DETECT_LAKES__LAKES_COLORS:
        return lakes_colors != null && !lakes_colors.isEmpty();
      case MarsRoverPackage.DETECT_LAKES__AFTER_EXAMINATING:
        return after_examinating != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", number_of_lakes: ");
    result.append(number_of_lakes);
    result.append(", lakes_colors: ");
    result.append(lakes_colors);
    result.append(')');
    return result.toString();
  }

} //detect_lakesImpl
