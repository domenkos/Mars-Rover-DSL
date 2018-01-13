/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal.marsRover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>detect lakes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.robotFinal.marsRover.detect_lakes#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.detect_lakes#getNumber_of_lakes <em>Number of lakes</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.detect_lakes#getLakes_colors <em>Lakes colors</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.detect_lakes#getAfter_examinating <em>After examinating</em>}</li>
 * </ul>
 *
 * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getdetect_lakes()
 * @model
 * @generated
 */
public interface detect_lakes extends EObject
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
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getdetect_lakes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.robotFinal.marsRover.detect_lakes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Number of lakes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number of lakes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number of lakes</em>' attribute.
   * @see #setNumber_of_lakes(int)
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getdetect_lakes_Number_of_lakes()
   * @model
   * @generated
   */
  int getNumber_of_lakes();

  /**
   * Sets the value of the '{@link org.xtext.robotFinal.marsRover.detect_lakes#getNumber_of_lakes <em>Number of lakes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number of lakes</em>' attribute.
   * @see #getNumber_of_lakes()
   * @generated
   */
  void setNumber_of_lakes(int value);

  /**
   * Returns the value of the '<em><b>Lakes colors</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.robotFinal.marsRover.Color}.
   * The literals are from the enumeration {@link org.xtext.robotFinal.marsRover.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lakes colors</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lakes colors</em>' attribute list.
   * @see org.xtext.robotFinal.marsRover.Color
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getdetect_lakes_Lakes_colors()
   * @model unique="false"
   * @generated
   */
  EList<Color> getLakes_colors();

  /**
   * Returns the value of the '<em><b>After examinating</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After examinating</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After examinating</em>' containment reference.
   * @see #setAfter_examinating(after_action)
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getdetect_lakes_After_examinating()
   * @model containment="true"
   * @generated
   */
  after_action getAfter_examinating();

  /**
   * Sets the value of the '{@link org.xtext.robotFinal.marsRover.detect_lakes#getAfter_examinating <em>After examinating</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After examinating</em>' containment reference.
   * @see #getAfter_examinating()
   * @generated
   */
  void setAfter_examinating(after_action value);

} // detect_lakes