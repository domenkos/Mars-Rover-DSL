/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal.marsRover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>color indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.robotFinal.marsRover.color_indication#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.robotFinal.marsRover.color_indication#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getcolor_indication()
 * @model
 * @generated
 */
public interface color_indication extends EObject
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
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getcolor_indication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.robotFinal.marsRover.color_indication#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.robotFinal.marsRover.LED_Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.xtext.robotFinal.marsRover.LED_Color
   * @see #setColor(LED_Color)
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#getcolor_indication_Color()
   * @model
   * @generated
   */
  LED_Color getColor();

  /**
   * Sets the value of the '{@link org.xtext.robotFinal.marsRover.color_indication#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.xtext.robotFinal.marsRover.LED_Color
   * @see #getColor()
   * @generated
   */
  void setColor(LED_Color value);

} // color_indication
