/**
 */
package agendomat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Event#getName <em>Name</em>}</li>
 *   <li>{@link agendomat.Event#getDate <em>Date</em>}</li>
 *   <li>{@link agendomat.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link agendomat.Event#getSessions <em>Sessions</em>}</li>
 *   <li>{@link agendomat.Event#getPersons <em>Persons</em>}</li>
 *   <li>{@link agendomat.Event#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName()
	 * @see agendomat.AgendomatPackage#getEvent_Name()
	 * @model unique="false"
	 * @generated
	 */
	? getName();

	/**
	 * Sets the value of the '{@link agendomat.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(? value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate()
	 * @see agendomat.AgendomatPackage#getEvent_Date()
	 * @model unique="false"
	 * @generated
	 */
	? getDate();

	/**
	 * Sets the value of the '{@link agendomat.Event#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(? value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription()
	 * @see agendomat.AgendomatPackage#getEvent_Description()
	 * @model unique="false"
	 * @generated
	 */
	? getDescription();

	/**
	 * Sets the value of the '{@link agendomat.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(? value);

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Session}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getEvent_Sessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getSessions();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getEvent_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Equipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getEvent_Equipment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equipment> getEquipment();

} // Event
