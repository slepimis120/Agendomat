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
 *   <li>{@link agendomat.Equipment#getEquipmentName <em>Equipment Name</em>}</li>
 *   <li>{@link agendomat.Equipment#getEquipmentType <em>Equipment Type</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getEquipment()
 * @model abstract="true"
 * @generated
 */
public interface Equipment extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Name</em>' attribute.
	 * @see #setEquipmentName(String)
	 * @see agendomat.AgendomatPackage#getEquipment_EquipmentName()
	 * @model required="true"
	 * @generated
	 */
	String getEquipmentName();

	/**
	 * Sets the value of the '{@link agendomat.Equipment#getEquipmentName <em>Equipment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment Name</em>' attribute.
	 * @see #getEquipmentName()
	 * @generated
	 */
	void setEquipmentName(String value);

	/**
	 * Returns the value of the '<em><b>Equipment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Type</em>' attribute.
	 * @see #setEquipmentType(String)
	 * @see agendomat.AgendomatPackage#getEquipment_EquipmentType()
	 * @model
	 * @generated
	 */
	String getEquipmentType();

	/**
	 * Sets the value of the '{@link agendomat.Equipment#getEquipmentType <em>Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment Type</em>' attribute.
	 * @see #getEquipmentType()
	 * @generated
	 */
	void setEquipmentType(String value);

} // Equipment
