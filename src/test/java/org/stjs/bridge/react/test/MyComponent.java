package org.stjs.bridge.react.test;

import static org.stjs.javascript.JSCollections.$map;

import org.stjs.bridge.react.Component;
import org.stjs.bridge.react.React;
import org.stjs.bridge.react.internal.ReactElement;
import org.stjs.bridge.react.internal.State;
import org.stjs.bridge.react.internal.TypeChecker;
import org.stjs.javascript.Map;

public class MyComponent extends Component<MyComponentProps, State> {

    public String displayName = "HelloMessage";

    public static Map<String, TypeChecker> propTypes = $map("name", React.PropTypes.string.isRequired);

    public MyComponent(MyComponentProps props) {
        super(props);
    }

    @Override
    public ReactElement<?> render() {
        return React.createElement("div", null, "Hello ", this.props.name);
    }
}

