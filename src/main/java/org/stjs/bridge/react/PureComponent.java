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
public abstract class PureComponent<P extends Props, S extends State> extends Component<P, S> {

	/**
	 * Default constructor
	 * @param props
	 */
	public PureComponent(P props) {
		super(props);
	}
}
