/**
 */
package agendomat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see agendomat.AgendomatFactory
 * @model kind="package"
 * @generated
 */
public interface AgendomatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agendomat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://agendomat/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agendomat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgendomatPackage eINSTANCE = agendomat.impl.AgendomatPackageImpl.init();

	/**
	 * The meta object id for the '{@link agendomat.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.EventImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SESSIONS = 3;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PERSONS = 4;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EQUIPMENT = 5;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.SessionImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Presenter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__PRESENTER = 4;

	/**
	 * The feature id for the '<em><b>Tech Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TECH_SUPPORT = 5;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__NEEDS = 6;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.PersonImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.EquipmentImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link agendomat.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see agendomat.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see agendomat.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Event#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see agendomat.Event#getDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Date();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see agendomat.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Event#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see agendomat.Event#getSessions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Sessions();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Event#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see agendomat.Event#getPersons()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Event#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment</em>'.
	 * @see agendomat.Event#getEquipment()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Equipment();

	/**
	 * Returns the meta object for class '{@link agendomat.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see agendomat.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Session#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see agendomat.Session#getTitle()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_Title();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Session#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see agendomat.Session#getStartTime()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Session#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see agendomat.Session#getEndTime()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Session#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see agendomat.Session#getLocation()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_Location();

	/**
	 * Returns the meta object for the reference '{@link agendomat.Session#getPresenter <em>Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presenter</em>'.
	 * @see agendomat.Session#getPresenter()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Presenter();

	/**
	 * Returns the meta object for the reference '{@link agendomat.Session#getTechSupport <em>Tech Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tech Support</em>'.
	 * @see agendomat.Session#getTechSupport()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_TechSupport();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Session#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needs</em>'.
	 * @see agendomat.Session#getNeeds()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Needs();

	/**
	 * Returns the meta object for class '{@link agendomat.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see agendomat.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see agendomat.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see agendomat.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Role();

	/**
	 * Returns the meta object for class '{@link agendomat.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see agendomat.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Equipment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see agendomat.Equipment#getName()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Name();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Equipment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see agendomat.Equipment#getType()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgendomatFactory getAgendomatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link agendomat.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.EventImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATE = eINSTANCE.getEvent_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SESSIONS = eINSTANCE.getEvent_Sessions();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PERSONS = eINSTANCE.getEvent_Persons();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__EQUIPMENT = eINSTANCE.getEvent_Equipment();

		/**
		 * The meta object literal for the '{@link agendomat.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.SessionImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__TITLE = eINSTANCE.getSession_Title();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__START_TIME = eINSTANCE.getSession_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__END_TIME = eINSTANCE.getSession_EndTime();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__LOCATION = eINSTANCE.getSession_Location();

		/**
		 * The meta object literal for the '<em><b>Presenter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__PRESENTER = eINSTANCE.getSession_Presenter();

		/**
		 * The meta object literal for the '<em><b>Tech Support</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__TECH_SUPPORT = eINSTANCE.getSession_TechSupport();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__NEEDS = eINSTANCE.getSession_Needs();

		/**
		 * The meta object literal for the '{@link agendomat.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.PersonImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '{@link agendomat.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.EquipmentImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__NAME = eINSTANCE.getEquipment_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__TYPE = eINSTANCE.getEquipment_Type();

	}

} //AgendomatPackage
