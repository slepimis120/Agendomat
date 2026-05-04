/**
 */
package agendomat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Person#getName <em>Name</em>}</li>
 *   <li>{@link agendomat.Person#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName()
	 * @see agendomat.AgendomatPackage#getPerson_Name()
	 * @model unique="false"
	 * @generated
	 */
	? getName();

	/**
	 * Sets the value of the '{@link agendomat.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(? value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole()
	 * @see agendomat.AgendomatPackage#getPerson_Role()
	 * @model unique="false"
	 * @generated
	 */
	? getRole();

	/**
	 * Sets the value of the '{@link agendomat.Person#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(? value);

} // Person
