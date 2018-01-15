/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal.marsRover.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.robotFinal.marsRover.Color;
import org.xtext.robotFinal.marsRover.LED_Color;
import org.xtext.robotFinal.marsRover.MarsRoverFactory;
import org.xtext.robotFinal.marsRover.MarsRoverPackage;
import org.xtext.robotFinal.marsRover.Robot;
import org.xtext.robotFinal.marsRover.after_action;
import org.xtext.robotFinal.marsRover.avoid_lakes;
import org.xtext.robotFinal.marsRover.avoid_obstacles;
import org.xtext.robotFinal.marsRover.bumpers;
import org.xtext.robotFinal.marsRover.color_indication;
import org.xtext.robotFinal.marsRover.detect_lakes;
import org.xtext.robotFinal.marsRover.detect_rocks;
import org.xtext.robotFinal.marsRover.indication;
import org.xtext.robotFinal.marsRover.message;
import org.xtext.robotFinal.marsRover.mission;
import org.xtext.robotFinal.marsRover.park;
import org.xtext.robotFinal.marsRover.push_obstacles;
import org.xtext.robotFinal.marsRover.sound;
import org.xtext.robotFinal.marsRover.ultra;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarsRoverPackageImpl extends EPackageImpl implements MarsRoverPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass robotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass missionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avoid_obstaclesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ultraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bumpersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detect_lakesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detect_rocksEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass push_obstaclesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass after_actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass soundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass color_indicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avoid_lakesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum leD_ColorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.robotFinal.marsRover.MarsRoverPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MarsRoverPackageImpl()
  {
    super(eNS_URI, MarsRoverFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MarsRoverPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MarsRoverPackage init()
  {
    if (isInited) return (MarsRoverPackage)EPackage.Registry.INSTANCE.getEPackage(MarsRoverPackage.eNS_URI);

    // Obtain or create and register package
    MarsRoverPackageImpl theMarsRoverPackage = (MarsRoverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarsRoverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarsRoverPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMarsRoverPackage.createPackageContents();

    // Initialize created meta-data
    theMarsRoverPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMarsRoverPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MarsRoverPackage.eNS_URI, theMarsRoverPackage);
    return theMarsRoverPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRobot()
  {
    return robotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRobot_Name()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRobot_Slave_address()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRobot_Drive_speed()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRobot_Special_speed()
  {
    return (EAttribute)robotEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobot_Missions()
  {
    return (EReference)robotEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmission()
  {
    return missionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmission_Name()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmission_Type()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getavoid_obstacles()
  {
    return avoid_obstaclesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getavoid_obstacles_Name()
  {
    return (EAttribute)avoid_obstaclesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getavoid_obstacles_Sensors()
  {
    return (EReference)avoid_obstaclesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getultra()
  {
    return ultraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getultra_Name()
  {
    return (EAttribute)ultraEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getultra_Distance()
  {
    return (EAttribute)ultraEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbumpers()
  {
    return bumpersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbumpers_Name()
  {
    return (EAttribute)bumpersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdetect_lakes()
  {
    return detect_lakesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdetect_lakes_Name()
  {
    return (EAttribute)detect_lakesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdetect_lakes_Number_of_lakes()
  {
    return (EAttribute)detect_lakesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdetect_lakes_Lakes_colors()
  {
    return (EAttribute)detect_lakesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdetect_lakes_After_examinating()
  {
    return (EReference)detect_lakesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdetect_rocks()
  {
    return detect_rocksEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdetect_rocks_Name()
  {
    return (EAttribute)detect_rocksEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdetect_rocks_Number_of_rocks()
  {
    return (EAttribute)detect_rocksEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdetect_rocks_After_examinating()
  {
    return (EReference)detect_rocksEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpush_obstacles()
  {
    return push_obstaclesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpush_obstacles_Name()
  {
    return (EAttribute)push_obstaclesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getafter_action()
  {
    return after_actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getafter_action_Action()
  {
    return (EAttribute)after_actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getafter_action_Indicate()
  {
    return (EReference)after_actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getindication()
  {
    return indicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getindication_Name()
  {
    return (EAttribute)indicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getindication_Type()
  {
    return (EReference)indicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsound()
  {
    return soundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsound_Name()
  {
    return (EAttribute)soundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsound_Duration()
  {
    return (EAttribute)soundEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsound_Frequency()
  {
    return (EAttribute)soundEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmessage_Name()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmessage_Msg()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcolor_indication()
  {
    return color_indicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcolor_indication_Name()
  {
    return (EAttribute)color_indicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcolor_indication_Color()
  {
    return (EAttribute)color_indicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpark()
  {
    return parkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpark_Name()
  {
    return (EAttribute)parkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getavoid_lakes()
  {
    return avoid_lakesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getavoid_lakes_Name()
  {
    return (EAttribute)avoid_lakesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLED_Color()
  {
    return leD_ColorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarsRoverFactory getMarsRoverFactory()
  {
    return (MarsRoverFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    robotEClass = createEClass(ROBOT);
    createEAttribute(robotEClass, ROBOT__NAME);
    createEAttribute(robotEClass, ROBOT__SLAVE_ADDRESS);
    createEAttribute(robotEClass, ROBOT__DRIVE_SPEED);
    createEAttribute(robotEClass, ROBOT__SPECIAL_SPEED);
    createEReference(robotEClass, ROBOT__MISSIONS);

    missionEClass = createEClass(MISSION);
    createEAttribute(missionEClass, MISSION__NAME);
    createEReference(missionEClass, MISSION__TYPE);

    avoid_obstaclesEClass = createEClass(AVOID_OBSTACLES);
    createEAttribute(avoid_obstaclesEClass, AVOID_OBSTACLES__NAME);
    createEReference(avoid_obstaclesEClass, AVOID_OBSTACLES__SENSORS);

    ultraEClass = createEClass(ULTRA);
    createEAttribute(ultraEClass, ULTRA__NAME);
    createEAttribute(ultraEClass, ULTRA__DISTANCE);

    bumpersEClass = createEClass(BUMPERS);
    createEAttribute(bumpersEClass, BUMPERS__NAME);

    detect_lakesEClass = createEClass(DETECT_LAKES);
    createEAttribute(detect_lakesEClass, DETECT_LAKES__NAME);
    createEAttribute(detect_lakesEClass, DETECT_LAKES__NUMBER_OF_LAKES);
    createEAttribute(detect_lakesEClass, DETECT_LAKES__LAKES_COLORS);
    createEReference(detect_lakesEClass, DETECT_LAKES__AFTER_EXAMINATING);

    detect_rocksEClass = createEClass(DETECT_ROCKS);
    createEAttribute(detect_rocksEClass, DETECT_ROCKS__NAME);
    createEAttribute(detect_rocksEClass, DETECT_ROCKS__NUMBER_OF_ROCKS);
    createEReference(detect_rocksEClass, DETECT_ROCKS__AFTER_EXAMINATING);

    push_obstaclesEClass = createEClass(PUSH_OBSTACLES);
    createEAttribute(push_obstaclesEClass, PUSH_OBSTACLES__NAME);

    after_actionEClass = createEClass(AFTER_ACTION);
    createEAttribute(after_actionEClass, AFTER_ACTION__ACTION);
    createEReference(after_actionEClass, AFTER_ACTION__INDICATE);

    indicationEClass = createEClass(INDICATION);
    createEAttribute(indicationEClass, INDICATION__NAME);
    createEReference(indicationEClass, INDICATION__TYPE);

    soundEClass = createEClass(SOUND);
    createEAttribute(soundEClass, SOUND__NAME);
    createEAttribute(soundEClass, SOUND__DURATION);
    createEAttribute(soundEClass, SOUND__FREQUENCY);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__NAME);
    createEAttribute(messageEClass, MESSAGE__MSG);

    color_indicationEClass = createEClass(COLOR_INDICATION);
    createEAttribute(color_indicationEClass, COLOR_INDICATION__NAME);
    createEAttribute(color_indicationEClass, COLOR_INDICATION__COLOR);

    parkEClass = createEClass(PARK);
    createEAttribute(parkEClass, PARK__NAME);

    avoid_lakesEClass = createEClass(AVOID_LAKES);
    createEAttribute(avoid_lakesEClass, AVOID_LAKES__NAME);

    // Create enums
    colorEEnum = createEEnum(COLOR);
    leD_ColorEEnum = createEEnum(LED_COLOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRobot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRobot_Slave_address(), ecorePackage.getEString(), "slave_address", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRobot_Drive_speed(), ecorePackage.getEInt(), "drive_speed", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRobot_Special_speed(), ecorePackage.getEInt(), "special_speed", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobot_Missions(), this.getmission(), null, "missions", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(missionEClass, mission.class, "mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmission_Name(), ecorePackage.getEString(), "name", null, 0, 1, mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmission_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avoid_obstaclesEClass, avoid_obstacles.class, "avoid_obstacles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getavoid_obstacles_Name(), ecorePackage.getEString(), "name", null, 0, 1, avoid_obstacles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getavoid_obstacles_Sensors(), ecorePackage.getEObject(), null, "sensors", null, 0, -1, avoid_obstacles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ultraEClass, ultra.class, "ultra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getultra_Name(), ecorePackage.getEString(), "name", null, 0, 1, ultra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getultra_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, ultra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bumpersEClass, bumpers.class, "bumpers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbumpers_Name(), ecorePackage.getEString(), "name", null, 0, 1, bumpers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(detect_lakesEClass, detect_lakes.class, "detect_lakes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdetect_lakes_Name(), ecorePackage.getEString(), "name", null, 0, 1, detect_lakes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdetect_lakes_Number_of_lakes(), ecorePackage.getEInt(), "number_of_lakes", null, 0, 1, detect_lakes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdetect_lakes_Lakes_colors(), this.getColor(), "lakes_colors", null, 0, -1, detect_lakes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdetect_lakes_After_examinating(), this.getafter_action(), null, "after_examinating", null, 0, 1, detect_lakes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(detect_rocksEClass, detect_rocks.class, "detect_rocks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdetect_rocks_Name(), ecorePackage.getEString(), "name", null, 0, 1, detect_rocks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdetect_rocks_Number_of_rocks(), ecorePackage.getEInt(), "number_of_rocks", null, 0, 1, detect_rocks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdetect_rocks_After_examinating(), this.getafter_action(), null, "after_examinating", null, 0, 1, detect_rocks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(push_obstaclesEClass, push_obstacles.class, "push_obstacles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpush_obstacles_Name(), ecorePackage.getEString(), "name", null, 0, 1, push_obstacles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(after_actionEClass, after_action.class, "after_action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getafter_action_Action(), ecorePackage.getEString(), "action", null, 0, 1, after_action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getafter_action_Indicate(), this.getindication(), null, "indicate", null, 0, -1, after_action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indicationEClass, indication.class, "indication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getindication_Name(), ecorePackage.getEString(), "name", null, 0, 1, indication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getindication_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, indication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(soundEClass, sound.class, "sound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsound_Name(), ecorePackage.getEString(), "name", null, 0, 1, sound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsound_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, sound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsound_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, sound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, message.class, "message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmessage_Msg(), ecorePackage.getEString(), "msg", null, 0, 1, message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(color_indicationEClass, color_indication.class, "color_indication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcolor_indication_Name(), ecorePackage.getEString(), "name", null, 0, 1, color_indication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcolor_indication_Color(), this.getLED_Color(), "color", null, 0, 1, color_indication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parkEClass, park.class, "park", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpark_Name(), ecorePackage.getEString(), "name", null, 0, 1, park.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avoid_lakesEClass, avoid_lakes.class, "avoid_lakes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getavoid_lakes_Name(), ecorePackage.getEString(), "name", null, 0, 1, avoid_lakes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.COLOR_RED);
    addEEnumLiteral(colorEEnum, Color.COLOR_BLUE);
    addEEnumLiteral(colorEEnum, Color.COLOR_GREEN);
    addEEnumLiteral(colorEEnum, Color.COLOR_ORANGE);
    addEEnumLiteral(colorEEnum, Color.COLOR_WHITE);
    addEEnumLiteral(colorEEnum, Color.COLOR_BLACK);
    addEEnumLiteral(colorEEnum, Color.COLOR_OFF);

    initEEnum(leD_ColorEEnum, LED_Color.class, "LED_Color");
    addEEnumLiteral(leD_ColorEEnum, LED_Color.LED_ORANGE);
    addEEnumLiteral(leD_ColorEEnum, LED_Color.LED_RED);
    addEEnumLiteral(leD_ColorEEnum, LED_Color.LED_GREEN);
    addEEnumLiteral(leD_ColorEEnum, LED_Color.LED_OFF);

    // Create resource
    createResource(eNS_URI);
  }

} //MarsRoverPackageImpl
