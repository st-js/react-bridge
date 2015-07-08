Strongly-Typed Javascript (STJS) Bridge to Facebook's react JS
================================

The STJS bridge to Facebook's React JS gives you access to this great library using a Java syntax.

```java
@SyntheticType
@STJSBridge
public class HelloMessageProps extends Props{
    public String name;
}

@IsReactClass
public class HelloMessage extends ReactClass<HelloMessageProps, State> {

    public String displayName = "HelloMessage";
    
    // Because of Java limitations, propTypes must be declared as static members
    public static Map<String, Object> propTypes = $map("name", React.PropTypes.string.isRequired);

    @Override
    public ReactElement<?> render() {
        return React.createElement("div", null, "Hello ", this.props.name);
    }
}

React.render(React.createElement(HelloMessage, new HelloMessageProps() {{ name = "John"; }}), document.getElementById("reactContainer"));
```

## Install

- Add the maven dependency to your project.
- Add the following snippet to your stjs-maven-plugin in your project

```
<annotations>
    <annotation>IsReactClass</annotation>
    <annotation>IsReactMixin</annotation>
</annotations>
```

- Include `stjs-react.js` in your page after `stjs.js` but before your generated classes
