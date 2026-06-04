/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.AgendomatTables;
import agendomat.Location;
import agendomat.LocationType;
import agendomat.Person;
import agendomat.Role;
import agendomat.Session;
import agendomat.Talk;
import agendomat.TemporaryEquipment;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.SessionImpl#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getTalks <em>Talks</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getTechSupport <em>Tech Support</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionImpl extends ProgramItemImpl implements Session {
	/**
	 * The default value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionName()
	 * @generated
	 * @ordered
	 */
	protected String sessionName = SESSION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTalks() <em>Talks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalks()
	 * @generated
	 * @ordered
	 */
	protected EList<Talk> talks;

	/**
	 * The cached value of the '{@link #getTechSupport() <em>Tech Support</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> techSupport;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporaryEquipment> equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionName() {
		return sessionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionName(String newSessionName) {
		String oldSessionName = sessionName;
		sessionName = newSessionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__SESSION_NAME, oldSessionName, sessionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Talk> getTalks() {
		if (talks == null) {
			talks = new EObjectContainmentEList<Talk>(Talk.class, this, AgendomatPackage.SESSION__TALKS);
		}
		return talks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getTechSupport() {
		if (techSupport == null) {
			techSupport = new EObjectResolvingEList<Person>(Person.class, this, AgendomatPackage.SESSION__TECH_SUPPORT);
		}
		return techSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporaryEquipment> getEquipment() {
		if (equipment == null) {
			equipment = new EObjectContainmentEList<TemporaryEquipment>(TemporaryEquipment.class, this, AgendomatPackage.SESSION__EQUIPMENT);
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean sessionLocationMustBeRoom(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Session::sessionLocationMustBeRoom";
		try {
			/**
			 *
			 * inv sessionLocationMustBeRoom:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = location.locationType = LocationType::Room
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.SESSION___SESSION_LOCATION_MUST_BE_ROOM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Location location = this.getLocation();
				final /*@NonInvalid*/ LocationType locationType = location.getLocationType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_locationType = AgendomatTables.ENUMid_LocationType.getEnumerationLiteralId(ClassUtil.nonNullState(locationType.getName()));
				final /*@NonInvalid*/ boolean result = BOXED_locationType == AgendomatTables.ELITid_Room;
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AgendomatTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean endTimeAfterStartTime(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Session::endTimeAfterStartTime";
		try {
			/**
			 *
			 * inv endTimeAfterStartTime:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = endTime > startTime
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.SESSION___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ String endTime = this.getEndTime();
				final /*@NonInvalid*/ String startTime = this.getStartTime();
				final /*@NonInvalid*/ boolean result = StringGreaterThanOperation.INSTANCE.evaluate(endTime, startTime).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AgendomatTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean techSupportMustHaveRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Session::techSupportMustHaveRole";
		try {
			/**
			 *
			 * inv techSupportMustHaveRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = techSupport->forAll(p |
			 *           p.roles->includes(Role::TechSupport))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.SESSION___TECH_SUPPORT_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Person> techSupport = this.getTechSupport();
				final /*@NonInvalid*/ OrderedSetValue BOXED_techSupport = idResolver.createOrderedSetOfAll(AgendomatTables.ORD_CLSSid_Person, techSupport);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_techSupport.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Person p = (Person)ITERATOR_p.next();
					/**
					 * p.roles->includes(Role::TechSupport)
					 */
					final /*@NonInvalid*/ List<Role> roles = p.getRoles();
					final /*@NonInvalid*/ OrderedSetValue BOXED_roles = idResolver.createOrderedSetOfAll(AgendomatTables.ORD_ENUMid_Role, roles);
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_roles, AgendomatTables.ELITid_TechSupport).booleanValue();
					//
					if (!includes) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (includes) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AgendomatTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgendomatPackage.SESSION__TALKS:
				return ((InternalEList<?>)getTalks()).basicRemove(otherEnd, msgs);
			case AgendomatPackage.SESSION__EQUIPMENT:
				return ((InternalEList<?>)getEquipment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgendomatPackage.SESSION__SESSION_NAME:
				return getSessionName();
			case AgendomatPackage.SESSION__TALKS:
				return getTalks();
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				return getTechSupport();
			case AgendomatPackage.SESSION__EQUIPMENT:
				return getEquipment();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgendomatPackage.SESSION__SESSION_NAME:
				setSessionName((String)newValue);
				return;
			case AgendomatPackage.SESSION__TALKS:
				getTalks().clear();
				getTalks().addAll((Collection<? extends Talk>)newValue);
				return;
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				getTechSupport().clear();
				getTechSupport().addAll((Collection<? extends Person>)newValue);
				return;
			case AgendomatPackage.SESSION__EQUIPMENT:
				getEquipment().clear();
				getEquipment().addAll((Collection<? extends TemporaryEquipment>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgendomatPackage.SESSION__SESSION_NAME:
				setSessionName(SESSION_NAME_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__TALKS:
				getTalks().clear();
				return;
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				getTechSupport().clear();
				return;
			case AgendomatPackage.SESSION__EQUIPMENT:
				getEquipment().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgendomatPackage.SESSION__SESSION_NAME:
				return SESSION_NAME_EDEFAULT == null ? sessionName != null : !SESSION_NAME_EDEFAULT.equals(sessionName);
			case AgendomatPackage.SESSION__TALKS:
				return talks != null && !talks.isEmpty();
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				return techSupport != null && !techSupport.isEmpty();
			case AgendomatPackage.SESSION__EQUIPMENT:
				return equipment != null && !equipment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AgendomatPackage.SESSION___SESSION_LOCATION_MUST_BE_ROOM__DIAGNOSTICCHAIN_MAP:
				return sessionLocationMustBeRoom((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AgendomatPackage.SESSION___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP:
				return endTimeAfterStartTime((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AgendomatPackage.SESSION___TECH_SUPPORT_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP:
				return techSupportMustHaveRole((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sessionName: ");
		result.append(sessionName);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
