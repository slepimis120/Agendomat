/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.AgendomatTables;
import agendomat.Person;
import agendomat.Role;
import agendomat.Talk;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.TalkImpl#getTalkName <em>Talk Name</em>}</li>
 *   <li>{@link agendomat.impl.TalkImpl#getTalkStartTime <em>Talk Start Time</em>}</li>
 *   <li>{@link agendomat.impl.TalkImpl#getTalkEndTime <em>Talk End Time</em>}</li>
 *   <li>{@link agendomat.impl.TalkImpl#getPresenters <em>Presenters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TalkImpl extends MinimalEObjectImpl.Container implements Talk {
	/**
	 * The default value of the '{@link #getTalkName() <em>Talk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkName()
	 * @generated
	 * @ordered
	 */
	protected static final String TALK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTalkName() <em>Talk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkName()
	 * @generated
	 * @ordered
	 */
	protected String talkName = TALK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTalkStartTime() <em>Talk Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TALK_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTalkStartTime() <em>Talk Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkStartTime()
	 * @generated
	 * @ordered
	 */
	protected String talkStartTime = TALK_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTalkEndTime() <em>Talk End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TALK_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTalkEndTime() <em>Talk End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkEndTime()
	 * @generated
	 * @ordered
	 */
	protected String talkEndTime = TALK_END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresenters() <em>Presenters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenters()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> presenters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TalkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.TALK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTalkName() {
		return talkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTalkName(String newTalkName) {
		String oldTalkName = talkName;
		talkName = newTalkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.TALK__TALK_NAME, oldTalkName, talkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTalkStartTime() {
		return talkStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTalkStartTime(String newTalkStartTime) {
		String oldTalkStartTime = talkStartTime;
		talkStartTime = newTalkStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.TALK__TALK_START_TIME, oldTalkStartTime, talkStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTalkEndTime() {
		return talkEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTalkEndTime(String newTalkEndTime) {
		String oldTalkEndTime = talkEndTime;
		talkEndTime = newTalkEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.TALK__TALK_END_TIME, oldTalkEndTime, talkEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPresenters() {
		if (presenters == null) {
			presenters = new EObjectResolvingEList<Person>(Person.class, this, AgendomatPackage.TALK__PRESENTERS);
		}
		return presenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean endTimeAfterStartTime(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Talk::endTimeAfterStartTime";
		try {
			/**
			 *
			 * inv endTimeAfterStartTime:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = talkEndTime > talkStartTime
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.TALK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ String talkEndTime = this.getTalkEndTime();
				final /*@NonInvalid*/ String talkStartTime = this.getTalkStartTime();
				final /*@NonInvalid*/ boolean result = StringGreaterThanOperation.INSTANCE.evaluate(talkEndTime, talkStartTime).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AgendomatTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean presentersMustBePresenter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Talk::presentersMustBePresenter";
		try {
			/**
			 *
			 * inv presentersMustBePresenter:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = presenters->forAll(p |
			 *           p.roles->includes(Role::Presenter))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.TALK___PRESENTERS_MUST_BE_PRESENTER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Person> presenters = this.getPresenters();
				final /*@NonInvalid*/ OrderedSetValue BOXED_presenters = idResolver.createOrderedSetOfAll(AgendomatTables.ORD_CLSSid_Person, presenters);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_presenters.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Person p = (Person)ITERATOR_p.next();
					/**
					 * p.roles->includes(Role::Presenter)
					 */
					final /*@NonInvalid*/ List<Role> roles = p.getRoles();
					final /*@NonInvalid*/ OrderedSetValue BOXED_roles = idResolver.createOrderedSetOfAll(AgendomatTables.ORD_ENUMid_Role, roles);
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_roles, AgendomatTables.ELITid_Presenter).booleanValue();
					//
					if (!includes) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (includes) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AgendomatTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgendomatPackage.TALK__TALK_NAME:
				return getTalkName();
			case AgendomatPackage.TALK__TALK_START_TIME:
				return getTalkStartTime();
			case AgendomatPackage.TALK__TALK_END_TIME:
				return getTalkEndTime();
			case AgendomatPackage.TALK__PRESENTERS:
				return getPresenters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgendomatPackage.TALK__TALK_NAME:
				setTalkName((String)newValue);
				return;
			case AgendomatPackage.TALK__TALK_START_TIME:
				setTalkStartTime((String)newValue);
				return;
			case AgendomatPackage.TALK__TALK_END_TIME:
				setTalkEndTime((String)newValue);
				return;
			case AgendomatPackage.TALK__PRESENTERS:
				getPresenters().clear();
				getPresenters().addAll((Collection<? extends Person>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgendomatPackage.TALK__TALK_NAME:
				setTalkName(TALK_NAME_EDEFAULT);
				return;
			case AgendomatPackage.TALK__TALK_START_TIME:
				setTalkStartTime(TALK_START_TIME_EDEFAULT);
				return;
			case AgendomatPackage.TALK__TALK_END_TIME:
				setTalkEndTime(TALK_END_TIME_EDEFAULT);
				return;
			case AgendomatPackage.TALK__PRESENTERS:
				getPresenters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgendomatPackage.TALK__TALK_NAME:
				return TALK_NAME_EDEFAULT == null ? talkName != null : !TALK_NAME_EDEFAULT.equals(talkName);
			case AgendomatPackage.TALK__TALK_START_TIME:
				return TALK_START_TIME_EDEFAULT == null ? talkStartTime != null : !TALK_START_TIME_EDEFAULT.equals(talkStartTime);
			case AgendomatPackage.TALK__TALK_END_TIME:
				return TALK_END_TIME_EDEFAULT == null ? talkEndTime != null : !TALK_END_TIME_EDEFAULT.equals(talkEndTime);
			case AgendomatPackage.TALK__PRESENTERS:
				return presenters != null && !presenters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AgendomatPackage.TALK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP:
				return endTimeAfterStartTime((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AgendomatPackage.TALK___PRESENTERS_MUST_BE_PRESENTER__DIAGNOSTICCHAIN_MAP:
				return presentersMustBePresenter((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (talkName: ");
		result.append(talkName);
		result.append(", talkStartTime: ");
		result.append(talkStartTime);
		result.append(", talkEndTime: ");
		result.append(talkEndTime);
		result.append(')');
		return result.toString();
	}

} //TalkImpl
