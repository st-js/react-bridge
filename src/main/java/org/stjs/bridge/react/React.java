package org.stjs.bridge.react;

import org.stjs.bridge.react.internal.ComponentClass;
import org.stjs.bridge.react.internal.Props;
import org.stjs.bridge.react.internal.ReactClassInterface;
import org.stjs.bridge.react.internal.ReactElement;
import org.stjs.bridge.react.internal.TypeChecker;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function2;

public class React {

	public static String version;

	/**
	 * This is the base class for React Components when they're defined using ES6 classes. See (Reusable Components =>
	 * https://facebook.github.io/react/docs/reusable-components.html#es6-classes) for how to use ES6 classes with
	 * React. For what methods are actually provided by the base class, see the (Component API =>
	 * https://facebook.github.io/react/docs/component-api.html).
	 */
	public static Class<Component> Component;

	/**
	 * Create and return a new ReactElement of the given type. The type argument can be either an html tag name string
	 * (eg. 'div', 'span', etc), or a ReactClass (created via React.createClass).
	 */
	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(Class<C> clazz, P props);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(Class<C> clazz, P props,
		Object... children);

	/*public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(ComponentClass<P> clazz, P props);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(ComponentClass<P> clazz, P props,
		Object... children);*/

	public static native ReactElement<?> createElement(String element, Map<String, Object> props);

	public static native ReactElement<?> createElement(String element, Map<String, Object> props, Object... children);

	/**
	 * Clone and return a new ReactElement using element as the starting point. The resulting element will have the
	 * original element's props with the new props merged in shallowly. New children will replace existing children.
	 * Unlike React.addons.cloneWithProps, key and ref from the original element will be preserved. There is no special
	 * behavior for merging any props (unlike cloneWithProps). See the v0.13 RC2 blog post for additional details.
	 */
	public static native <C extends ReactClassInterface<?, ?>> ReactElement<C> cloneElement(ReactElement<C> element);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> cloneElement(ReactElement<C> element, P props);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> cloneElement(ReactElement<C> element, P props,
		Object... children);

	/**
	 * Return a function that produces ReactElements of a given type. Like React.createElement, the type argument can be
	 * either an html tag name string (eg. 'div', 'span', etc), or a ReactClass.
	 */
	public static native <P extends Props, C extends ReactClassInterface<P, ?>> Function2<P, Object, ReactElement<C>> createFactory(
		Class<C> clazz);

	public static native Function2<Map<String, String>, Object, ReactElement<?>> createFactory(String type);

	/**
	 * Verifies the object is a ReactElement.
	 */
	public static native boolean isValidElement(Object object);

	/**
	 * React.PropTypes includes types that can be used with a component's propTypes object to validate props being
	 * passed to your components. For more information about propTypes, see Reusable Components.
	 */
	public static class PropTypes {
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

	/**
	 * React.Children provides utilities for dealing with the this.props.children opaque data structure.
	 */
	public static class Children {
		/**
		 * Invoke fn on every immediate child contained within children with this set to context. If children is a
		 * nested object or array it will be traversed: fn will never be passed the container objects. If children is
		 * null or undefined returns null or undefined rather than an empty object.
		 */
		public static native <V> Map<?, V> map(Map<?, V> children, Function1<V, V> callback);

		/**
		 * Like React.Children.map() but does not return an object.
		 */
		public static native <V> void forEach(Map<?, V> children, Callback1<V> callback);

		/**
		 * Return the total number of components in children, equal to the number of times that a callback passed to map
		 * or forEach would be invoked.
		 */
		public static native Integer count(Object children);

		/**
		 * Return the only child in children. Throws otherwise.
		 */
		public static native <T> T only(Object children);

		/**
		 * Return the children opaque data structure as a flat array with keys assigned to each child. Useful if you
		 * want to manipulate collections of children in your render methods, especially if you want to reorder or slice
		 * this.props.children before passing it down.
		 */
		public static native <V> Map<?, V> toArray(Object children);
	}
}
