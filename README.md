Strongly-Typed Javascript (STJS) Bridge to Facebook's react JS
================================

The STJS bridge to Facebook's React JS gives you access to this great library using a Java syntax.

```java
@SyntheticType
@STJSBridge
public class HelloMessageProps {
    public String name;
}

@IsReact
public class HelloMessage extends ReactClassInterface<HelloMessageProps, Object> {

    public String displayName = "HelloMessage";

    @Override
    public ReactElement render() {
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
    <annotation>IsReact</annotation>
</annotations>
```

- Include `stjs-react.js` in your page after `stjs.js` but before your generated classes
