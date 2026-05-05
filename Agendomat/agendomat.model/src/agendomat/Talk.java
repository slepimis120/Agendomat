/**
 */
package agendomat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link agendomat.Talk#getTalkName <em>Talk Name</em>}</li>
 *   <li>{@link agendomat.Talk#getTalkStartTime <em>Talk Start Time</em>}</li>
 *   <li>{@link agendomat.Talk#getTalkEndTime <em>Talk End Time</em>}</li>
 *   <li>{@link agendomat.Talk#getPresenters <em>Presenters</em>}</li>
 * </ul>
 *
 * @see agendomat.AgendomatPackage#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject {
	/**
	 * Returns the value of the '<em><b>Talk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talk Name</em>' attribute.
	 * @see #setTalkName(String)
	 * @see agendomat.AgendomatPackage#getTalk_TalkName()
	 * @model required="true"
	 * @generated
	 */
	String getTalkName();

	/**
	 * Sets the value of the '{@link agendomat.Talk#getTalkName <em>Talk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talk Name</em>' attribute.
	 * @see #getTalkName()
	 * @generated
	 */
	void setTalkName(String value);

	/**
	 * Returns the value of the '<em><b>Talk Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talk Start Time</em>' attribute.
	 * @see #setTalkStartTime(String)
	 * @see agendomat.AgendomatPackage#getTalk_TalkStartTime()
	 * @model required="true"
	 * @generated
	 */
	String getTalkStartTime();

	/**
	 * Sets the value of the '{@link agendomat.Talk#getTalkStartTime <em>Talk Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talk Start Time</em>' attribute.
	 * @see #getTalkStartTime()
	 * @generated
	 */
	void setTalkStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Talk End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talk End Time</em>' attribute.
	 * @see #setTalkEndTime(String)
	 * @see agendomat.AgendomatPackage#getTalk_TalkEndTime()
	 * @model required="true"
	 * @generated
	 */
	String getTalkEndTime();

	/**
	 * Sets the value of the '{@link agendomat.Talk#getTalkEndTime <em>Talk End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talk End Time</em>' attribute.
	 * @see #getTalkEndTime()
	 * @generated
	 */
	void setTalkEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Presenters</b></em>' reference list.
	 * The list contents are of type {@link agendomat.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presenters</em>' reference list.
	 * @see agendomat.AgendomatPackage#getTalk_Presenters()
	 * @model required="true"
	 * @generated
	 */
	EList<Person> getPresenters();

} // Talk
