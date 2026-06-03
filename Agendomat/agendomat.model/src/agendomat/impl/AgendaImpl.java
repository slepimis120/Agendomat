/**
 */
package agendomat.impl;

import agendomat.Agenda;
import agendomat.AgendomatPackage;
import agendomat.Event;

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
 * An implementation of the model object '<em><b>Agenda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.AgendaImpl#getAgendaName <em>Agenda Name</em>}</li>
 *   <li>{@link agendomat.impl.AgendaImpl#getAgendaStartDate <em>Agenda Start Date</em>}</li>
 *   <li>{@link agendomat.impl.AgendaImpl#getAgendaEndDate <em>Agenda End Date</em>}</li>
 *   <li>{@link agendomat.impl.AgendaImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link agendomat.impl.AgendaImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgendaImpl extends MinimalEObjectImpl.Container implements Agenda {
	/**
	 * The default value of the '{@link #getAgendaName() <em>Agenda Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENDA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgendaName() <em>Agenda Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaName()
	 * @generated
	 * @ordered
	 */
	protected String agendaName = AGENDA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgendaStartDate() <em>Agenda Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENDA_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgendaStartDate() <em>Agenda Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaStartDate()
	 * @generated
	 * @ordered
	 */
	protected String agendaStartDate = AGENDA_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgendaEndDate() <em>Agenda End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENDA_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgendaEndDate() <em>Agenda End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaEndDate()
	 * @generated
	 * @ordered
	 */
	protected String agendaEndDate = AGENDA_END_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgendaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.AGENDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgendaName() {
		return agendaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgendaName(String newAgendaName) {
		String oldAgendaName = agendaName;
		agendaName = newAgendaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.AGENDA__AGENDA_NAME, oldAgendaName, agendaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgendaStartDate() {
		return agendaStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgendaStartDate(String newAgendaStartDate) {
		String oldAgendaStartDate = agendaStartDate;
		agendaStartDate = newAgendaStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.AGENDA__AGENDA_START_DATE, oldAgendaStartDate, agendaStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgendaEndDate() {
		return agendaEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgendaEndDate(String newAgendaEndDate) {
		String oldAgendaEndDate = agendaEndDate;
		agendaEndDate = newAgendaEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.AGENDA__AGENDA_END_DATE, oldAgendaEndDate, agendaEndDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.AGENDA__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, AgendomatPackage.AGENDA__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgendomatPackage.AGENDA__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case AgendomatPackage.AGENDA__AGENDA_NAME:
				return getAgendaName();
			case AgendomatPackage.AGENDA__AGENDA_START_DATE:
				return getAgendaStartDate();
			case AgendomatPackage.AGENDA__AGENDA_END_DATE:
				return getAgendaEndDate();
			case AgendomatPackage.AGENDA__DESC:
				return getDesc();
			case AgendomatPackage.AGENDA__EVENTS:
				return getEvents();
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
			case AgendomatPackage.AGENDA__AGENDA_NAME:
				setAgendaName((String)newValue);
				return;
			case AgendomatPackage.AGENDA__AGENDA_START_DATE:
				setAgendaStartDate((String)newValue);
				return;
			case AgendomatPackage.AGENDA__AGENDA_END_DATE:
				setAgendaEndDate((String)newValue);
				return;
			case AgendomatPackage.AGENDA__DESC:
				setDesc((String)newValue);
				return;
			case AgendomatPackage.AGENDA__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
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
			case AgendomatPackage.AGENDA__AGENDA_NAME:
				setAgendaName(AGENDA_NAME_EDEFAULT);
				return;
			case AgendomatPackage.AGENDA__AGENDA_START_DATE:
				setAgendaStartDate(AGENDA_START_DATE_EDEFAULT);
				return;
			case AgendomatPackage.AGENDA__AGENDA_END_DATE:
				setAgendaEndDate(AGENDA_END_DATE_EDEFAULT);
				return;
			case AgendomatPackage.AGENDA__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case AgendomatPackage.AGENDA__EVENTS:
				getEvents().clear();
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
			case AgendomatPackage.AGENDA__AGENDA_NAME:
				return AGENDA_NAME_EDEFAULT == null ? agendaName != null : !AGENDA_NAME_EDEFAULT.equals(agendaName);
			case AgendomatPackage.AGENDA__AGENDA_START_DATE:
				return AGENDA_START_DATE_EDEFAULT == null ? agendaStartDate != null : !AGENDA_START_DATE_EDEFAULT.equals(agendaStartDate);
			case AgendomatPackage.AGENDA__AGENDA_END_DATE:
				return AGENDA_END_DATE_EDEFAULT == null ? agendaEndDate != null : !AGENDA_END_DATE_EDEFAULT.equals(agendaEndDate);
			case AgendomatPackage.AGENDA__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case AgendomatPackage.AGENDA__EVENTS:
				return events != null && !events.isEmpty();
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
		result.append(" (agendaName: ");
		result.append(agendaName);
		result.append(", agendaStartDate: ");
		result.append(agendaStartDate);
		result.append(", agendaEndDate: ");
		result.append(agendaEndDate);
		result.append(", desc: ");
		result.append(desc);
		result.append(')');
		return result.toString();
	}

} //AgendaImpl
