package org.stjs.bridge.react;

import org.stjs.bridge.react.internal.ReactComponent;
import org.stjs.bridge.react.internal.ReactElement;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;

public class ReactDOM {

	public static String version;

	/**
	 * If this component has been mounted into the DOM, this returns the corresponding native browser DOM element. This method is useful for
	 * reading values out of the DOM, such as form field values and performing DOM measurements. When render returns null or false, findDOMNode
	 * returns null.
	 */
	public static native Element findDOMNode(ReactComponent<?> component);

	/**
	 * Render a ReactElement into the DOM in the supplied container and return a reference to the component. If the ReactElement was previously
	 * rendered into container, this will perform an update on it and only mutate the DOM as necessary to reflect the latest React component. If
	 * the optional callback is provided, it will be executed after the component is rendered or updated.
	 */
	public static native <C extends ReactElement<?>> ReactComponent<C> render(C element, Element container);

	public static native <C extends ReactElement<?>> ReactComponent<C> render(C element, Element container, Callback0 callback);

	/**
	 * Remove a mounted React component from the DOM and clean up its event handlers and state. If no component was mounted in the container,
	 * calling this function does nothing. Returns true if a component was unmounted and false if there was no component to unmount.
	 */
	public static native boolean unmountComponentAtNode(Element container);
}
