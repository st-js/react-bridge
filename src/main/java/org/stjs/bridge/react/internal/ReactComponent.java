package org.stjs.bridge.react.internal;

/**
 * A ReactComponent is a ReactElement added to the DOM. With the original ReactClass' methods
 */
public class ReactComponent<C extends ReactElement<?>> extends ReactClass {

    @Override
    public native ReactElement<?> render();
}
