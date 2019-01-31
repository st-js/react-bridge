package org.stjs.bridge.react.internal;

import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Function0;

/**
 * This class is to be used as parent when you intend to use "React.createClass"
 * Do not forget to add @IsReactClass to your class.
 *
 *
 * @param <P> Properties to be used with this component
 * @param <S> Internal state of this component
 */
public abstract class ReactClass<P extends Props, S extends State> extends ReactClassInterface<P, S> {

    /**
     * The name used in debug messages
     */
    public String displayName;

    /**
     * An object containing properties and methods that should be defined on
     * the component's constructor instead of its prototype (static methods).
     */
    @Deprecated
    public Map<String, Function0> statics;

    /**
     * Definition of prop types for this component.
     */
    @Deprecated
    public static Map<String, TypeChecker> propTypes;

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
    public native S getInitialState();

    /**
     * Invoked when the component is mounted. Values in the mapping will be set on
     * `this.props` if that prop is not specified (i.e. using an `in` check).
     *
     * This method is invoked before `getInitialState` and therefore cannot rely
     * on `this.state` or use `this.setState`.
     */
    public native P getDefaultProps();

    //BEGIN ReactClassMixin
    /**
     * TODO: This will be deprecated because state should always keep a consistent
     * type signature and the only use case for this, is to avoid that.
     */
    protected void replaceState(S newState, Callback0 callback) {
        //Will be replaced on runtime
    }

    /**
     * Checks whether or not this composite component is mounted.
     * @return True if mounted, false otherwise.
     */
    protected boolean isMounted() {
        //Will be replaced on runtime
        return true;
    }

    /**
     * Sets a subset of the props.
     *
     * @param partialProps Subset of the next props.
     * @param callback Called after props are updated.
     */
    @Deprecated
    public native void setProps(P partialProps, Callback0 callback);

    /**
     * Replace all the props.
     *
     * @param newProps Subset of the next props.
     * @param callback Called after props are updated.
     */
    @Deprecated
    public native void replaceProps(P newProps, Callback0 callback);

    //END ReactClassMixin
}
