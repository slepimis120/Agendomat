/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.Equipment;
import agendomat.Event;
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
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getDate <em>Date</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link agendomat.impl.EventImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final ? NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ? name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final ? DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected ? date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final ? DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected ? description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessions;

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
	public ? getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(? newName) {
		? oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ? getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(? newDate) {
		? oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ? getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(? newDescription) {
		? oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EVENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectContainmentEList<Session>(Session.class, this, AgendomatPackage.EVENT__SESSIONS);
		}
		return sessions;
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
	public EList<Equipment> getEquipment() {
		if (equipment == null) {
			equipment = new EObjectContainmentEList<Equipment>(Equipment.class, this, AgendomatPackage.EVENT__EQUIPMENT);
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgendomatPackage.EVENT__SESSIONS:
				return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
			case AgendomatPackage.EVENT__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case AgendomatPackage.EVENT__EQUIPMENT:
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
			case AgendomatPackage.EVENT__NAME:
				return getName();
			case AgendomatPackage.EVENT__DATE:
				return getDate();
			case AgendomatPackage.EVENT__DESCRIPTION:
				return getDescription();
			case AgendomatPackage.EVENT__SESSIONS:
				return getSessions();
			case AgendomatPackage.EVENT__PERSONS:
				return getPersons();
			case AgendomatPackage.EVENT__EQUIPMENT:
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
			case AgendomatPackage.EVENT__NAME:
				setName((?)newValue);
				return;
			case AgendomatPackage.EVENT__DATE:
				setDate((?)newValue);
				return;
			case AgendomatPackage.EVENT__DESCRIPTION:
				setDescription((?)newValue);
				return;
			case AgendomatPackage.EVENT__SESSIONS:
				getSessions().clear();
				getSessions().addAll((Collection<? extends Session>)newValue);
				return;
			case AgendomatPackage.EVENT__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case AgendomatPackage.EVENT__EQUIPMENT:
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
			case AgendomatPackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AgendomatPackage.EVENT__SESSIONS:
				getSessions().clear();
				return;
			case AgendomatPackage.EVENT__PERSONS:
				getPersons().clear();
				return;
			case AgendomatPackage.EVENT__EQUIPMENT:
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
			case AgendomatPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AgendomatPackage.EVENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case AgendomatPackage.EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AgendomatPackage.EVENT__SESSIONS:
				return sessions != null && !sessions.isEmpty();
			case AgendomatPackage.EVENT__PERSONS:
				return persons != null && !persons.isEmpty();
			case AgendomatPackage.EVENT__EQUIPMENT:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EventImpl
