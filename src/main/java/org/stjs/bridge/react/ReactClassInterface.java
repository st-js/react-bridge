package org.stjs.bridge.react;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Function0;

public abstract class ReactClassInterface extends ReactClassComponent {
    protected Object context;
    protected Map<String, Object> props;

    public String displayName;

    /**
     * An array of Mixin objects to include when defining your component.
     */
    //TODO :: finish signature
    public Array<Class> mixins;

    /**
     * An object containing properties and methods that should be defined on
     * the component's constructor instead of its prototype (static methods).
     */
    //TODO :: finish signature
    public Map<String, Function0> statics;

    /**
     * Definition of prop types for this component.
     */
    //TODO :: finish signature
    public Map<String, String> propTypes;

    /**
     * Definition of context types for this component.
     */
    //TODO :: finish signature
    public Map<String, String> contextTypes;

    /**
     * Definition of context types this component sets for its children.
     */
    //TODO :: finish signature
    public Map<String, String> childContextTypes;


    /**
     * Invoked when the component is mounted. Values in the mapping will be set on
     * `this.props` if that prop is not specified (i.e. using an `in` check).
     *
     * This method is invoked before `getInitialState` and therefore cannot rely
     * on `this.state` or use `this.setState`.
     */
    //TODO :: finish signature
    protected Object getDefaultProps() {
        return null;
    }

    /**
     * Invoked once before the component is mounted. The return value will be used
     * as the initial value of `this.state`.
     *
     *   getInitialState: function() {
     *     return {
     *       isOn: false,
     *       fooBaz: new BazFoo()
     *     }
     *   }
     */
    //TODO :: finish signature
    protected Object getInitialState() {
        return null;
    }

    //TODO :: finish signature
    protected Object getChildContext() {
        return null;
    }

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
    public abstract ReactElement render();

    /**
     * Invoked when the component is initially created and about to be mounted.
     * This may have side effects, but any external subscriptions or data created
     * by this method must be cleaned up in `componentWillUnmount`.
     */
    protected void componentWillMount() {

    }

    /**
     * Invoked when the component has been mounted and has a DOM representation.
     * However, there is no guarantee that the DOM node is in the document.
     *
     * Use this as an opportunity to operate on the DOM when the component has
     * been mounted (initialized and rendered) for the first time.
     *
     * @param element rootNode DOM element representing the component.
     */
    protected void componentDidMount(Element element) {

    }

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
    //TODO :: finish signature
    protected void componentWillReceiveProps(Object nextProps) {

    }

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
    //TODO :: finish signature
    protected boolean shouldComponentUpdate(Object nextProps, Object nextState, Object nextContext) {
        return true;
    }

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
    //TODO :: finish signature
    protected boolean componentWillUpdate(Object nextProps, Object nextState, Object nextContext, ReactReconcileTransaction transaction) {
        return true;
    }

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
    //TODO :: finish signature
    protected void componentDidUpdate(Object prevProps, Object prevState, Object prevContext, Element rootNode) {

    }

    /**
     * Invoked when the component is about to be removed from its parent and have
     * its DOM representation destroyed.
     *
     * Use this as an opportunity to deallocate any external resources.
     *
     * NOTE: There is no `componentDidUnmount` since your component will have been
     * destroyed by that point.
     */
    //TODO :: finish signature
    protected void componentWillUnmount() {

    }

    /**
     * Updates the component's currently mounted DOM representation.
     *
     * By default, this implements React's rendering and reconciliation algorithm.
     * Sophisticated clients may wish to override this.
     *
     */
    //TODO :: finish signature
    protected void updateComponent(ReactReconcileTransaction transacton) {

    }
}
