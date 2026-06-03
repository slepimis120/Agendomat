/**
 */
package agendomat;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Session#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link agendomat.Session#getTalks <em>Talks</em>}</li>
 *   <li>{@link agendomat.Session#getTechSupport <em>Tech Support</em>}</li>
 *   <li>{@link agendomat.Session#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getSession()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='techSupportMustHaveRole'"
 * @generated
 */
public interface Session extends ProgramItem {
	/**
	 * Returns the value of the '<em><b>Session Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Name</em>' attribute.
	 * @see #setSessionName(String)
	 * @see agendomat.AgendomatPackage#getSession_SessionName()
	 * @model required="true"
	 * @generated
	 */
	String getSessionName();

	/**
	 * Sets the value of the '{@link agendomat.Session#getSessionName <em>Session Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Name</em>' attribute.
	 * @see #getSessionName()
	 * @generated
	 */
	void setSessionName(String value);

	/**
	 * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.Talk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getSession_Talks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Talk> getTalks();

	/**
	 * Returns the value of the '<em><b>Tech Support</b></em>' reference list.
	 * The list contents are of type {@link agendomat.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Support</em>' reference list.
	 * @see agendomat.AgendomatPackage#getSession_TechSupport()
	 * @model
	 * @generated
	 */
	EList<Person> getTechSupport();

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' containment reference list.
	 * The list contents are of type {@link agendomat.TemporaryEquipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' containment reference list.
	 * @see agendomat.AgendomatPackage#getSession_Equipment()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporaryEquipment> getEquipment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tlocation.locationType = LocationType::Room'"
	 * @generated
	 */
	boolean sessionLocationMustBeRoom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tendTime &gt; startTime'"
	 * @generated
	 */
	boolean endTimeAfterStartTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\ttechSupport-&gt;forAll(p | p.roles-&gt;includes(Role::TechSupport))'"
	 * @generated
	 */
	boolean techSupportMustHaveRole(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Session
