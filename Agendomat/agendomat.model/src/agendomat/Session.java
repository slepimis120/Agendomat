/**
 */
package agendomat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Session#getTitle <em>Title</em>}</li>
 *   <li>{@link agendomat.Session#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link agendomat.Session#getEndTime <em>End Time</em>}</li>
 *   <li>{@link agendomat.Session#getLocation <em>Location</em>}</li>
 *   <li>{@link agendomat.Session#getPresenter <em>Presenter</em>}</li>
 *   <li>{@link agendomat.Session#getTechSupport <em>Tech Support</em>}</li>
 *   <li>{@link agendomat.Session#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle()
	 * @see agendomat.AgendomatPackage#getSession_Title()
	 * @model unique="false"
	 * @generated
	 */
	? getTitle();

	/**
	 * Sets the value of the '{@link agendomat.Session#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(? value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime()
	 * @see agendomat.AgendomatPackage#getSession_StartTime()
	 * @model unique="false"
	 * @generated
	 */
	? getStartTime();

	/**
	 * Sets the value of the '{@link agendomat.Session#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(? value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime()
	 * @see agendomat.AgendomatPackage#getSession_EndTime()
	 * @model unique="false"
	 * @generated
	 */
	? getEndTime();

	/**
	 * Sets the value of the '{@link agendomat.Session#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(? value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation()
	 * @see agendomat.AgendomatPackage#getSession_Location()
	 * @model unique="false"
	 * @generated
	 */
	? getLocation();

	/**
	 * Sets the value of the '{@link agendomat.Session#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(? value);

	/**
	 * Returns the value of the '<em><b>Presenter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presenter</em>' reference.
	 * @see #setPresenter(Person)
	 * @see agendomat.AgendomatPackage#getSession_Presenter()
	 * @model
	 * @generated
	 */
	Person getPresenter();

	/**
	 * Sets the value of the '{@link agendomat.Session#getPresenter <em>Presenter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presenter</em>' reference.
	 * @see #getPresenter()
	 * @generated
	 */
	void setPresenter(Person value);

	/**
	 * Returns the value of the '<em><b>Tech Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Support</em>' reference.
	 * @see #setTechSupport(Person)
	 * @see agendomat.AgendomatPackage#getSession_TechSupport()
	 * @model
	 * @generated
	 */
	Person getTechSupport();

	/**
	 * Sets the value of the '{@link agendomat.Session#getTechSupport <em>Tech Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tech Support</em>' reference.
	 * @see #getTechSupport()
	 * @generated
	 */
	void setTechSupport(Person value);

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Equipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getSession_Needs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equipment> getNeeds();

} // Session
