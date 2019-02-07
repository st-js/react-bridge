Strongly-Typed Javascript (STJS) Bridge to Facebook's react JS
================================

The STJS bridge to Facebook's React JS gives you access to this great library using a Java syntax.

Supports ES6 React Classes

## `extends React.Component` style

```java
@SyntheticType
@STJSBridge
public class HelloMessageProps extends Props{
    public String name;
}

public class HelloMessage extends Component<HelloMessageProps, State> {

    public String displayName = "HelloMessage";

    public static Map<String, TypeChecker> propTypes = $map("name", PropTypes.string.isRequired);

    @Override
    public ReactElement<?> render() {
        return React.createElement("div", null, "Hello ", this.props.name);
    }
}

React.render(React.createElement(HelloMessage, new HelloMessageProps() {{ name = "John"; }}), document.getElementById("reactContainer"));
```

## Install

1. Add the maven dependency to your project.
 ```xml
 <dependency>
     <groupId>org.st-js.bridge</groupId>
     <artifactId>react</artifactId>
     <version>0.16.7.bv0</version>
 </dependency>
 ```
2. Enjoy, you're good to go.

## Migrating from React 0.14 to React 16

* `ReactClass` doesn't exist anymore, Please use `extends React.Component`. You can follow any guide that helps convert from `React.createClass` to ES6 Classes, for example : https://daveceddia.com/convert-createclass-to-es6-class/
* `React.PropTypes` is now just `PropTypes` update your dependencies