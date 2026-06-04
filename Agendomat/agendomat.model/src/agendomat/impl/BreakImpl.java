/**
 */
package agendomat.impl;

import agendomat.AgendomatPackage;
import agendomat.AgendomatTables;
import agendomat.Break;
import agendomat.Location;
import agendomat.LocationType;
import agendomat.Person;
import agendomat.Role;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link agendomat.impl.BreakImpl#getBreakName <em>Break Name</em>}</li>
 *   <li>{@link agendomat.impl.BreakImpl#getAnimators <em>Animators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakImpl extends ProgramItemImpl implements Break {
	/**
	 * The default value of the '{@link #getBreakName() <em>Break Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakName()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBreakName() <em>Break Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakName()
	 * @generated
	 * @ordered
	 */
	protected String breakName = BREAK_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnimators() <em>Animators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimators()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> animators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgendomatPackage.Literals.BREAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBreakName() {
		return breakName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreakName(String newBreakName) {
		String oldBreakName = breakName;
		breakName = newBreakName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgendomatPackage.BREAK__BREAK_NAME, oldBreakName, breakName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getAnimators() {
		if (animators == null) {
			animators = new EObjectResolvingEList<Person>(Person.class, this, AgendomatPackage.BREAK__ANIMATORS);
		}
		return animators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean animatorsMustHaveRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Break::animatorsMustHaveRole";
		try {
			/**
			 *
			 * inv animatorsMustHaveRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = animators->forAll(p |
			 *           p.roles->includes(Role::Animator))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.BREAK___ANIMATORS_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Person> animators = this.getAnimators();
				final /*@NonInvalid*/ OrderedSetValue BOXED_animators = idResolver.createOrderedSetOfAll(AgendomatTables.ORD_CLSSid_Person, animators);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_animators.iterator();
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
					 * p.roles->includes(Role::Animator)
					 */
					final /*@NonInvalid*/ List<Role> roles = p.getRoles();
					final /*@NonInvalid*/ OrderedSetValue BOXED_roles = idResolver.createOrderedSetOfAll(AgendomatTables.ORD_ENUMid_Role, roles);
					final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_roles, AgendomatTables.ELITid_Animator).booleanValue();
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
	public boolean breakLocationMustBeBreakArea(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Break::breakLocationMustBeBreakArea";
		try {
			/**
			 *
			 * inv breakLocationMustBeBreakArea:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = location.locationType = LocationType::BreakArea
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.BREAK___BREAK_LOCATION_MUST_BE_BREAK_AREA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Location location = this.getLocation();
				final /*@NonInvalid*/ LocationType locationType = location.getLocationType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_locationType = AgendomatTables.ENUMid_LocationType.getEnumerationLiteralId(ClassUtil.nonNullState(locationType.getName()));
				final /*@NonInvalid*/ boolean result = BOXED_locationType == AgendomatTables.ELITid_BreakArea;
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
	public boolean endTimeAfterStartTime(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Break::endTimeAfterStartTime";
		try {
			/**
			 *
			 * inv endTimeAfterStartTime:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = endTime > startTime
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AgendomatPackage.Literals.BREAK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AgendomatTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ String endTime = this.getEndTime();
				final /*@NonInvalid*/ String startTime = this.getStartTime();
				final /*@NonInvalid*/ boolean result = StringGreaterThanOperation.INSTANCE.evaluate(endTime, startTime).booleanValue();
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				return getBreakName();
			case AgendomatPackage.BREAK__ANIMATORS:
				return getAnimators();
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				setBreakName((String)newValue);
				return;
			case AgendomatPackage.BREAK__ANIMATORS:
				getAnimators().clear();
				getAnimators().addAll((Collection<? extends Person>)newValue);
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				setBreakName(BREAK_NAME_EDEFAULT);
				return;
			case AgendomatPackage.BREAK__ANIMATORS:
				getAnimators().clear();
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
			case AgendomatPackage.BREAK__BREAK_NAME:
				return BREAK_NAME_EDEFAULT == null ? breakName != null : !BREAK_NAME_EDEFAULT.equals(breakName);
			case AgendomatPackage.BREAK__ANIMATORS:
				return animators != null && !animators.isEmpty();
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
			case AgendomatPackage.BREAK___ANIMATORS_MUST_HAVE_ROLE__DIAGNOSTICCHAIN_MAP:
				return animatorsMustHaveRole((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AgendomatPackage.BREAK___BREAK_LOCATION_MUST_BE_BREAK_AREA__DIAGNOSTICCHAIN_MAP:
				return breakLocationMustBeBreakArea((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case AgendomatPackage.BREAK___END_TIME_AFTER_START_TIME__DIAGNOSTICCHAIN_MAP:
				return endTimeAfterStartTime((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (breakName: ");
		result.append(breakName);
		result.append(')');
		return result.toString();
	}

} //BreakImpl
