/**
 */
package agendomat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Event Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_START_DATE = 1;

	/**
	 * The feature id for the '<em><b>Event End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESC = 3;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PERSONS = 4;

	/**
	 * The feature id for the '<em><b>Program Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROGRAM_ITEMS = 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOCATIONS = 6;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.ProgramItemImpl <em>Program Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.ProgramItemImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getProgramItem()
	 * @generated
	 */
	int PROGRAM_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Program Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Program Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.SessionImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 2;

	/**
	 * The feature id for the '<em><b>Session Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESSION_NAME = PROGRAM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__START_TIME = PROGRAM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__END_TIME = PROGRAM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__LOCATION = PROGRAM_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TALKS = PROGRAM_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tech Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TECH_SUPPORT = PROGRAM_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__EQUIPMENT = PROGRAM_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = PROGRAM_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = PROGRAM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.TalkImpl <em>Talk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.TalkImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getTalk()
	 * @generated
	 */
	int TALK = 3;

	/**
	 * The feature id for the '<em><b>Talk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TALK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Talk Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TALK_START_TIME = 1;

	/**
	 * The feature id for the '<em><b>Talk End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TALK_END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Presenters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__PRESENTERS = 3;

	/**
	 * The number of structural features of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.BreakImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 4;

	/**
	 * The feature id for the '<em><b>Break Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__BREAK_NAME = PROGRAM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__START_TIME = PROGRAM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__END_TIME = PROGRAM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__LOCATION = PROGRAM_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Animators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__ANIMATORS = PROGRAM_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = PROGRAM_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = PROGRAM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.PersonImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_NAME = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = 1;

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
	 * The meta object id for the '{@link agendomat.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.LocationImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.EquipmentImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 7;

	/**
	 * The feature id for the '<em><b>Equipment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__EQUIPMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Equipment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__EQUIPMENT_TYPE = 1;

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
	 * The meta object id for the '{@link agendomat.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.LocationType
	 * @see agendomat.impl.AgendomatPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 8;

	/**
	 * The meta object id for the '{@link agendomat.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.Role
	 * @see agendomat.impl.AgendomatPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 9;


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
	 * Returns the meta object for the attribute '{@link agendomat.Event#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see agendomat.Event#getEventName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventName();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Event#getEventStartDate <em>Event Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Start Date</em>'.
	 * @see agendomat.Event#getEventStartDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventStartDate();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Event#getEventEndDate <em>Event End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event End Date</em>'.
	 * @see agendomat.Event#getEventEndDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventEndDate();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Event#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see agendomat.Event#getDesc()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Desc();

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
	 * Returns the meta object for the containment reference list '{@link agendomat.Event#getProgramItems <em>Program Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program Items</em>'.
	 * @see agendomat.Event#getProgramItems()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ProgramItems();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Event#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see agendomat.Event#getLocations()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Locations();

	/**
	 * Returns the meta object for class '{@link agendomat.ProgramItem <em>Program Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Item</em>'.
	 * @see agendomat.ProgramItem
	 * @generated
	 */
	EClass getProgramItem();

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
	 * Returns the meta object for the attribute '{@link agendomat.Session#getSessionName <em>Session Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Name</em>'.
	 * @see agendomat.Session#getSessionName()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_SessionName();

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
	 * Returns the meta object for the reference '{@link agendomat.Session#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see agendomat.Session#getLocation()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Session#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Talks</em>'.
	 * @see agendomat.Session#getTalks()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Talks();

	/**
	 * Returns the meta object for the reference list '{@link agendomat.Session#getTechSupport <em>Tech Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tech Support</em>'.
	 * @see agendomat.Session#getTechSupport()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_TechSupport();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Session#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipment</em>'.
	 * @see agendomat.Session#getEquipment()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Equipment();

	/**
	 * Returns the meta object for class '{@link agendomat.Talk <em>Talk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Talk</em>'.
	 * @see agendomat.Talk
	 * @generated
	 */
	EClass getTalk();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Talk#getTalkName <em>Talk Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Talk Name</em>'.
	 * @see agendomat.Talk#getTalkName()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_TalkName();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Talk#getTalkStartTime <em>Talk Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Talk Start Time</em>'.
	 * @see agendomat.Talk#getTalkStartTime()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_TalkStartTime();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Talk#getTalkEndTime <em>Talk End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Talk End Time</em>'.
	 * @see agendomat.Talk#getTalkEndTime()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_TalkEndTime();

	/**
	 * Returns the meta object for the reference list '{@link agendomat.Talk#getPresenters <em>Presenters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Presenters</em>'.
	 * @see agendomat.Talk#getPresenters()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Presenters();

	/**
	 * Returns the meta object for class '{@link agendomat.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see agendomat.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Break#getBreakName <em>Break Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Name</em>'.
	 * @see agendomat.Break#getBreakName()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_BreakName();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Break#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see agendomat.Break#getStartTime()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Break#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see agendomat.Break#getEndTime()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_EndTime();

	/**
	 * Returns the meta object for the reference '{@link agendomat.Break#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see agendomat.Break#getLocation()
	 * @see #getBreak()
	 * @generated
	 */
	EReference getBreak_Location();

	/**
	 * Returns the meta object for the reference list '{@link agendomat.Break#getAnimators <em>Animators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Animators</em>'.
	 * @see agendomat.Break#getAnimators()
	 * @see #getBreak()
	 * @generated
	 */
	EReference getBreak_Animators();

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
	 * Returns the meta object for the attribute '{@link agendomat.Person#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see agendomat.Person#getPersonName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonName();

	/**
	 * Returns the meta object for the attribute list '{@link agendomat.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see agendomat.Person#getRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Roles();

	/**
	 * Returns the meta object for class '{@link agendomat.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see agendomat.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Location#getLocationName <em>Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Name</em>'.
	 * @see agendomat.Location#getLocationName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocationName();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Location#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Type</em>'.
	 * @see agendomat.Location#getLocationType()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocationType();

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
	 * Returns the meta object for the attribute '{@link agendomat.Equipment#getEquipmentName <em>Equipment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equipment Name</em>'.
	 * @see agendomat.Equipment#getEquipmentName()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_EquipmentName();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Equipment#getEquipmentType <em>Equipment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equipment Type</em>'.
	 * @see agendomat.Equipment#getEquipmentType()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_EquipmentType();

	/**
	 * Returns the meta object for enum '{@link agendomat.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see agendomat.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link agendomat.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see agendomat.Role
	 * @generated
	 */
	EEnum getRole();

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
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Event Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_START_DATE = eINSTANCE.getEvent_EventStartDate();

		/**
		 * The meta object literal for the '<em><b>Event End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_END_DATE = eINSTANCE.getEvent_EventEndDate();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESC = eINSTANCE.getEvent_Desc();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PERSONS = eINSTANCE.getEvent_Persons();

		/**
		 * The meta object literal for the '<em><b>Program Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PROGRAM_ITEMS = eINSTANCE.getEvent_ProgramItems();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__LOCATIONS = eINSTANCE.getEvent_Locations();

		/**
		 * The meta object literal for the '{@link agendomat.impl.ProgramItemImpl <em>Program Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.ProgramItemImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getProgramItem()
		 * @generated
		 */
		EClass PROGRAM_ITEM = eINSTANCE.getProgramItem();

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
		 * The meta object literal for the '<em><b>Session Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__SESSION_NAME = eINSTANCE.getSession_SessionName();

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
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__LOCATION = eINSTANCE.getSession_Location();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__TALKS = eINSTANCE.getSession_Talks();

		/**
		 * The meta object literal for the '<em><b>Tech Support</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__TECH_SUPPORT = eINSTANCE.getSession_TechSupport();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__EQUIPMENT = eINSTANCE.getSession_Equipment();

		/**
		 * The meta object literal for the '{@link agendomat.impl.TalkImpl <em>Talk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.TalkImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getTalk()
		 * @generated
		 */
		EClass TALK = eINSTANCE.getTalk();

		/**
		 * The meta object literal for the '<em><b>Talk Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__TALK_NAME = eINSTANCE.getTalk_TalkName();

		/**
		 * The meta object literal for the '<em><b>Talk Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__TALK_START_TIME = eINSTANCE.getTalk_TalkStartTime();

		/**
		 * The meta object literal for the '<em><b>Talk End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__TALK_END_TIME = eINSTANCE.getTalk_TalkEndTime();

		/**
		 * The meta object literal for the '<em><b>Presenters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__PRESENTERS = eINSTANCE.getTalk_Presenters();

		/**
		 * The meta object literal for the '{@link agendomat.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.BreakImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '<em><b>Break Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__BREAK_NAME = eINSTANCE.getBreak_BreakName();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__START_TIME = eINSTANCE.getBreak_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__END_TIME = eINSTANCE.getBreak_EndTime();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK__LOCATION = eINSTANCE.getBreak_Location();

		/**
		 * The meta object literal for the '<em><b>Animators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK__ANIMATORS = eINSTANCE.getBreak_Animators();

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
		 * The meta object literal for the '<em><b>Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_NAME = eINSTANCE.getPerson_PersonName();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ROLES = eINSTANCE.getPerson_Roles();

		/**
		 * The meta object literal for the '{@link agendomat.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.LocationImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION_NAME = eINSTANCE.getLocation_LocationName();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION_TYPE = eINSTANCE.getLocation_LocationType();

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
		 * The meta object literal for the '<em><b>Equipment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__EQUIPMENT_NAME = eINSTANCE.getEquipment_EquipmentName();

		/**
		 * The meta object literal for the '<em><b>Equipment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__EQUIPMENT_TYPE = eINSTANCE.getEquipment_EquipmentType();

		/**
		 * The meta object literal for the '{@link agendomat.LocationType <em>Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.LocationType
		 * @see agendomat.impl.AgendomatPackageImpl#getLocationType()
		 * @generated
		 */
		EEnum LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '{@link agendomat.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.Role
		 * @see agendomat.impl.AgendomatPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //AgendomatPackage
