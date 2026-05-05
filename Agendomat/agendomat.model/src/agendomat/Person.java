/**
 */
package agendomat;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link agendomat.Person#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link agendomat.Person#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name</em>' attribute.
	 * @see #setPersonName(String)
	 * @see agendomat.AgendomatPackage#getPerson_PersonName()
	 * @model required="true"
	 * @generated
	 */
	String getPersonName();

	/**
	 * Sets the value of the '{@link agendomat.Person#getPersonName <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' attribute.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link agendomat.Role}.
	 * The literals are from the enumeration {@link agendomat.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see agendomat.Role
	 * @see agendomat.AgendomatPackage#getPerson_Roles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Person
