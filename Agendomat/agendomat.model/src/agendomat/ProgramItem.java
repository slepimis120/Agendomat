/**
 */
package agendomat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.ProgramItem#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link agendomat.ProgramItem#getEndTime <em>End Time</em>}</li>
 *   <li>{@link agendomat.ProgramItem#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getProgramItem()
 * @model abstract="true"
 * @generated
 */
public interface ProgramItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see agendomat.AgendomatPackage#getProgramItem_StartTime()
	 * @model required="true"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link agendomat.ProgramItem#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see agendomat.AgendomatPackage#getProgramItem_EndTime()
	 * @model required="true"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link agendomat.ProgramItem#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see agendomat.AgendomatPackage#getProgramItem_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link agendomat.ProgramItem#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // ProgramItem
