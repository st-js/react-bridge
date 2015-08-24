package org.stjs.bridge.react.internal;

import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;

abstract public class ReactClassInterface<P extends Props, S extends State> {

    /**
     * This concept is not documented yet
     */
    protected Object context;

    /**
     * Hold the reference to the elements that have a "ref" key
     */
    public Map<String, ReactComponent> refs;

    /**
     * The properties of the react component
     * This can be seen as the constructor of a class
     */
    public P props;

    /**
     * The state of the react component
     * This can be seen as the protected fields of a class
     */
    protected S state;

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

    /**
     * Invoked when the component is initially created and about to be mounted.
     * This may have side effects, but any external subscriptions or data created
     * by this method must be cleaned up in `componentWillUnmount`.
     */
    public native void componentWillMount();

    /**
     * Invoked when the component has been mounted and has a DOM representation.
     * However, there is no guarantee that the DOM node is in the document.
     *
     * Use this as an opportunity to operate on the DOM when the component has
     * been mounted (initialized and rendered) for the first time.
     *
     * @param element rootNode DOM element representing the component.
     */
    public native void componentDidMount(Element element);

    /**
     * Invoked before the component receives new props.
     *
     * Use this as an opportunity to react to a prop transition by updating the
     * state using `this.setState`. Current props are accessed via `this.props`.
     *
     *   componentWillReceiveProps: function(nextProps, nextContext) {
     *     this.setState({
     *       likesIncreasing: nextProps.likeCount > this.props.likeCount
     *     });
     *   }
     *
     * NOTE: There is no equivalent `componentWillReceiveState`. An incoming prop
     * transition may cause a state change, but the opposite is not true. If you
     * need it, you are probably looking for `componentWillUpdate`.
     */
    public native void componentWillReceiveProps(P nextProps);

    /**
     * Invoked while deciding if the component should be updated as a result of
     * receiving new props, state and/or context.
     *
     * Use this as an opportunity to `return false` when you're certain that the
     * transition to the new props/state/context will not require a component
     * update.
     *
     *   shouldComponentUpdate: function(nextProps, nextState, nextContext) {
     *     return !equal(nextProps, this.props) ||
     *       !equal(nextState, this.state) ||
     *       !equal(nextContext, this.context);
     *   }
     *
     * @param nextProps
     * @param nextState
     * @param nextContext
     * @return True if the component should update.
     */
    public native boolean shouldComponentUpdate(P nextProps, S nextState, Context nextContext);

    /**
     * Invoked when the component is about to update due to a transition from
     * `this.props`, `this.state` and `this.context` to `nextProps`, `nextState`
     * and `nextContext`.
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
    public native boolean componentWillUpdate(P nextProps, S nextState, Context nextContext, ReactReconcileTransaction transaction);

    /**
     * Invoked when the component's DOM representation has been updated.
     *
     * Use this as an opportunity to operate on the DOM when the component has
     * been updated.
     *
     * @param prevProps
     * @param prevState
     * @param prevContext
     * @param rootNode DOM element representing the component.
     */
    public native void componentDidUpdate(P prevProps, S prevState, Context prevContext, Element rootNode);

    /**
     * Invoked when the component is about to be removed from its parent and have
     * its DOM representation destroyed.
     *
     * Use this as an opportunity to deallocate any external resources.
     *
     * NOTE: There is no `componentDidUnmount` since your component will have been
     * destroyed by that point.
     */
    public native void componentWillUnmount();

    /**
     * Updates the component's currently mounted DOM representation.
     *
     * By default, this implements React's rendering and reconciliation algorithm.
     * Sophisticated clients may wish to override this.
     *
     */
    public native void updateComponent(ReactReconcileTransaction transaction);

    /**
     * Uses props from `this.props` and state from `this.state` to render the
     * structure of the component.
     *
     * No guarantees are made about when or how often this method is invoked, so
     * it must not have side effects.
     *
     *   render: function() {
     *     var name = this.props.name;
     *     return <div>Hello, {name}!</div>;
     *   }
     */
    public abstract ReactElement<?> render();

    //BEGIN ReactComponent
    /**
     * Sets a subset of the state. Always use this to mutate
     * state. You should treat `this.state` as immutable.
     *
     * There is no guarantee that `this.state` will be immediately updated, so
     * accessing `this.state` after calling this method may return the old value.
     *
     * There is no guarantee that calls to `setState` will run synchronously,
     * as they may eventually be batched together.  You can provide an optional
     * callback that will be executed when the call to setState is actually
     * completed.
     *
     * When a function is provided to setState, it will be called at some point in
     * the future (not synchronously). It will be called with the up to date
     * component arguments (state, props, context). These values can be different
     * from this.* because your function may be called after receiveProps but before
     * shouldComponentUpdate, and this new state, props, and context will not yet be
     * assigned to this.
     *
     * @param partialState Next partial state or function to
     *        produce next partial state to be merged with current state.
     * @param callback Called after state is updated.
     */
    protected void setState(S partialState, Callback0 callback) {
        //Will be replaced on runtime
    }

    protected void setState(S partialState) {
        //Will be replaced on runtime
    }

    /**
     * Forces an update. This should only be invoked when it is known with
     * certainty that we are **not** in a DOM transaction.
     * <p/>
     * You may want to call this when you know that some deeper aspect of the
     * component's state has changed but `setState` was not called.
     * <p/>
     * This will not invoke `shouldComponentUpdate`, but it will invoke
     * `componentWillUpdate` and `componentDidUpdate`.
     *
     * @param callback Called after update is complete.
     */
    protected void forceUpdate(Callback0 callback) {
        //Will be replaced on runtime
    }
    //END ReactComponent
}
