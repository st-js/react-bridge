/* global stjs */

(function() {
    var oldExtend = stjs.extend;

    stjs.extend = function() {
        var initClass = oldExtend.apply(null, arguments);

        if (stjs.getTypeAnnotation(initClass, "IsReactClass")) {
            initClass = React.createClass(initClass.prototype);
        } else if (stjs.getTypeAnnotation(initClass, "IsReactMixin")) {
            initClass = React.createMixin(initClass.prototype);
        }

        return initClass;
    };
})();
