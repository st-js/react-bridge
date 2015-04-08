package org.stjs.bridge.react;

import org.stjs.javascript.Map;
import org.stjs.javascript.dom.Element;

public class React {

    public static class Children {
        //TODO :: finish signature
        public native void map();

        //TODO :: finish signature
        public native void forEach();

        //TODO :: finish signature
        public native void count();

        //TODO :: finish signature
        public native void only();
    }

    //TODO :: finish signature
    public static class Component {

    }

    //TODO :: finish signature
    public static class DOM {

    }

    //TODO :: finish signature
    public static class PropTypes {

    }

    //TODO :: finish signature
    public static native void initializeTouchEvents(boolean shouldUseTouch);

    public native static ReactClass createClass(Map<String, Object> description);

    public static native ReactElement createElement(ReactClass clazz, Object props);
    public static native ReactElement createElement(String element, Object props);
    public static native ReactElement createElement(ReactClass clazz, Object props, Object... children);
    public static native ReactElement createElement(String element, Object props, Object... children);

    //TODO :: finish signature
    public static native ReactElement cloneElement();

    //TODO :: finish signature
    public static native Object createFactory();

    //TODO :: finish signature
    public static native Object createMixin(Object mixin);

    //TODO :: finish signature
    public static native Object constructAndRenderComponent();

    //TODO :: finish signature
    public static native Object constructAndRenderComponentByID();

    //TODO :: finish signature
    public static native Object findDOMNode();

    public static native void render(ReactElement element, Element container);

    //TODO :: finish signature
    public static native void renderToString(ReactElement element);

    //TODO :: finish signature
    public static native void renderToStaticMarkup(ReactElement element);

    //TODO :: finish signature
    public static native void unmountComponentAtNode();

    //TODO :: finish signature
    public static native boolean isValidElement();

    //TODO :: finish signature
    public static native void withContext();

    //TODO :: finish signature
    public static native void __spread();
}
