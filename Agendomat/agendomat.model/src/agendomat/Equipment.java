/**
 */
package agendomat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Equipment#getName <em>Name</em>}</li>
 *   <li>{@link agendomat.Equipment#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName()
	 * @see agendomat.AgendomatPackage#getEquipment_Name()
	 * @model unique="false"
	 * @generated
	 */
	? getName();

	/**
	 * Sets the value of the '{@link agendomat.Equipment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(? value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType()
	 * @see agendomat.AgendomatPackage#getEquipment_Type()
	 * @model unique="false"
	 * @generated
	 */
	? getType();

	/**
	 * Sets the value of the '{@link agendomat.Equipment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(? value);

} // Equipment
