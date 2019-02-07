package org.stjs.bridge.proptypes;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Namespace;

/**
 * React.PropTypes includes types that can be used with a component's propTypes
 * object to validate props being passed to your components. For more
 * information about propTypes, see Reusable Components.
 */
@Namespace("PropTypes")
public class PropTypes {
	public static TypeChecker array;
	public static TypeChecker bool;
	public static TypeChecker func;
	public static TypeChecker number;
	public static TypeChecker object;
	public static TypeChecker string;

	public static TypeChecker any;
	public static TypeChecker node;
	public static TypeChecker element;

	public static native TypeChecker arrayOf(Array<TypeChecker> types);

	public static native TypeChecker instanceOf(Class<?> cl);

	public static native TypeChecker objectOf(Array<TypeChecker> types);

	public static native TypeChecker oneOf(Array<String> values);

	public static native TypeChecker oneOfType(Array<TypeChecker> types);

	public static native TypeChecker shape(Map<String, TypeChecker> shape);
}