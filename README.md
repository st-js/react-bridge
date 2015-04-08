Strongly-Typed Javascript (STJS) Bridge to Facebook's react JS
================================

The STJS bridge to Facebook's React JS gives you access to this great library using a Java syntax.

```java
ReactClass HelloMessage = React.createClass(new ReactClassInterface() {
    @STJSBridge
    class Props {
        public String name;
    }

    Props props;

    @Override
    public ReactElement render() {
        return React.createElement("div", null, "Hello ", this.props.name);
    }

    {
        displayName = "HelloMessage";
    }
});

React.render(React.createElement(HelloMessage, $map("name", "John")), document.getElementById("reactContainer"));
```
