package org.stjs.bridge.react.internal;

import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;

abstract public class ReactClassInterface<P extends Props, S extends State> extends ReactClassStatefulInterface<P, S> implements
		ReactClassLifecycleInterface<P, S> {

	/**
	 * This concept is not documented yet
	 */
	protected Object context;

	/**
	 * Definition of context types for this component.
	 */
	@Deprecated
	public Map<String, String> contextTypes;

	/**
	 * Definition of context types this component sets for its children.
	 */
	@Deprecated
	public Map<String, String> childContextTypes;

	/**
	 * Context is an object shared between all Components
	 */
	public native Context getChildContext();

	@Override
	public native void componentWillMount();

	@Override
	public native void componentDidMount();

	@Override
	public native void componentWillReceiveProps(P nextProps);

	@Override
	public native boolean shouldComponentUpdate(P nextProps, S nextState);

	@Override
	public native boolean componentWillUpdate(P nextProps, S nextState);

	@Override
	public native void componentDidUpdate(P prevProps, S prevState, Object snapshot);

	@Override
	public native void componentWillUnmount();

	/**
	 * Uses props from `this.props` and state from `this.state` to render the structure of the component.
	 *
	 * No guarantees are made about when or how often this method is invoked, so it must not have side effects.
	 *
	 * render: function() { var name = this.props.name; return <div>Hello, {name}!</div>; }
	 */
	public abstract ReactElement<?> render();

	// BEGIN ReactComponent

	/**
	 * Forces an update. This should only be invoked when it is known with certainty that we are **not** in a DOM transaction.
	 * <p/>
	 * You may want to call this when you know that some deeper aspect of the component's state has changed but `setState` was not called.
	 * <p/>
	 * This will not invoke `shouldComponentUpdate`, but it will invoke `componentWillUpdate` and `componentDidUpdate`.
	 *
	 * @param callback
	 *            Called after update is complete.
	 */
	protected void forceUpdate(Callback0 callback) {
		// Will be replaced on runtime
	}

	// END ReactComponent
}
