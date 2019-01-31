package org.stjs.bridge.react.test;

import static org.stjs.javascript.Global.window;

import java.util.ArrayList;
import java.util.List;

import org.stjs.bridge.react.React;
import org.stjs.bridge.react.ReactDOM;

public class RenderComponent {
    public static void main(String[] args) {
        ReactDOM.render(
            React.createElement(MyComponent.class, new MyComponentProps() {{ name = "John"; }}),
            window.document.getElementById("reactContainer")
        );

        List<String> myList = new ArrayList();
        myList.add(item);
    }
}