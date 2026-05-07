/**
 */
package agendomat;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link agendomat.Event#getEventName <em>Event Name</em>}</li>
 *   <li>{@link agendomat.Event#getEventStartDate <em>Event Start Date</em>}</li>
 *   <li>{@link agendomat.Event#getEventEndDate <em>Event End Date</em>}</li>
 *   <li>{@link agendomat.Event#getDesc <em>Desc</em>}</li>
 *   <li>{@link agendomat.Event#getPersons <em>Persons</em>}</li>
 *   <li>{@link agendomat.Event#getProgramItems <em>Program Items</em>}</li>
 *   <li>{@link agendomat.Event#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueLocationNames'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see agendomat.AgendomatPackage#getEvent_EventName()
	 * @model required="true"
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link agendomat.Event#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>Event Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Start Date</em>' attribute.
	 * @see #setEventStartDate(String)
	 * @see agendomat.AgendomatPackage#getEvent_EventStartDate()
	 * @model required="true"
	 * @generated
	 */
	String getEventStartDate();

	/**
	 * Sets the value of the '{@link agendomat.Event#getEventStartDate <em>Event Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Start Date</em>' attribute.
	 * @see #getEventStartDate()
	 * @generated
	 */
	void setEventStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Event End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event End Date</em>' attribute.
	 * @see #setEventEndDate(String)
	 * @see agendomat.AgendomatPackage#getEvent_EventEndDate()
	 * @model required="true"
	 * @generated
	 */
	String getEventEndDate();

	/**
	 * Sets the value of the '{@link agendomat.Event#getEventEndDate <em>Event End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event End Date</em>' attribute.
	 * @see #getEventEndDate()
	 * @generated
	 */
	void setEventEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see agendomat.AgendomatPackage#getEvent_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link agendomat.Event#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

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
	 * Returns the value of the '<em><b>Program Items</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.ProgramItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Items</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getEvent_ProgramItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgramItem> getProgramItems();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getEvent_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tpersons-&gt;isUnique(personName)'"
	 * @generated
	 */
	boolean uniquePersonNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tlocations-&gt;isUnique(locationName)'"
	 * @generated
	 */
	boolean uniqueLocationNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Event
