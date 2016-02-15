package org.stjs.bridge.react.internal;

import org.stjs.javascript.dom.Element;

/**
 * The interface to represent all React class lifecycle methods.
 * @param <P> the properties class
 * @param <S> the state classc
 */
public interface ReactClassLifecycleInterface<P extends Props, S extends State> {
	/**
	 * Invoked when the component is initially created and about to be mounted. This may have side effects, but any
	 * external subscriptions or data created by this method must be cleaned up in `componentWillUnmount`.
	 */
	void componentWillMount();

	/**
	 * Invoked when the component has been mounted and has a DOM representation. However, there is no guarantee that the
	 * DOM node is in the document.
	 *
	 * Use this as an opportunity to operate on the DOM when the component has been mounted (initialized and rendered)
	 * for the first time.
	 *
	 * @param element
	 *            rootNode DOM element representing the component.
	 */
	void componentDidMount(Element element);

	/**
	 * Invoked before the component receives new props.
	 *
	 * Use this as an opportunity to react to a prop transition by updating the state using `this.setState`. Current
	 * props are accessed via `this.props`.
	 *
	 * componentWillReceiveProps: function(nextProps, nextContext) { this.setState({ likesIncreasing:
	 * nextProps.likeCount > this.props.likeCount }); }
	 *
	 * NOTE: There is no equivalent `componentWillReceiveState`. An incoming prop transition may cause a state change,
	 * but the opposite is not true. If you need it, you are probably looking for `componentWillUpdate`.
	 */
	void componentWillReceiveProps(P nextProps);

	/**
	 * Invoked while deciding if the component should be updated as a result of receiving new props, state and/or
	 * context.
	 *
	 * Use this as an opportunity to `return false` when you're certain that the transition to the new
	 * props/state/context will not require a component update.
	 *
	 * shouldComponentUpdate: function(nextProps, nextState, nextContext) { return !equal(nextProps, this.props) ||
	 * !equal(nextState, this.state) || !equal(nextContext, this.context); }
	 *
	 * @param nextProps
	 * @param nextState
	 * @param nextContext
	 * @return True if the component should update.
	 */
	boolean shouldComponentUpdate(P nextProps, S nextState, Context nextContext);

	/**
	 * Invoked when the component is about to update due to a transition from `this.props`, `this.state` and
	 * `this.context` to `nextProps`, `nextState` and `nextContext`.
	 *
	 * Use this as an opportunity to perform preparation before an update occurs.
	 *
	 * NOTE: You **cannot** use `this.setState()` in this method.
	 *
	 * @param nextProps
	 * @param nextState
	 * @param nextContext
	 * @param transaction
	 */
	boolean componentWillUpdate(P nextProps, S nextState, Context nextContext, ReactReconcileTransaction transaction);

	/**
	 * Invoked when the component's DOM representation has been updated.
	 *
	 * Use this as an opportunity to operate on the DOM when the component has been updated.
	 *
	 * @param prevProps
	 * @param prevState
	 * @param prevContext
	 * @param rootNode
	 *            DOM element representing the component.
	 */
	void componentDidUpdate(P prevProps, S prevState, Context prevContext, Element rootNode);

	/**
	 * Invoked when the component is about to be removed from its parent and have its DOM representation destroyed.
	 *
	 * Use this as an opportunity to deallocate any external resources.
	 *
	 * NOTE: There is no `componentDidUnmount` since your component will have been destroyed by that point.
	 */
	void componentWillUnmount();
}
