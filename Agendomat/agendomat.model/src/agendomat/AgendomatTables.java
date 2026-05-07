/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /agendomat.model/model/agendomat.ecore
 * using:
 *   /agendomat.model/model/agendomat.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package agendomat;

// import agendomat.AgendomatPackage;
// import agendomat.AgendomatTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * AgendomatTables provides the dispatch tables for the agendomat for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class AgendomatTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AgendomatPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_agendomat_s_1_0 = IdManager.getNsURIPackageId("http://agendomat/1.0", null, AgendomatPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Break = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Break", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Equipment = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Equipment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Event = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Event", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Model = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Model", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Person = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Person", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProgramItem = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("ProgramItem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Session = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Session", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Talk = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getClassId("Talk", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LocationType = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getEnumerationId("LocationType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Role = AgendomatTables.PACKid_http_c_s_s_agendomat_s_1_0.getEnumerationId("Role");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Break = TypeId.BAG.getSpecializedId(AgendomatTables.CLSSid_Break);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Session = TypeId.BAG.getSpecializedId(AgendomatTables.CLSSid_Session);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Talk = TypeId.BAG.getSpecializedId(AgendomatTables.CLSSid_Talk);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_BreakArea = AgendomatTables.ENUMid_LocationType.getEnumerationLiteralId("BreakArea");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Room = AgendomatTables.ENUMid_LocationType.getEnumerationLiteralId("Room");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Equipment = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.CLSSid_Equipment);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Event = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.CLSSid_Event);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Location = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.CLSSid_Location);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Person = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.CLSSid_Person);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProgramItem = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.CLSSid_ProgramItem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Talk = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.CLSSid_Talk);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Role = TypeId.ORDERED_SET.getSpecializedId(AgendomatTables.ENUMid_Role);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AgendomatTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Break = new EcoreExecutorType(AgendomatPackage.Literals.BREAK, PACKAGE, 0);
		public static final EcoreExecutorType _Equipment = new EcoreExecutorType(AgendomatPackage.Literals.EQUIPMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Event = new EcoreExecutorType(AgendomatPackage.Literals.EVENT, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(AgendomatPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LocationType = new EcoreExecutorEnumeration(AgendomatPackage.Literals.LOCATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Model = new EcoreExecutorType(AgendomatPackage.Literals.MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Person = new EcoreExecutorType(AgendomatPackage.Literals.PERSON, PACKAGE, 0);
		public static final EcoreExecutorType _ProgramItem = new EcoreExecutorType(AgendomatPackage.Literals.PROGRAM_ITEM, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Role = new EcoreExecutorEnumeration(AgendomatPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _Session = new EcoreExecutorType(AgendomatPackage.Literals.SESSION, PACKAGE, 0);
		public static final EcoreExecutorType _Talk = new EcoreExecutorType(AgendomatPackage.Literals.TALK, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Break,
			_Equipment,
			_Event,
			_Location,
			_LocationType,
			_Model,
			_Person,
			_ProgramItem,
			_Role,
			_Session,
			_Talk
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Break__Break = new ExecutorFragment(Types._Break, AgendomatTables.Types._Break);
		private static final ExecutorFragment _Break__OclAny = new ExecutorFragment(Types._Break, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Break__OclElement = new ExecutorFragment(Types._Break, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Break__ProgramItem = new ExecutorFragment(Types._Break, AgendomatTables.Types._ProgramItem);

		private static final ExecutorFragment _Equipment__Equipment = new ExecutorFragment(Types._Equipment, AgendomatTables.Types._Equipment);
		private static final ExecutorFragment _Equipment__OclAny = new ExecutorFragment(Types._Equipment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Equipment__OclElement = new ExecutorFragment(Types._Equipment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Event__Event = new ExecutorFragment(Types._Event, AgendomatTables.Types._Event);
		private static final ExecutorFragment _Event__OclAny = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Event__OclElement = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, AgendomatTables.Types._Location);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LocationType__LocationType = new ExecutorFragment(Types._LocationType, AgendomatTables.Types._LocationType);
		private static final ExecutorFragment _LocationType__OclAny = new ExecutorFragment(Types._LocationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LocationType__OclElement = new ExecutorFragment(Types._LocationType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LocationType__OclEnumeration = new ExecutorFragment(Types._LocationType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LocationType__OclType = new ExecutorFragment(Types._LocationType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, AgendomatTables.Types._Model);
		private static final ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Person__OclAny = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Person__OclElement = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Person__Person = new ExecutorFragment(Types._Person, AgendomatTables.Types._Person);

		private static final ExecutorFragment _ProgramItem__OclAny = new ExecutorFragment(Types._ProgramItem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProgramItem__OclElement = new ExecutorFragment(Types._ProgramItem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProgramItem__ProgramItem = new ExecutorFragment(Types._ProgramItem, AgendomatTables.Types._ProgramItem);

		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__OclEnumeration = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Role__OclType = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, AgendomatTables.Types._Role);

		private static final ExecutorFragment _Session__OclAny = new ExecutorFragment(Types._Session, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Session__OclElement = new ExecutorFragment(Types._Session, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Session__ProgramItem = new ExecutorFragment(Types._Session, AgendomatTables.Types._ProgramItem);
		private static final ExecutorFragment _Session__Session = new ExecutorFragment(Types._Session, AgendomatTables.Types._Session);

		private static final ExecutorFragment _Talk__OclAny = new ExecutorFragment(Types._Talk, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Talk__OclElement = new ExecutorFragment(Types._Talk, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Talk__Talk = new ExecutorFragment(Types._Talk, AgendomatTables.Types._Talk);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Break__animators = new EcoreExecutorProperty(AgendomatPackage.Literals.BREAK__ANIMATORS, Types._Break, 0);
		public static final ExecutorProperty _Break__breakName = new EcoreExecutorProperty(AgendomatPackage.Literals.BREAK__BREAK_NAME, Types._Break, 1);
		public static final ExecutorProperty _Break__endTime = new EcoreExecutorProperty(AgendomatPackage.Literals.BREAK__END_TIME, Types._Break, 2);
		public static final ExecutorProperty _Break__location = new EcoreExecutorProperty(AgendomatPackage.Literals.BREAK__LOCATION, Types._Break, 3);
		public static final ExecutorProperty _Break__startTime = new EcoreExecutorProperty(AgendomatPackage.Literals.BREAK__START_TIME, Types._Break, 4);

		public static final ExecutorProperty _Equipment__equipmentName = new EcoreExecutorProperty(AgendomatPackage.Literals.EQUIPMENT__EQUIPMENT_NAME, Types._Equipment, 0);
		public static final ExecutorProperty _Equipment__equipmentType = new EcoreExecutorProperty(AgendomatPackage.Literals.EQUIPMENT__EQUIPMENT_TYPE, Types._Equipment, 1);
		public static final ExecutorProperty _Equipment__Session__equipment = new ExecutorPropertyWithImplementation("Session", Types._Equipment, 2, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.SESSION__EQUIPMENT));

		public static final ExecutorProperty _Event__desc = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__DESC, Types._Event, 0);
		public static final ExecutorProperty _Event__eventEndDate = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__EVENT_END_DATE, Types._Event, 1);
		public static final ExecutorProperty _Event__eventName = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__EVENT_NAME, Types._Event, 2);
		public static final ExecutorProperty _Event__eventStartDate = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__EVENT_START_DATE, Types._Event, 3);
		public static final ExecutorProperty _Event__locations = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__LOCATIONS, Types._Event, 4);
		public static final ExecutorProperty _Event__persons = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__PERSONS, Types._Event, 5);
		public static final ExecutorProperty _Event__programItems = new EcoreExecutorProperty(AgendomatPackage.Literals.EVENT__PROGRAM_ITEMS, Types._Event, 6);
		public static final ExecutorProperty _Event__Model__events = new ExecutorPropertyWithImplementation("Model", Types._Event, 7, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.MODEL__EVENTS));

		public static final ExecutorProperty _Location__locationName = new EcoreExecutorProperty(AgendomatPackage.Literals.LOCATION__LOCATION_NAME, Types._Location, 0);
		public static final ExecutorProperty _Location__locationType = new EcoreExecutorProperty(AgendomatPackage.Literals.LOCATION__LOCATION_TYPE, Types._Location, 1);
		public static final ExecutorProperty _Location__Break__location = new ExecutorPropertyWithImplementation("Break", Types._Location, 2, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.BREAK__LOCATION));
		public static final ExecutorProperty _Location__Event__locations = new ExecutorPropertyWithImplementation("Event", Types._Location, 3, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.EVENT__LOCATIONS));
		public static final ExecutorProperty _Location__Session__location = new ExecutorPropertyWithImplementation("Session", Types._Location, 4, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.SESSION__LOCATION));

		public static final ExecutorProperty _Model__events = new EcoreExecutorProperty(AgendomatPackage.Literals.MODEL__EVENTS, Types._Model, 0);

		public static final ExecutorProperty _Person__personName = new EcoreExecutorProperty(AgendomatPackage.Literals.PERSON__PERSON_NAME, Types._Person, 0);
		public static final ExecutorProperty _Person__roles = new EcoreExecutorProperty(AgendomatPackage.Literals.PERSON__ROLES, Types._Person, 1);
		public static final ExecutorProperty _Person__Break__animators = new ExecutorPropertyWithImplementation("Break", Types._Person, 2, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.BREAK__ANIMATORS));
		public static final ExecutorProperty _Person__Event__persons = new ExecutorPropertyWithImplementation("Event", Types._Person, 3, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.EVENT__PERSONS));
		public static final ExecutorProperty _Person__Session__techSupport = new ExecutorPropertyWithImplementation("Session", Types._Person, 4, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.SESSION__TECH_SUPPORT));
		public static final ExecutorProperty _Person__Talk__presenters = new ExecutorPropertyWithImplementation("Talk", Types._Person, 5, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.TALK__PRESENTERS));

		public static final ExecutorProperty _ProgramItem__Event__programItems = new ExecutorPropertyWithImplementation("Event", Types._ProgramItem, 0, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.EVENT__PROGRAM_ITEMS));

		public static final ExecutorProperty _Session__endTime = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__END_TIME, Types._Session, 0);
		public static final ExecutorProperty _Session__equipment = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__EQUIPMENT, Types._Session, 1);
		public static final ExecutorProperty _Session__location = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__LOCATION, Types._Session, 2);
		public static final ExecutorProperty _Session__sessionName = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__SESSION_NAME, Types._Session, 3);
		public static final ExecutorProperty _Session__startTime = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__START_TIME, Types._Session, 4);
		public static final ExecutorProperty _Session__talks = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__TALKS, Types._Session, 5);
		public static final ExecutorProperty _Session__techSupport = new EcoreExecutorProperty(AgendomatPackage.Literals.SESSION__TECH_SUPPORT, Types._Session, 6);

		public static final ExecutorProperty _Talk__presenters = new EcoreExecutorProperty(AgendomatPackage.Literals.TALK__PRESENTERS, Types._Talk, 0);
		public static final ExecutorProperty _Talk__talkEndTime = new EcoreExecutorProperty(AgendomatPackage.Literals.TALK__TALK_END_TIME, Types._Talk, 1);
		public static final ExecutorProperty _Talk__talkName = new EcoreExecutorProperty(AgendomatPackage.Literals.TALK__TALK_NAME, Types._Talk, 2);
		public static final ExecutorProperty _Talk__talkStartTime = new EcoreExecutorProperty(AgendomatPackage.Literals.TALK__TALK_START_TIME, Types._Talk, 3);
		public static final ExecutorProperty _Talk__Session__talks = new ExecutorPropertyWithImplementation("Session", Types._Talk, 4, new EcoreLibraryOppositeProperty(AgendomatPackage.Literals.SESSION__TALKS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Break =
			{
				Fragments._Break__OclAny /* 0 */,
				Fragments._Break__OclElement /* 1 */,
				Fragments._Break__ProgramItem /* 2 */,
				Fragments._Break__Break /* 3 */
			};
		private static final int /*@NonNull*/ [] __Break = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Equipment =
			{
				Fragments._Equipment__OclAny /* 0 */,
				Fragments._Equipment__OclElement /* 1 */,
				Fragments._Equipment__Equipment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Equipment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Event =
			{
				Fragments._Event__OclAny /* 0 */,
				Fragments._Event__OclElement /* 1 */,
				Fragments._Event__Event /* 2 */
			};
		private static final int /*@NonNull*/ [] __Event = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__Location /* 2 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LocationType =
			{
				Fragments._LocationType__OclAny /* 0 */,
				Fragments._LocationType__OclElement /* 1 */,
				Fragments._LocationType__OclType /* 2 */,
				Fragments._LocationType__OclEnumeration /* 3 */,
				Fragments._LocationType__LocationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __LocationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Model /* 2 */
			};
		private static final int /*@NonNull*/ [] __Model = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Person =
			{
				Fragments._Person__OclAny /* 0 */,
				Fragments._Person__OclElement /* 1 */,
				Fragments._Person__Person /* 2 */
			};
		private static final int /*@NonNull*/ [] __Person = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProgramItem =
			{
				Fragments._ProgramItem__OclAny /* 0 */,
				Fragments._ProgramItem__OclElement /* 1 */,
				Fragments._ProgramItem__ProgramItem /* 2 */
			};
		private static final int /*@NonNull*/ [] __ProgramItem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__OclType /* 2 */,
				Fragments._Role__OclEnumeration /* 3 */,
				Fragments._Role__Role /* 4 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Session =
			{
				Fragments._Session__OclAny /* 0 */,
				Fragments._Session__OclElement /* 1 */,
				Fragments._Session__ProgramItem /* 2 */,
				Fragments._Session__Session /* 3 */
			};
		private static final int /*@NonNull*/ [] __Session = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Talk =
			{
				Fragments._Talk__OclAny /* 0 */,
				Fragments._Talk__OclElement /* 1 */,
				Fragments._Talk__Talk /* 2 */
			};
		private static final int /*@NonNull*/ [] __Talk = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Break.initFragments(_Break, __Break);
			Types._Equipment.initFragments(_Equipment, __Equipment);
			Types._Event.initFragments(_Event, __Event);
			Types._Location.initFragments(_Location, __Location);
			Types._LocationType.initFragments(_LocationType, __LocationType);
			Types._Model.initFragments(_Model, __Model);
			Types._Person.initFragments(_Person, __Person);
			Types._ProgramItem.initFragments(_ProgramItem, __ProgramItem);
			Types._Role.initFragments(_Role, __Role);
			Types._Session.initFragments(_Session, __Session);
			Types._Talk.initFragments(_Talk, __Talk);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Break__Break = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Break__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Break__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Break__ProgramItem = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Equipment__Equipment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Equipment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Equipment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Event__Event = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__LocationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Model__Model = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Person__Person = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProgramItem__ProgramItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProgramItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProgramItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Session__Session = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Session__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Session__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Session__ProgramItem = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Talk__Talk = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Talk__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Talk__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Break__Break.initOperations(_Break__Break);
			Fragments._Break__OclAny.initOperations(_Break__OclAny);
			Fragments._Break__OclElement.initOperations(_Break__OclElement);
			Fragments._Break__ProgramItem.initOperations(_Break__ProgramItem);

			Fragments._Equipment__Equipment.initOperations(_Equipment__Equipment);
			Fragments._Equipment__OclAny.initOperations(_Equipment__OclAny);
			Fragments._Equipment__OclElement.initOperations(_Equipment__OclElement);

			Fragments._Event__Event.initOperations(_Event__Event);
			Fragments._Event__OclAny.initOperations(_Event__OclAny);
			Fragments._Event__OclElement.initOperations(_Event__OclElement);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._LocationType__LocationType.initOperations(_LocationType__LocationType);
			Fragments._LocationType__OclAny.initOperations(_LocationType__OclAny);
			Fragments._LocationType__OclElement.initOperations(_LocationType__OclElement);
			Fragments._LocationType__OclEnumeration.initOperations(_LocationType__OclEnumeration);
			Fragments._LocationType__OclType.initOperations(_LocationType__OclType);

			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._Person__OclAny.initOperations(_Person__OclAny);
			Fragments._Person__OclElement.initOperations(_Person__OclElement);
			Fragments._Person__Person.initOperations(_Person__Person);

			Fragments._ProgramItem__OclAny.initOperations(_ProgramItem__OclAny);
			Fragments._ProgramItem__OclElement.initOperations(_ProgramItem__OclElement);
			Fragments._ProgramItem__ProgramItem.initOperations(_ProgramItem__ProgramItem);

			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__OclEnumeration.initOperations(_Role__OclEnumeration);
			Fragments._Role__OclType.initOperations(_Role__OclType);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._Session__OclAny.initOperations(_Session__OclAny);
			Fragments._Session__OclElement.initOperations(_Session__OclElement);
			Fragments._Session__ProgramItem.initOperations(_Session__ProgramItem);
			Fragments._Session__Session.initOperations(_Session__Session);

			Fragments._Talk__OclAny.initOperations(_Talk__OclAny);
			Fragments._Talk__OclElement.initOperations(_Talk__OclElement);
			Fragments._Talk__Talk.initOperations(_Talk__Talk);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Break = {
			AgendomatTables.Properties._Break__animators,
			AgendomatTables.Properties._Break__breakName,
			AgendomatTables.Properties._Break__endTime,
			AgendomatTables.Properties._Break__location,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AgendomatTables.Properties._Break__startTime
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Equipment = {
			AgendomatTables.Properties._Equipment__equipmentName,
			AgendomatTables.Properties._Equipment__equipmentType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Event = {
			AgendomatTables.Properties._Event__desc,
			AgendomatTables.Properties._Event__eventEndDate,
			AgendomatTables.Properties._Event__eventName,
			AgendomatTables.Properties._Event__eventStartDate,
			AgendomatTables.Properties._Event__locations,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AgendomatTables.Properties._Event__persons,
			AgendomatTables.Properties._Event__programItems
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			AgendomatTables.Properties._Location__locationName,
			AgendomatTables.Properties._Location__locationType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LocationType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Model = {
			AgendomatTables.Properties._Model__events,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Person = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AgendomatTables.Properties._Person__personName,
			AgendomatTables.Properties._Person__roles
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProgramItem = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Session = {
			AgendomatTables.Properties._Session__endTime,
			AgendomatTables.Properties._Session__equipment,
			AgendomatTables.Properties._Session__location,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AgendomatTables.Properties._Session__sessionName,
			AgendomatTables.Properties._Session__startTime,
			AgendomatTables.Properties._Session__talks,
			AgendomatTables.Properties._Session__techSupport
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Talk = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			AgendomatTables.Properties._Talk__presenters,
			AgendomatTables.Properties._Talk__talkEndTime,
			AgendomatTables.Properties._Talk__talkName,
			AgendomatTables.Properties._Talk__talkStartTime
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Break__Break.initProperties(_Break);
			Fragments._Equipment__Equipment.initProperties(_Equipment);
			Fragments._Event__Event.initProperties(_Event);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._LocationType__LocationType.initProperties(_LocationType);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._Person__Person.initProperties(_Person);
			Fragments._ProgramItem__ProgramItem.initProperties(_ProgramItem);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._Session__Session.initProperties(_Session);
			Fragments._Talk__Talk.initProperties(_Talk);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _LocationType__Room = new EcoreExecutorEnumerationLiteral(AgendomatPackage.Literals.LOCATION_TYPE.getEEnumLiteral("Room"), Types._LocationType, 0);
		public static final EcoreExecutorEnumerationLiteral _LocationType__BreakArea = new EcoreExecutorEnumerationLiteral(AgendomatPackage.Literals.LOCATION_TYPE.getEEnumLiteral("BreakArea"), Types._LocationType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LocationType = {
			_LocationType__Room,
			_LocationType__BreakArea
		};

		public static final EcoreExecutorEnumerationLiteral _Role__Presenter = new EcoreExecutorEnumerationLiteral(AgendomatPackage.Literals.ROLE.getEEnumLiteral("Presenter"), Types._Role, 0);
		public static final EcoreExecutorEnumerationLiteral _Role__TechSupport = new EcoreExecutorEnumerationLiteral(AgendomatPackage.Literals.ROLE.getEEnumLiteral("TechSupport"), Types._Role, 1);
		public static final EcoreExecutorEnumerationLiteral _Role__Animator = new EcoreExecutorEnumerationLiteral(AgendomatPackage.Literals.ROLE.getEEnumLiteral("Animator"), Types._Role, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Role = {
			_Role__Presenter,
			_Role__TechSupport,
			_Role__Animator
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._LocationType.initLiterals(_LocationType);
			Types._Role.initLiterals(_Role);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgendomatTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new AgendomatTables();
	}

	private AgendomatTables() {
		super(AgendomatPackage.eNS_URI);
	}
}
