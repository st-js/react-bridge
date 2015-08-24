Strongly-Typed Javascript (STJS) Bridge to Facebook's react JS
================================

The STJS bridge to Facebook's React JS gives you access to this great library using a Java syntax.

Supports both `React.createClass` and `extends React.Component`

## `extends React.Component` style

```java
@SyntheticType
@STJSBridge
public class HelloMessageProps extends Props{
    public String name;
}

public class HelloMessage extends Component<HelloMessageProps, State> {

    public String displayName = "HelloMessage";

    public static Map<String, TypeChecker> propTypes = $map("name", React.PropTypes.string.isRequired);

    @Override
    public ReactElement<?> render() {
        return React.createElement("div", null, "Hello ", this.props.name);
    }
}

React.render(React.createElement(HelloMessage, new HelloMessageProps() {{ name = "John"; }}), document.getElementById("reactContainer"));
```

## `React.createClass` style

This type of class is a bit more tricky to use but looks the same as the ES6 style classes, even if it is a `React.createClass` behind

```java
@SyntheticType
@STJSBridge
public class HelloMessageProps extends Props{
    public String name;
}

@IsReactClass
public class HelloMessage extends ReactClass<HelloMessageProps, State> {

    public String displayName = "HelloMessage";

    public static Map<String, TypeChecker> propTypes = $map("name", React.PropTypes.string.isRequired);

    @Override
    public ReactElement<?> render() {
        return React.createElement("div", null, "Hello ", this.props.name);
    }
}

React.render(React.createElement(HelloMessage, new HelloMessageProps() {{ name = "John"; }}), document.getElementById("reactContainer"));
```

Differences to notice :
1. the component extends `ReactClass` instead of `Component`
2. there is a `@IsReactClass` annotation
3. `propTypes` is declared as `static`


## Install

1. Add the maven dependency to your project.
 ```xml
 <dependency>
     <groupId>org.st-js.bridge</groupId>
     <artifactId>react</artifactId>
     <version>0.13.3.bv1</version>
 </dependency>
 ```
2. Enjoy, you're good to go if you don't wish to use `React.createClass`; read-on if you do.


### Only for `React.createClass` style

- Add the following snippet to your stjs-maven-plugin in your project

```xml
<annotations>
    <annotation>IsReactClass</annotation>
    <annotation>IsReactMixin</annotation>
</annotations>
```

- Include `stjs-react.js` in your page after `stjs.js` but before your generated classes
