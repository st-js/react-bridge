package org.stjs.bridge.react.internal;

/**
 * ReactClass ready to be rendered
 */
public class ReactElement<C extends ReactClassInterface<?, ?>>  {
    /**
     * String / ReactElement
     */
    public Object type;
    public String key;
    public String ref;

    public Object _owner;
    public Object _context;
    public Object _store;
}
