/**
 */
package agendomat.util;

import agendomat.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see agendomat.AgendomatPackage
 * @generated
 */
public class AgendomatValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AgendomatValidator INSTANCE = new AgendomatValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "agendomat";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Location Names' of 'Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EVENT__UNIQUE_LOCATION_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Session Location Must Be Room' of 'Session'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SESSION__SESSION_LOCATION_MUST_BE_ROOM = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'End Time After Start Time' of 'Session'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SESSION__END_TIME_AFTER_START_TIME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tech Support Must Have Role' of 'Session'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SESSION__TECH_SUPPORT_MUST_HAVE_ROLE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'End Time After Start Time' of 'Talk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TALK__END_TIME_AFTER_START_TIME = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Presenters Must Be Presenter' of 'Talk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TALK__PRESENTERS_MUST_BE_PRESENTER = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Animators Must Have Role' of 'Break'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAK__ANIMATORS_MUST_HAVE_ROLE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Break Location Must Be Break Area' of 'Break'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAK__BREAK_LOCATION_MUST_BE_BREAK_AREA = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'End Time After Start Time' of 'Break'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAK__END_TIME_AFTER_START_TIME = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendomatValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AgendomatPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AgendomatPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case AgendomatPackage.PROGRAM_ITEM:
				return validateProgramItem((ProgramItem)value, diagnostics, context);
			case AgendomatPackage.SESSION:
				return validateSession((Session)value, diagnostics, context);
			case AgendomatPackage.TALK:
				return validateTalk((Talk)value, diagnostics, context);
			case AgendomatPackage.BREAK:
				return validateBreak((Break)value, diagnostics, context);
			case AgendomatPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case AgendomatPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case AgendomatPackage.EQUIPMENT:
				return validateEquipment((Equipment)value, diagnostics, context);
			case AgendomatPackage.PERMANENT_EQUIPMENT:
				return validatePermanentEquipment((PermanentEquipment)value, diagnostics, context);
			case AgendomatPackage.TEMPORARY_EQUIPMENT:
				return validateTemporaryEquipment((TemporaryEquipment)value, diagnostics, context);
			case AgendomatPackage.AGENDA:
				return validateAgenda((Agenda)value, diagnostics, context);
			case AgendomatPackage.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case AgendomatPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvent_uniqueLocationNames(event, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueLocationNames constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_uniqueLocationNames(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return event.uniqueLocationNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramItem(ProgramItem programItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSession(Session session, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(session, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(session, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(session, diagnostics, context);
		if (result || diagnostics != null) result &= validateSession_techSupportMustHaveRole(session, diagnostics, context);
		if (result || diagnostics != null) result &= validateSession_sessionLocationMustBeRoom(session, diagnostics, context);
		if (result || diagnostics != null) result &= validateSession_endTimeAfterStartTime(session, diagnostics, context);
		return result;
	}

	/**
	 * Validates the techSupportMustHaveRole constraint of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSession_techSupportMustHaveRole(Session session, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return session.techSupportMustHaveRole(diagnostics, context);
	}

	/**
	 * Validates the sessionLocationMustBeRoom constraint of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSession_sessionLocationMustBeRoom(Session session, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return session.sessionLocationMustBeRoom(diagnostics, context);
	}

	/**
	 * Validates the endTimeAfterStartTime constraint of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSession_endTimeAfterStartTime(Session session, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return session.endTimeAfterStartTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTalk(Talk talk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(talk, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validateTalk_presentersMustBePresenter(talk, diagnostics, context);
		if (result || diagnostics != null) result &= validateTalk_endTimeAfterStartTime(talk, diagnostics, context);
		return result;
	}

	/**
	 * Validates the presentersMustBePresenter constraint of '<em>Talk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTalk_presentersMustBePresenter(Talk talk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return talk.presentersMustBePresenter(diagnostics, context);
	}

	/**
	 * Validates the endTimeAfterStartTime constraint of '<em>Talk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTalk_endTimeAfterStartTime(Talk talk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return talk.endTimeAfterStartTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak(Break break_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(break_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validateBreak_endTimeAfterStartTime(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validateBreak_animatorsMustHaveRole(break_, diagnostics, context);
		if (result || diagnostics != null) result &= validateBreak_breakLocationMustBeBreakArea(break_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the endTimeAfterStartTime constraint of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak_endTimeAfterStartTime(Break break_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return break_.endTimeAfterStartTime(diagnostics, context);
	}

	/**
	 * Validates the animatorsMustHaveRole constraint of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak_animatorsMustHaveRole(Break break_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return break_.animatorsMustHaveRole(diagnostics, context);
	}

	/**
	 * Validates the breakLocationMustBeBreakArea constraint of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak_breakLocationMustBeBreakArea(Break break_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return break_.breakLocationMustBeBreakArea(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipment(Equipment equipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermanentEquipment(PermanentEquipment permanentEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(permanentEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporaryEquipment(TemporaryEquipment temporaryEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporaryEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgenda(Agenda agenda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(agenda, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AgendomatValidator
