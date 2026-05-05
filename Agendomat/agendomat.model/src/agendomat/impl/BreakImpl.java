/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.Break;
import agendomat.Location;
import agendomat.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.BreakImpl#getBreakName <em>Break Name</em>}</li>
 *   <li>{@link agendomat.impl.BreakImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link agendomat.impl.BreakImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link agendomat.impl.BreakImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link agendomat.impl.BreakImpl#getAnimators <em>Animators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakImpl extends ProgramItemImpl implements Break {
	/**
	 * The default value of the '{@link #getBreakName() <em>Break Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakName()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreakName() <em>Break Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakName()
	 * @generated
	 * @ordered
	 */
	protected String breakName = BREAK_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAnimators() <em>Animators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimators()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> animators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.BREAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBreakName() {
		return breakName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreakName(String newBreakName) {
		String oldBreakName = breakName;
		breakName = newBreakName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.BREAK__BREAK_NAME, oldBreakName, breakName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.BREAK__START_TIME, oldStartTime, startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.BREAK__END_TIME, oldEndTime, endTime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgendomatPackage.BREAK__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.BREAK__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getAnimators() {
		if (animators == null) {
			animators = new EObjectResolvingEList<Person>(Person.class, this, AgendomatPackage.BREAK__ANIMATORS);
		}
		return animators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgendomatPackage.BREAK__BREAK_NAME:
				return getBreakName();
			case AgendomatPackage.BREAK__START_TIME:
				return getStartTime();
			case AgendomatPackage.BREAK__END_TIME:
				return getEndTime();
			case AgendomatPackage.BREAK__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case AgendomatPackage.BREAK__ANIMATORS:
				return getAnimators();
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				setBreakName((String)newValue);
				return;
			case AgendomatPackage.BREAK__START_TIME:
				setStartTime((String)newValue);
				return;
			case AgendomatPackage.BREAK__END_TIME:
				setEndTime((String)newValue);
				return;
			case AgendomatPackage.BREAK__LOCATION:
				setLocation((Location)newValue);
				return;
			case AgendomatPackage.BREAK__ANIMATORS:
				getAnimators().clear();
				getAnimators().addAll((Collection<? extends Person>)newValue);
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				setBreakName(BREAK_NAME_EDEFAULT);
				return;
			case AgendomatPackage.BREAK__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case AgendomatPackage.BREAK__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case AgendomatPackage.BREAK__LOCATION:
				setLocation((Location)null);
				return;
			case AgendomatPackage.BREAK__ANIMATORS:
				getAnimators().clear();
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				return BREAK_NAME_EDEFAULT == null ? breakName != null : !BREAK_NAME_EDEFAULT.equals(breakName);
			case AgendomatPackage.BREAK__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case AgendomatPackage.BREAK__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case AgendomatPackage.BREAK__LOCATION:
				return location != null;
			case AgendomatPackage.BREAK__ANIMATORS:
				return animators != null && !animators.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (breakName: ");
		result.append(breakName);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //BreakImpl
