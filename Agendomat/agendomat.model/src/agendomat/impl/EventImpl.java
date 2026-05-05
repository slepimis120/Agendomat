/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.Event;
import agendomat.Location;
import agendomat.Person;
import agendomat.ProgramItem;

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
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.EventImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getEventStartDate <em>Event Start Date</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getEventEndDate <em>Event End Date</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getProgramItems <em>Program Items</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventStartDate() <em>Event Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventStartDate() <em>Event Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStartDate()
	 * @generated
	 * @ordered
	 */
	protected String eventStartDate = EVENT_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventEndDate() <em>Event End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventEndDate() <em>Event End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventEndDate()
	 * @generated
	 * @ordered
	 */
	protected String eventEndDate = EVENT_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getProgramItems() <em>Program Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramItem> programItems;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventStartDate() {
		return eventStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventStartDate(String newEventStartDate) {
		String oldEventStartDate = eventStartDate;
		eventStartDate = newEventStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__EVENT_START_DATE, oldEventStartDate, eventStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventEndDate() {
		return eventEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventEndDate(String newEventEndDate) {
		String oldEventEndDate = eventEndDate;
		eventEndDate = newEventEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__EVENT_END_DATE, oldEventEndDate, eventEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, AgendomatPackage.EVENT__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramItem> getProgramItems() {
		if (programItems == null) {
			programItems = new EObjectContainmentEList<ProgramItem>(ProgramItem.class, this, AgendomatPackage.EVENT__PROGRAM_ITEMS);
		}
		return programItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, AgendomatPackage.EVENT__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgendomatPackage.EVENT__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case AgendomatPackage.EVENT__PROGRAM_ITEMS:
				return ((InternalEList<?>)getProgramItems()).basicRemove(otherEnd, msgs);
			case AgendomatPackage.EVENT__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case AgendomatPackage.EVENT__EVENT_NAME:
				return getEventName();
			case AgendomatPackage.EVENT__EVENT_START_DATE:
				return getEventStartDate();
			case AgendomatPackage.EVENT__EVENT_END_DATE:
				return getEventEndDate();
			case AgendomatPackage.EVENT__DESC:
				return getDesc();
			case AgendomatPackage.EVENT__PERSONS:
				return getPersons();
			case AgendomatPackage.EVENT__PROGRAM_ITEMS:
				return getProgramItems();
			case AgendomatPackage.EVENT__LOCATIONS:
				return getLocations();
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
			case AgendomatPackage.EVENT__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case AgendomatPackage.EVENT__EVENT_START_DATE:
				setEventStartDate((String)newValue);
				return;
			case AgendomatPackage.EVENT__EVENT_END_DATE:
				setEventEndDate((String)newValue);
				return;
			case AgendomatPackage.EVENT__DESC:
				setDesc((String)newValue);
				return;
			case AgendomatPackage.EVENT__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case AgendomatPackage.EVENT__PROGRAM_ITEMS:
				getProgramItems().clear();
				getProgramItems().addAll((Collection<? extends ProgramItem>)newValue);
				return;
			case AgendomatPackage.EVENT__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
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
			case AgendomatPackage.EVENT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__EVENT_START_DATE:
				setEventStartDate(EVENT_START_DATE_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__EVENT_END_DATE:
				setEventEndDate(EVENT_END_DATE_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__PERSONS:
				getPersons().clear();
				return;
			case AgendomatPackage.EVENT__PROGRAM_ITEMS:
				getProgramItems().clear();
				return;
			case AgendomatPackage.EVENT__LOCATIONS:
				getLocations().clear();
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
			case AgendomatPackage.EVENT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case AgendomatPackage.EVENT__EVENT_START_DATE:
				return EVENT_START_DATE_EDEFAULT == null ? eventStartDate != null : !EVENT_START_DATE_EDEFAULT.equals(eventStartDate);
			case AgendomatPackage.EVENT__EVENT_END_DATE:
				return EVENT_END_DATE_EDEFAULT == null ? eventEndDate != null : !EVENT_END_DATE_EDEFAULT.equals(eventEndDate);
			case AgendomatPackage.EVENT__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case AgendomatPackage.EVENT__PERSONS:
				return persons != null && !persons.isEmpty();
			case AgendomatPackage.EVENT__PROGRAM_ITEMS:
				return programItems != null && !programItems.isEmpty();
			case AgendomatPackage.EVENT__LOCATIONS:
				return locations != null && !locations.isEmpty();
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
		result.append(" (eventName: ");
		result.append(eventName);
		result.append(", eventStartDate: ");
		result.append(eventStartDate);
		result.append(", eventEndDate: ");
		result.append(eventEndDate);
		result.append(", desc: ");
		result.append(desc);
		result.append(')');
		return result.toString();
	}

} //EventImpl
