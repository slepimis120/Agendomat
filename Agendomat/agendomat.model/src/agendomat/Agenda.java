/**
 */
package agendomat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Agenda#getAgendaName <em>Agenda Name</em>}</li>
 *   <li>{@link agendomat.Agenda#getAgendaStartDate <em>Agenda Start Date</em>}</li>
 *   <li>{@link agendomat.Agenda#getAgendaEndDate <em>Agenda End Date</em>}</li>
 *   <li>{@link agendomat.Agenda#getDesc <em>Desc</em>}</li>
 *   <li>{@link agendomat.Agenda#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getAgenda()
 * @model
 * @generated
 */
public interface Agenda extends EObject {
	/**
	 * Returns the value of the '<em><b>Agenda Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda Name</em>' attribute.
	 * @see #setAgendaName(String)
	 * @see agendomat.AgendomatPackage#getAgenda_AgendaName()
	 * @model required="true"
	 * @generated
	 */
	String getAgendaName();

	/**
	 * Sets the value of the '{@link agendomat.Agenda#getAgendaName <em>Agenda Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda Name</em>' attribute.
	 * @see #getAgendaName()
	 * @generated
	 */
	void setAgendaName(String value);

	/**
	 * Returns the value of the '<em><b>Agenda Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda Start Date</em>' attribute.
	 * @see #setAgendaStartDate(String)
	 * @see agendomat.AgendomatPackage#getAgenda_AgendaStartDate()
	 * @model
	 * @generated
	 */
	String getAgendaStartDate();

	/**
	 * Sets the value of the '{@link agendomat.Agenda#getAgendaStartDate <em>Agenda Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda Start Date</em>' attribute.
	 * @see #getAgendaStartDate()
	 * @generated
	 */
	void setAgendaStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Agenda End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda End Date</em>' attribute.
	 * @see #setAgendaEndDate(String)
	 * @see agendomat.AgendomatPackage#getAgenda_AgendaEndDate()
	 * @model
	 * @generated
	 */
	String getAgendaEndDate();

	/**
	 * Sets the value of the '{@link agendomat.Agenda#getAgendaEndDate <em>Agenda End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda End Date</em>' attribute.
	 * @see #getAgendaEndDate()
	 * @generated
	 */
	void setAgendaEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see agendomat.AgendomatPackage#getAgenda_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link agendomat.Agenda#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getAgenda_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // Agenda
