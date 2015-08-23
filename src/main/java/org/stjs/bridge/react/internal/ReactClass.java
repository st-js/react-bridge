package org.stjs.bridge.react.internal;

import org.stjs.javascript.Map;

@IsReactClass
public abstract class ReactClass<P extends Props, S extends State> extends ReactClassInterface<P, S> {

    /**
     * Hold the reference to the elements that have a "ref" key
     */
    public Map<String, ReactComponent> refs;

    /**
     * The name used in debug messages
     */
    public String displayName;

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
}
