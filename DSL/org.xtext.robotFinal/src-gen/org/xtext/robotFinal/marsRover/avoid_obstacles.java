/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal.marsRover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>avoid obstacles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.robotFinal.marsRover.avoid_obstacles#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.avoid_obstacles#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getavoid_obstacles()
 * @model
 * @generated
 */
public interface avoid_obstacles extends EObject
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
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getavoid_obstacles_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.robotFinal.marsRover.avoid_obstacles#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensors</em>' containment reference list.
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getavoid_obstacles_Sensors()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getSensors();

} // avoid_obstacles