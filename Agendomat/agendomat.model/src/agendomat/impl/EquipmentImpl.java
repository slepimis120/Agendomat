/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.Equipment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.EquipmentImpl#getEquipmentName <em>Equipment Name</em>}</li>
 *   <li>{@link agendomat.impl.EquipmentImpl#getEquipmentType <em>Equipment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends MinimalEObjectImpl.Container implements Equipment {
	/**
	 * The default value of the '{@link #getEquipmentName() <em>Equipment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUIPMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquipmentName() <em>Equipment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentName()
	 * @generated
	 * @ordered
	 */
	protected String equipmentName = EQUIPMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEquipmentType() <em>Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUIPMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquipmentType() <em>Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentType()
	 * @generated
	 * @ordered
	 */
	protected String equipmentType = EQUIPMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEquipmentName() {
		return equipmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquipmentName(String newEquipmentName) {
		String oldEquipmentName = equipmentName;
		equipmentName = newEquipmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EQUIPMENT__EQUIPMENT_NAME, oldEquipmentName, equipmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEquipmentType() {
		return equipmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquipmentType(String newEquipmentType) {
		String oldEquipmentType = equipmentType;
		equipmentType = newEquipmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.EQUIPMENT__EQUIPMENT_TYPE, oldEquipmentType, equipmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_NAME:
				return getEquipmentName();
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_TYPE:
				return getEquipmentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_NAME:
				setEquipmentName((String)newValue);
				return;
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_TYPE:
				setEquipmentType((String)newValue);
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
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_NAME:
				setEquipmentName(EQUIPMENT_NAME_EDEFAULT);
				return;
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_TYPE:
				setEquipmentType(EQUIPMENT_TYPE_EDEFAULT);
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
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_NAME:
				return EQUIPMENT_NAME_EDEFAULT == null ? equipmentName != null : !EQUIPMENT_NAME_EDEFAULT.equals(equipmentName);
			case AgendomatPackage.EQUIPMENT__EQUIPMENT_TYPE:
				return EQUIPMENT_TYPE_EDEFAULT == null ? equipmentType != null : !EQUIPMENT_TYPE_EDEFAULT.equals(equipmentType);
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
		result.append(" (equipmentName: ");
		result.append(equipmentName);
		result.append(", equipmentType: ");
		result.append(equipmentType);
		result.append(')');
		return result.toString();
	}

} //EquipmentImpl
