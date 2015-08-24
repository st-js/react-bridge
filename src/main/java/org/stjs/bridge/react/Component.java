package org.stjs.bridge.react;

import org.stjs.bridge.react.internal.Props;
import org.stjs.bridge.react.internal.ReactClassInterface;
import org.stjs.bridge.react.internal.State;
import org.stjs.bridge.react.internal.TypeChecker;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.annotation.STJSBridge;

@Namespace("React")
@STJSBridge
public abstract class Component<P extends Props, S extends State> extends ReactClassInterface<P, S> {

	/**
	 * Definition of prop types for this component.
	 */
	@Deprecated
	public static Map<String, TypeChecker> propTypes;

	/**
	 * Default constructor
	 * @param props
	 */
	public Component(P props) {
		this.props = props;
	}
}
