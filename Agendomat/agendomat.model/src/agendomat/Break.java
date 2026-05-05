/**
 */
package agendomat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Break#getBreakName <em>Break Name</em>}</li>
 *   <li>{@link agendomat.Break#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link agendomat.Break#getEndTime <em>End Time</em>}</li>
 *   <li>{@link agendomat.Break#getLocation <em>Location</em>}</li>
 *   <li>{@link agendomat.Break#getAnimators <em>Animators</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getBreak()
 * @model
 * @generated
 */
public interface Break extends ProgramItem {
	/**
	 * Returns the value of the '<em><b>Break Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Name</em>' attribute.
	 * @see #setBreakName(String)
	 * @see agendomat.AgendomatPackage#getBreak_BreakName()
	 * @model required="true"
	 * @generated
	 */
	String getBreakName();

	/**
	 * Sets the value of the '{@link agendomat.Break#getBreakName <em>Break Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Name</em>' attribute.
	 * @see #getBreakName()
	 * @generated
	 */
	void setBreakName(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see agendomat.AgendomatPackage#getBreak_StartTime()
	 * @model required="true"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link agendomat.Break#getStartTime <em>Start Time</em>}' attribute.
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
	 * @see agendomat.AgendomatPackage#getBreak_EndTime()
	 * @model required="true"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link agendomat.Break#getEndTime <em>End Time</em>}' attribute.
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
	 * @see agendomat.AgendomatPackage#getBreak_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link agendomat.Break#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Animators</b></em>' reference list.
	 * The list contents are of type {@link agendomat.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animators</em>' reference list.
	 * @see agendomat.AgendomatPackage#getBreak_Animators()
	 * @model
	 * @generated
	 */
	EList<Person> getAnimators();

} // Break
