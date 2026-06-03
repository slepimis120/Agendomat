/**
 */
package agendomat.impl;

import agendomat.Agenda;
import agendomat.AgendomatFactory;
import agendomat.AgendomatPackage;
import agendomat.Break;
import agendomat.Equipment;
import agendomat.Event;
import agendomat.Location;
import agendomat.LocationType;
import agendomat.PermanentEquipment;
import agendomat.Person;
import agendomat.ProgramItem;
import agendomat.Role;
import agendomat.Session;
import agendomat.Talk;
import agendomat.TemporaryEquipment;

import agendomat.util.AgendomatValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgendomatPackageImpl extends EPackageImpl implements AgendomatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass talkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permanentEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporaryEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

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
	 * @see agendomat.AgendomatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgendomatPackageImpl() {
		super(eNS_URI, AgendomatFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgendomatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgendomatPackage init() {
		if (isInited) return (AgendomatPackage)EPackage.Registry.INSTANCE.getEPackage(AgendomatPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgendomatPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AgendomatPackageImpl theAgendomatPackage = registeredAgendomatPackage instanceof AgendomatPackageImpl ? (AgendomatPackageImpl)registeredAgendomatPackage : new AgendomatPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAgendomatPackage.createPackageContents();

		// Initialize created meta-data
		theAgendomatPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAgendomatPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AgendomatValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAgendomatPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgendomatPackage.eNS_URI, theAgendomatPackage);
		return theAgendomatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_EventName() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_EventStartDate() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_EventEndDate() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Desc() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Persons() {
		return (EReference)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_ProgramItems() {
		return (EReference)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Locations() {
		return (EReference)eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_PermanentEquipment() {
		return (EReference)eventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvent__UniqueLocationNames__DiagnosticChain_Map() {
		return eventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramItem() {
		return programItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramItem_StartTime() {
		return (EAttribute)programItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramItem_EndTime() {
		return (EAttribute)programItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramItem_Location() {
		return (EReference)programItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_SessionName() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSession_Talks() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSession_TechSupport() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSession_Equipment() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSession__SessionLocationMustBeRoom__DiagnosticChain_Map() {
		return sessionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSession__EndTimeAfterStartTime__DiagnosticChain_Map() {
		return sessionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSession__TechSupportMustHaveRole__DiagnosticChain_Map() {
		return sessionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTalk() {
		return talkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTalk_TalkName() {
		return (EAttribute)talkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTalk_TalkStartTime() {
		return (EAttribute)talkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTalk_TalkEndTime() {
		return (EAttribute)talkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTalk_Presenters() {
		return (EReference)talkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTalk__EndTimeAfterStartTime__DiagnosticChain_Map() {
		return talkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTalk__PresentersMustBePresenter__DiagnosticChain_Map() {
		return talkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBreak() {
		return breakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBreak_BreakName() {
		return (EAttribute)breakEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBreak_Animators() {
		return (EReference)breakEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBreak__AnimatorsMustHaveRole__DiagnosticChain_Map() {
		return breakEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBreak__BreakLocationMustBeBreakArea__DiagnosticChain_Map() {
		return breakEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBreak__EndTimeAfterStartTime__DiagnosticChain_Map() {
		return breakEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PersonName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Email() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Organization() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Roles() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_LocationName() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_LocationType() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquipment() {
		return equipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_EquipmentName() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_EquipmentType() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermanentEquipment() {
		return permanentEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporaryEquipment() {
		return temporaryEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgenda() {
		return agendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenda_AgendaName() {
		return (EAttribute)agendaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenda_AgendaStartDate() {
		return (EAttribute)agendaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenda_AgendaEndDate() {
		return (EAttribute)agendaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgenda_Desc() {
		return (EAttribute)agendaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgenda_Events() {
		return (EReference)agendaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocationType() {
		return locationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgendomatFactory getAgendomatFactory() {
		return (AgendomatFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__EVENT_NAME);
		createEAttribute(eventEClass, EVENT__EVENT_START_DATE);
		createEAttribute(eventEClass, EVENT__EVENT_END_DATE);
		createEAttribute(eventEClass, EVENT__DESC);
		createEReference(eventEClass, EVENT__PERSONS);
		createEReference(eventEClass, EVENT__PROGRAM_ITEMS);
		createEReference(eventEClass, EVENT__LOCATIONS);
		createEReference(eventEClass, EVENT__PERMANENT_EQUIPMENT);
		createEOperation(eventEClass, EVENT___UNIQUE_LOCATION_NAMES__DIAGNOSTICCHAIN_MAP);

		programItemEClass = createEClass(PROGRAM_ITEM);
		createEAttribute(programItemEClass, PROGRAM_ITEM__START_TIME);
		createEAttribute(programItemEClass, PROGRAM_ITEM__END_TIME);
		createEReference(programItemEClass, PROGRAM_ITEM__LOCATION);

		sessionEClass = createEClass(SESSION);
		createEAttribute(sessionEClass, SESSION__SESSION_NAME);
		createEReference(sessionEClass, SESSION__TALKS);
		createEReference(sessionEClass, SESSION__TECH_SUPPORT);
		createEReference(sessionEClass, SESSION__EQUIPMENT);
		createEOperation(sessionEClass, SESSION___SESSION_LOCATION_MUST_BE_ROOM__DIAGNOSTICCHAIN_MAP);
		createEOperation(sessionEClass, SESSION___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP);
		createEOperation(sessionEClass, SESSION___TECH_SUPPORT_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP);

		talkEClass = createEClass(TALK);
		createEAttribute(talkEClass, TALK__TALK_NAME);
		createEAttribute(talkEClass, TALK__TALK_START_TIME);
		createEAttribute(talkEClass, TALK__TALK_END_TIME);
		createEReference(talkEClass, TALK__PRESENTERS);
		createEOperation(talkEClass, TALK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP);
		createEOperation(talkEClass, TALK___PRESENTERS_MUST_BE_PRESENTER__DIAGNOSTICCHAIN_MAP);

		breakEClass = createEClass(BREAK);
		createEAttribute(breakEClass, BREAK__BREAK_NAME);
		createEReference(breakEClass, BREAK__ANIMATORS);
		createEOperation(breakEClass, BREAK___ANIMATORS_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(breakEClass, BREAK___BREAK_LOCATION_MUST_BE_BREAK_AREA__DIAGNOSTICCHAIN_MAP);
		createEOperation(breakEClass, BREAK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__PERSON_NAME);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEAttribute(personEClass, PERSON__ORGANIZATION);
		createEAttribute(personEClass, PERSON__ROLES);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LOCATION_NAME);
		createEAttribute(locationEClass, LOCATION__LOCATION_TYPE);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__EQUIPMENT_NAME);
		createEAttribute(equipmentEClass, EQUIPMENT__EQUIPMENT_TYPE);

		permanentEquipmentEClass = createEClass(PERMANENT_EQUIPMENT);

		temporaryEquipmentEClass = createEClass(TEMPORARY_EQUIPMENT);

		agendaEClass = createEClass(AGENDA);
		createEAttribute(agendaEClass, AGENDA__AGENDA_NAME);
		createEAttribute(agendaEClass, AGENDA__AGENDA_START_DATE);
		createEAttribute(agendaEClass, AGENDA__AGENDA_END_DATE);
		createEAttribute(agendaEClass, AGENDA__DESC);
		createEReference(agendaEClass, AGENDA__EVENTS);

		// Create enums
		locationTypeEEnum = createEEnum(LOCATION_TYPE);
		roleEEnum = createEEnum(ROLE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sessionEClass.getESuperTypes().add(this.getProgramItem());
		breakEClass.getESuperTypes().add(this.getProgramItem());
		permanentEquipmentEClass.getESuperTypes().add(this.getEquipment());
		temporaryEquipmentEClass.getESuperTypes().add(this.getEquipment());

		// Initialize classes, features, and operations; add parameters
		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_EventName(), ecorePackage.getEString(), "eventName", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_EventStartDate(), ecorePackage.getEString(), "eventStartDate", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_EventEndDate(), ecorePackage.getEString(), "eventEndDate", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Persons(), this.getPerson(), null, "persons", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_ProgramItems(), this.getProgramItem(), null, "programItems", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Locations(), this.getLocation(), null, "locations", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_PermanentEquipment(), this.getPermanentEquipment(), null, "permanentEquipment", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEvent__UniqueLocationNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueLocationNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(programItemEClass, ProgramItem.class, "ProgramItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramItem_StartTime(), ecorePackage.getEString(), "startTime", null, 1, 1, ProgramItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramItem_EndTime(), ecorePackage.getEString(), "endTime", null, 1, 1, ProgramItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramItem_Location(), this.getLocation(), null, "location", null, 1, 1, ProgramItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSession_SessionName(), ecorePackage.getEString(), "sessionName", null, 1, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_Talks(), this.getTalk(), null, "talks", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_TechSupport(), this.getPerson(), null, "techSupport", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_Equipment(), this.getTemporaryEquipment(), null, "equipment", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSession__SessionLocationMustBeRoom__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sessionLocationMustBeRoom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__EndTimeAfterStartTime__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "endTimeAfterStartTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__TechSupportMustHaveRole__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "techSupportMustHaveRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(talkEClass, Talk.class, "Talk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTalk_TalkName(), ecorePackage.getEString(), "talkName", null, 1, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalk_TalkStartTime(), ecorePackage.getEString(), "talkStartTime", null, 1, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTalk_TalkEndTime(), ecorePackage.getEString(), "talkEndTime", null, 1, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTalk_Presenters(), this.getPerson(), null, "presenters", null, 1, -1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTalk__EndTimeAfterStartTime__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "endTimeAfterStartTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTalk__PresentersMustBePresenter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "presentersMustBePresenter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreak_BreakName(), ecorePackage.getEString(), "breakName", null, 1, 1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBreak_Animators(), this.getPerson(), null, "animators", null, 0, -1, Break.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBreak__AnimatorsMustHaveRole__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "animatorsMustHaveRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBreak__BreakLocationMustBeBreakArea__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "breakLocationMustBeBreakArea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBreak__EndTimeAfterStartTime__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "endTimeAfterStartTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_PersonName(), ecorePackage.getEString(), "personName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Email(), ecorePackage.getEString(), "email", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Organization(), ecorePackage.getEString(), "organization", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Roles(), this.getRole(), "roles", null, 1, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_LocationName(), ecorePackage.getEString(), "locationName", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_LocationType(), this.getLocationType(), "locationType", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_EquipmentName(), ecorePackage.getEString(), "equipmentName", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquipment_EquipmentType(), ecorePackage.getEString(), "equipmentType", null, 0, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permanentEquipmentEClass, PermanentEquipment.class, "PermanentEquipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporaryEquipmentEClass, TemporaryEquipment.class, "TemporaryEquipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agendaEClass, Agenda.class, "Agenda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgenda_AgendaName(), ecorePackage.getEString(), "agendaName", null, 1, 1, Agenda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgenda_AgendaStartDate(), ecorePackage.getEString(), "agendaStartDate", null, 0, 1, Agenda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgenda_AgendaEndDate(), ecorePackage.getEString(), "agendaEndDate", null, 0, 1, Agenda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgenda_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Agenda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgenda_Events(), this.getEvent(), null, "events", null, 0, -1, Agenda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(locationTypeEEnum, LocationType.class, "LocationType");
		addEEnumLiteral(locationTypeEEnum, LocationType.ROOM);
		addEEnumLiteral(locationTypeEEnum, LocationType.BREAK_AREA);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.PRESENTER);
		addEEnumLiteral(roleEEnum, Role.TECH_SUPPORT);
		addEEnumLiteral(roleEEnum, Role.ANIMATOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueLocationNames"
		   });
		addAnnotation
		  (sessionEClass,
		   source,
		   new String[] {
			   "constraints", "techSupportMustHaveRole"
		   });
		addAnnotation
		  (talkEClass,
		   source,
		   new String[] {
			   "constraints", "presentersMustBePresenter"
		   });
		addAnnotation
		  (breakEClass,
		   source,
		   new String[] {
			   "constraints", "endTimeAfterStartTime"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getEvent__UniqueLocationNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tlocations->isUnique(locationName)"
		   });
		addAnnotation
		  (getSession__SessionLocationMustBeRoom__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tlocation.locationType = LocationType::Room"
		   });
		addAnnotation
		  (getSession__EndTimeAfterStartTime__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tendTime > startTime"
		   });
		addAnnotation
		  (getSession__TechSupportMustHaveRole__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\ttechSupport->forAll(p | p.roles->includes(Role::TechSupport))"
		   });
		addAnnotation
		  (getTalk__EndTimeAfterStartTime__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\ttalkEndTime > talkStartTime"
		   });
		addAnnotation
		  (getTalk__PresentersMustBePresenter__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tpresenters->forAll(p | p.roles->includes(Role::Presenter))"
		   });
		addAnnotation
		  (getBreak__AnimatorsMustHaveRole__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tanimators->forAll(p | p.roles->includes(Role::Animator))"
		   });
		addAnnotation
		  (getBreak__BreakLocationMustBeBreakArea__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tlocation.locationType = LocationType::BreakArea"
		   });
		addAnnotation
		  (getBreak__EndTimeAfterStartTime__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tendTime > startTime"
		   });
	}

} //AgendomatPackageImpl
