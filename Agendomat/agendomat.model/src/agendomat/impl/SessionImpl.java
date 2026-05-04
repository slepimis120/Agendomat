/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.Equipment;
import agendomat.Person;
import agendomat.Session;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.SessionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getPresenter <em>Presenter</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getTechSupport <em>Tech Support</em>}</li>
 *   <li>{@link agendomat.impl.SessionImpl#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final ? TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected ? title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final ? START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected ? startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final ? END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected ? endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ? LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ? location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresenter() <em>Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenter()
	 * @generated
	 * @ordered
	 */
	protected Person presenter;

	/**
	 * The cached value of the '{@link #getTechSupport() <em>Tech Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechSupport()
	 * @generated
	 * @ordered
	 */
	protected Person techSupport;

	/**
	 * The cached value of the '{@link #getNeeds() <em>Needs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipment> needs;

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
	public ? getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(? newTitle) {
		? oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ? getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(? newStartTime) {
		? oldStartTime = startTime;
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
	public ? getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(? newEndTime) {
		? oldEndTime = endTime;
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
	public ? getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(? newLocation) {
		? oldLocation = location;
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
	public Person getPresenter() {
		if (presenter != null && presenter.eIsProxy()) {
			InternalEObject oldPresenter = (InternalEObject)presenter;
			presenter = (Person)eResolveProxy(oldPresenter);
			if (presenter != oldPresenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgendomatPackage.SESSION__PRESENTER, oldPresenter, presenter));
			}
		}
		return presenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPresenter() {
		return presenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresenter(Person newPresenter) {
		Person oldPresenter = presenter;
		presenter = newPresenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__PRESENTER, oldPresenter, presenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getTechSupport() {
		if (techSupport != null && techSupport.eIsProxy()) {
			InternalEObject oldTechSupport = (InternalEObject)techSupport;
			techSupport = (Person)eResolveProxy(oldTechSupport);
			if (techSupport != oldTechSupport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgendomatPackage.SESSION__TECH_SUPPORT, oldTechSupport, techSupport));
			}
		}
		return techSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetTechSupport() {
		return techSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechSupport(Person newTechSupport) {
		Person oldTechSupport = techSupport;
		techSupport = newTechSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.SESSION__TECH_SUPPORT, oldTechSupport, techSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Equipment> getNeeds() {
		if (needs == null) {
			needs = new EObjectContainmentEList<Equipment>(Equipment.class, this, AgendomatPackage.SESSION__NEEDS);
		}
		return needs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgendomatPackage.SESSION__NEEDS:
				return ((InternalEList<?>)getNeeds()).basicRemove(otherEnd, msgs);
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
			case AgendomatPackage.SESSION__TITLE:
				return getTitle();
			case AgendomatPackage.SESSION__START_TIME:
				return getStartTime();
			case AgendomatPackage.SESSION__END_TIME:
				return getEndTime();
			case AgendomatPackage.SESSION__LOCATION:
				return getLocation();
			case AgendomatPackage.SESSION__PRESENTER:
				if (resolve) return getPresenter();
				return basicGetPresenter();
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				if (resolve) return getTechSupport();
				return basicGetTechSupport();
			case AgendomatPackage.SESSION__NEEDS:
				return getNeeds();
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
			case AgendomatPackage.SESSION__TITLE:
				setTitle((?)newValue);
				return;
			case AgendomatPackage.SESSION__START_TIME:
				setStartTime((?)newValue);
				return;
			case AgendomatPackage.SESSION__END_TIME:
				setEndTime((?)newValue);
				return;
			case AgendomatPackage.SESSION__LOCATION:
				setLocation((?)newValue);
				return;
			case AgendomatPackage.SESSION__PRESENTER:
				setPresenter((Person)newValue);
				return;
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				setTechSupport((Person)newValue);
				return;
			case AgendomatPackage.SESSION__NEEDS:
				getNeeds().clear();
				getNeeds().addAll((Collection<? extends Equipment>)newValue);
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
			case AgendomatPackage.SESSION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AgendomatPackage.SESSION__PRESENTER:
				setPresenter((Person)null);
				return;
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				setTechSupport((Person)null);
				return;
			case AgendomatPackage.SESSION__NEEDS:
				getNeeds().clear();
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
			case AgendomatPackage.SESSION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AgendomatPackage.SESSION__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case AgendomatPackage.SESSION__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case AgendomatPackage.SESSION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AgendomatPackage.SESSION__PRESENTER:
				return presenter != null;
			case AgendomatPackage.SESSION__TECH_SUPPORT:
				return techSupport != null;
			case AgendomatPackage.SESSION__NEEDS:
				return needs != null && !needs.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
