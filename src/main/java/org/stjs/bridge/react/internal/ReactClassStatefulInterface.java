package org.stjs.bridge.react.internal;

import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Function2;

/**
 * The statefull react class representation with all related methods.
 * @param <P>
 * @param <S>
 */
public class ReactClassStatefulInterface<P extends Props, S extends State> {
	/**
	 * Hold the reference to the elements that have a "ref" key
	 */
	public Map<String, Element> refs;
	/**
	 * The properties of the react component This can be seen as the constructor of a class
	 */
	public P props;
	/**
	 * The state of the react component This can be seen as the protected fields of a class
	 */
	protected S state;

	/**
	 * Sets a subset of the state. Always use this to mutate state. You should treat `this.state` as immutable.
	 *
	 * There is no guarantee that `this.state` will be immediately updated, so accessing `this.state` after calling this
	 * method may return the old value.
	 *
	 * There is no guarantee that calls to `setState` will run synchronously, as they may eventually be batched
	 * together. You can provide an optional callback that will be executed when the call to setState is actually
	 * completed.
	 *
	 * When a function is provided to setState, it will be called at some point in the future (not synchronously). It
	 * will be called with the up to date component arguments (state, props, context). These values can be different
	 * from this.* because your function may be called after receiveProps but before shouldComponentUpdate, and this new
	 * state, props, and context will not yet be assigned to this.
	 *
	 * @param partialState
	 *            Next partial state or function to produce next partial state to be merged with current state.
	 * @param callback
	 *            Called after state is updated.
	 */
	protected void setState(S partialState, Callback0 callback) {
		// Will be replaced on runtime
	}

	protected void setState(S partialState) {
		// Will be replaced on runtime
	}

	protected void setState(Function2<P, S, S> updater) {
		// Will be replaced on runtime
	}

	protected void setState(Function2<P, S, S> updater, Callback0 callback) {
		// Will be replaced on runtime
	}
}
