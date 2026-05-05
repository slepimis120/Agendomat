/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.Location;
import agendomat.LocationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.LocationImpl#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link agendomat.impl.LocationImpl#getLocationType <em>Location Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected String locationName = LOCATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected static final LocationType LOCATION_TYPE_EDEFAULT = LocationType.ROOM;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected LocationType locationType = LOCATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationName() {
		return locationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationName(String newLocationName) {
		String oldLocationName = locationName;
		locationName = newLocationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.LOCATION__LOCATION_NAME, oldLocationName, locationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationType getLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationType(LocationType newLocationType) {
		LocationType oldLocationType = locationType;
		locationType = newLocationType == null ? LOCATION_TYPE_EDEFAULT : newLocationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.LOCATION__LOCATION_TYPE, oldLocationType, locationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgendomatPackage.LOCATION__LOCATION_NAME:
				return getLocationName();
			case AgendomatPackage.LOCATION__LOCATION_TYPE:
				return getLocationType();
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
			case AgendomatPackage.LOCATION__LOCATION_NAME:
				setLocationName((String)newValue);
				return;
			case AgendomatPackage.LOCATION__LOCATION_TYPE:
				setLocationType((LocationType)newValue);
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
			case AgendomatPackage.LOCATION__LOCATION_NAME:
				setLocationName(LOCATION_NAME_EDEFAULT);
				return;
			case AgendomatPackage.LOCATION__LOCATION_TYPE:
				setLocationType(LOCATION_TYPE_EDEFAULT);
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
			case AgendomatPackage.LOCATION__LOCATION_NAME:
				return LOCATION_NAME_EDEFAULT == null ? locationName != null : !LOCATION_NAME_EDEFAULT.equals(locationName);
			case AgendomatPackage.LOCATION__LOCATION_TYPE:
				return locationType != LOCATION_TYPE_EDEFAULT;
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
		result.append(" (locationName: ");
		result.append(locationName);
		result.append(", locationType: ");
		result.append(locationType);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
