/**
 */
package agendomat;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link agendomat.Break#getAnimators <em>Animators</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getBreak()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='endTimeAfterStartTime'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tanimators-&gt;forAll(p | p.roles-&gt;includes(Role::Animator))'"
	 * @generated
	 */
	boolean animatorsMustHaveRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tlocation.locationType = LocationType::BreakArea'"
	 * @generated
	 */
	boolean breakLocationMustBeBreakArea(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tendTime &gt; startTime'"
	 * @generated
	 */
	boolean endTimeAfterStartTime(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Break
