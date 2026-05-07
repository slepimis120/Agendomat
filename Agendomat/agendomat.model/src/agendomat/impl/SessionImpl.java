/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.AgendomatTables;
import agendomat.Equipment;
import agendomat.Location;
import agendomat.LocationType;
import agendomat.Person;
import agendomat.Session;
import agendomat.Talk;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

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
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.SessionImpl#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getLocation <em>Location</em>}</li>
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
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected String endTime = END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

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
	protected EList<Equipment> equipment;

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
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(String newEndTime) {
		String oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgendomatPackage.SESSION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__LOCATION, oldLocation, location));
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
	public EList<Equipment> getEquipment() {
		if (equipment == null) {
			equipment = new EObjectContainmentEList<Equipment>(Equipment.class, this, AgendomatPackage.SESSION__EQUIPMENT);
		}
		return equipment;
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
			case AgendomatPackage.SESSION__START_TIME:
				return getStartTime();
			case AgendomatPackage.SESSION__END_TIME:
				return getEndTime();
			case AgendomatPackage.SESSION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case AgendomatPackage.SESSION__START_TIME:
				setStartTime((String)newValue);
				return;
			case AgendomatPackage.SESSION__END_TIME:
				setEndTime((String)newValue);
				return;
			case AgendomatPackage.SESSION__LOCATION:
				setLocation((Location)newValue);
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
				getEquipment().addAll((Collection<? extends Equipment>)newValue);
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
			case AgendomatPackage.SESSION__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__LOCATION:
				setLocation((Location)null);
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
			case AgendomatPackage.SESSION__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case AgendomatPackage.SESSION__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case AgendomatPackage.SESSION__LOCATION:
				return location != null;
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
			case AgendomatPackage.SESSION___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP:
				return endTimeAfterStartTime((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AgendomatPackage.SESSION___SESSION_LOCATION_MUST_BE_ROOM__DIAGNOSTICCHAIN_MAP:
				return sessionLocationMustBeRoom((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
