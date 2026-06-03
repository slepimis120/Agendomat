/**
 */
package agendomat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
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
	 * The feature id for the '<em><b>Permanent Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PERMANENT_EQUIPMENT = 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Unique Location Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___UNIQUE_LOCATION_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ITEM__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ITEM__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ITEM__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Program Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ITEM_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__START_TIME = PROGRAM_ITEM__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__END_TIME = PROGRAM_ITEM__END_TIME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__LOCATION = PROGRAM_ITEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Session Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__SESSION_NAME = PROGRAM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TALKS = PROGRAM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tech Support</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TECH_SUPPORT = PROGRAM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__EQUIPMENT = PROGRAM_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = PROGRAM_ITEM_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Session Location Must Be Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___SESSION_LOCATION_MUST_BE_ROOM__DIAGNOSTICCHAIN_MAP = PROGRAM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>End Time After Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP = PROGRAM_ITEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Tech Support Must Have Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___TECH_SUPPORT_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP = PROGRAM_ITEM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = PROGRAM_ITEM_OPERATION_COUNT + 3;

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
	 * The operation id for the '<em>End Time After Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Presenters Must Be Presenter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK___PRESENTERS_MUST_BE_PRESENTER__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_OPERATION_COUNT = 2;

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
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__START_TIME = PROGRAM_ITEM__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__END_TIME = PROGRAM_ITEM__END_TIME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__LOCATION = PROGRAM_ITEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Break Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__BREAK_NAME = PROGRAM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Animators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__ANIMATORS = PROGRAM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = PROGRAM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Animators Must Have Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK___ANIMATORS_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP = PROGRAM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Break Location Must Be Break Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK___BREAK_LOCATION_MUST_BE_BREAK_AREA__DIAGNOSTICCHAIN_MAP = PROGRAM_ITEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>End Time After Start Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP = PROGRAM_ITEM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = PROGRAM_ITEM_OPERATION_COUNT + 3;

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
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATION = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link agendomat.impl.PermanentEquipmentImpl <em>Permanent Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.PermanentEquipmentImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getPermanentEquipment()
	 * @generated
	 */
	int PERMANENT_EQUIPMENT = 8;

	/**
	 * The feature id for the '<em><b>Equipment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EQUIPMENT__EQUIPMENT_NAME = EQUIPMENT__EQUIPMENT_NAME;

	/**
	 * The feature id for the '<em><b>Equipment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EQUIPMENT__EQUIPMENT_TYPE = EQUIPMENT__EQUIPMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Permanent Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Permanent Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EQUIPMENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.TemporaryEquipmentImpl <em>Temporary Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.TemporaryEquipmentImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getTemporaryEquipment()
	 * @generated
	 */
	int TEMPORARY_EQUIPMENT = 9;

	/**
	 * The feature id for the '<em><b>Equipment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORARY_EQUIPMENT__EQUIPMENT_NAME = EQUIPMENT__EQUIPMENT_NAME;

	/**
	 * The feature id for the '<em><b>Equipment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORARY_EQUIPMENT__EQUIPMENT_TYPE = EQUIPMENT__EQUIPMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Temporary Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORARY_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporary Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORARY_EQUIPMENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link agendomat.impl.AgendaImpl <em>Agenda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.impl.AgendaImpl
	 * @see agendomat.impl.AgendomatPackageImpl#getAgenda()
	 * @generated
	 */
	int AGENDA = 10;

	/**
	 * The feature id for the '<em><b>Agenda Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__AGENDA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Agenda Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__AGENDA_START_DATE = 1;

	/**
	 * The feature id for the '<em><b>Agenda End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__AGENDA_END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__DESC = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__EVENTS = 4;

	/**
	 * The number of structural features of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link agendomat.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.LocationType
	 * @see agendomat.impl.AgendomatPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link agendomat.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see agendomat.Role
	 * @see agendomat.impl.AgendomatPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 12;


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
	 * Returns the meta object for the containment reference list '{@link agendomat.Event#getPermanentEquipment <em>Permanent Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permanent Equipment</em>'.
	 * @see agendomat.Event#getPermanentEquipment()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_PermanentEquipment();

	/**
	 * Returns the meta object for the '{@link agendomat.Event#uniqueLocationNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Location Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Location Names</em>' operation.
	 * @see agendomat.Event#uniqueLocationNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEvent__UniqueLocationNames__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link agendomat.ProgramItem#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see agendomat.ProgramItem#getStartTime()
	 * @see #getProgramItem()
	 * @generated
	 */
	EAttribute getProgramItem_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.ProgramItem#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see agendomat.ProgramItem#getEndTime()
	 * @see #getProgramItem()
	 * @generated
	 */
	EAttribute getProgramItem_EndTime();

	/**
	 * Returns the meta object for the reference '{@link agendomat.ProgramItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see agendomat.ProgramItem#getLocation()
	 * @see #getProgramItem()
	 * @generated
	 */
	EReference getProgramItem_Location();

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
	 * Returns the meta object for the '{@link agendomat.Session#sessionLocationMustBeRoom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Session Location Must Be Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Session Location Must Be Room</em>' operation.
	 * @see agendomat.Session#sessionLocationMustBeRoom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSession__SessionLocationMustBeRoom__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link agendomat.Session#endTimeAfterStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>End Time After Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End Time After Start Time</em>' operation.
	 * @see agendomat.Session#endTimeAfterStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSession__EndTimeAfterStartTime__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link agendomat.Session#techSupportMustHaveRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tech Support Must Have Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tech Support Must Have Role</em>' operation.
	 * @see agendomat.Session#techSupportMustHaveRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSession__TechSupportMustHaveRole__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link agendomat.Talk#endTimeAfterStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>End Time After Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End Time After Start Time</em>' operation.
	 * @see agendomat.Talk#endTimeAfterStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTalk__EndTimeAfterStartTime__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link agendomat.Talk#presentersMustBePresenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Presenters Must Be Presenter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Presenters Must Be Presenter</em>' operation.
	 * @see agendomat.Talk#presentersMustBePresenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTalk__PresentersMustBePresenter__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link agendomat.Break#animatorsMustHaveRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Animators Must Have Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Animators Must Have Role</em>' operation.
	 * @see agendomat.Break#animatorsMustHaveRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBreak__AnimatorsMustHaveRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link agendomat.Break#breakLocationMustBeBreakArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Break Location Must Be Break Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Break Location Must Be Break Area</em>' operation.
	 * @see agendomat.Break#breakLocationMustBeBreakArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBreak__BreakLocationMustBeBreakArea__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link agendomat.Break#endTimeAfterStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>End Time After Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End Time After Start Time</em>' operation.
	 * @see agendomat.Break#endTimeAfterStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBreak__EndTimeAfterStartTime__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link agendomat.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see agendomat.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see agendomat.Person#getOrganization()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Organization();

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
	 * Returns the meta object for class '{@link agendomat.PermanentEquipment <em>Permanent Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permanent Equipment</em>'.
	 * @see agendomat.PermanentEquipment
	 * @generated
	 */
	EClass getPermanentEquipment();

	/**
	 * Returns the meta object for class '{@link agendomat.TemporaryEquipment <em>Temporary Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporary Equipment</em>'.
	 * @see agendomat.TemporaryEquipment
	 * @generated
	 */
	EClass getTemporaryEquipment();

	/**
	 * Returns the meta object for class '{@link agendomat.Agenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda</em>'.
	 * @see agendomat.Agenda
	 * @generated
	 */
	EClass getAgenda();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Agenda#getAgendaName <em>Agenda Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agenda Name</em>'.
	 * @see agendomat.Agenda#getAgendaName()
	 * @see #getAgenda()
	 * @generated
	 */
	EAttribute getAgenda_AgendaName();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Agenda#getAgendaStartDate <em>Agenda Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agenda Start Date</em>'.
	 * @see agendomat.Agenda#getAgendaStartDate()
	 * @see #getAgenda()
	 * @generated
	 */
	EAttribute getAgenda_AgendaStartDate();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Agenda#getAgendaEndDate <em>Agenda End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agenda End Date</em>'.
	 * @see agendomat.Agenda#getAgendaEndDate()
	 * @see #getAgenda()
	 * @generated
	 */
	EAttribute getAgenda_AgendaEndDate();

	/**
	 * Returns the meta object for the attribute '{@link agendomat.Agenda#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see agendomat.Agenda#getDesc()
	 * @see #getAgenda()
	 * @generated
	 */
	EAttribute getAgenda_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link agendomat.Agenda#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see agendomat.Agenda#getEvents()
	 * @see #getAgenda()
	 * @generated
	 */
	EReference getAgenda_Events();

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
		 * The meta object literal for the '<em><b>Permanent Equipment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PERMANENT_EQUIPMENT = eINSTANCE.getEvent_PermanentEquipment();

		/**
		 * The meta object literal for the '<em><b>Unique Location Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___UNIQUE_LOCATION_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEvent__UniqueLocationNames__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ITEM__START_TIME = eINSTANCE.getProgramItem_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ITEM__END_TIME = eINSTANCE.getProgramItem_EndTime();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ITEM__LOCATION = eINSTANCE.getProgramItem_Location();

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
		 * The meta object literal for the '<em><b>Session Location Must Be Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___SESSION_LOCATION_MUST_BE_ROOM__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSession__SessionLocationMustBeRoom__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>End Time After Start Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSession__EndTimeAfterStartTime__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tech Support Must Have Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___TECH_SUPPORT_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSession__TechSupportMustHaveRole__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>End Time After Start Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TALK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTalk__EndTimeAfterStartTime__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Presenters Must Be Presenter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TALK___PRESENTERS_MUST_BE_PRESENTER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTalk__PresentersMustBePresenter__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Animators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK__ANIMATORS = eINSTANCE.getBreak_Animators();

		/**
		 * The meta object literal for the '<em><b>Animators Must Have Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BREAK___ANIMATORS_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBreak__AnimatorsMustHaveRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Break Location Must Be Break Area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BREAK___BREAK_LOCATION_MUST_BE_BREAK_AREA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBreak__BreakLocationMustBeBreakArea__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>End Time After Start Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BREAK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBreak__EndTimeAfterStartTime__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ORGANIZATION = eINSTANCE.getPerson_Organization();

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
		 * The meta object literal for the '{@link agendomat.impl.PermanentEquipmentImpl <em>Permanent Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.PermanentEquipmentImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getPermanentEquipment()
		 * @generated
		 */
		EClass PERMANENT_EQUIPMENT = eINSTANCE.getPermanentEquipment();

		/**
		 * The meta object literal for the '{@link agendomat.impl.TemporaryEquipmentImpl <em>Temporary Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.TemporaryEquipmentImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getTemporaryEquipment()
		 * @generated
		 */
		EClass TEMPORARY_EQUIPMENT = eINSTANCE.getTemporaryEquipment();

		/**
		 * The meta object literal for the '{@link agendomat.impl.AgendaImpl <em>Agenda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see agendomat.impl.AgendaImpl
		 * @see agendomat.impl.AgendomatPackageImpl#getAgenda()
		 * @generated
		 */
		EClass AGENDA = eINSTANCE.getAgenda();

		/**
		 * The meta object literal for the '<em><b>Agenda Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA__AGENDA_NAME = eINSTANCE.getAgenda_AgendaName();

		/**
		 * The meta object literal for the '<em><b>Agenda Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA__AGENDA_START_DATE = eINSTANCE.getAgenda_AgendaStartDate();

		/**
		 * The meta object literal for the '<em><b>Agenda End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA__AGENDA_END_DATE = eINSTANCE.getAgenda_AgendaEndDate();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA__DESC = eINSTANCE.getAgenda_Desc();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA__EVENTS = eINSTANCE.getAgenda_Events();

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
