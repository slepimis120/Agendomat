/**
 */
package agendomat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Location#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link agendomat.Location#getLocationType <em>Location Type</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Name</em>' attribute.
	 * @see #setLocationName(String)
	 * @see agendomat.AgendomatPackage#getLocation_LocationName()
	 * @model required="true"
	 * @generated
	 */
	String getLocationName();

	/**
	 * Sets the value of the '{@link agendomat.Location#getLocationName <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Name</em>' attribute.
	 * @see #getLocationName()
	 * @generated
	 */
	void setLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' attribute.
	 * The literals are from the enumeration {@link agendomat.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type</em>' attribute.
	 * @see agendomat.LocationType
	 * @see #setLocationType(LocationType)
	 * @see agendomat.AgendomatPackage#getLocation_LocationType()
	 * @model required="true"
	 * @generated
	 */
	LocationType getLocationType();

	/**
	 * Sets the value of the '{@link agendomat.Location#getLocationType <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' attribute.
	 * @see agendomat.LocationType
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(LocationType value);

} // Location
