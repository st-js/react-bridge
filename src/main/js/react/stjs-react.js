/* global stjs */

(function() {
    var oldExtend = stjs.extend;

    stjs.extend = function() {
        var initClass = oldExtend.call(this, arguments);

        if (stjs.getTypeAnnotation(initClass, "IsReactElement")) {
            //console.log("is React !");
            initClass = React.createClass(initClass);
        } else if (stjs.getTypeAnnotation(initClass, "IsReactMixin")) {
            //console.log("is React !");
            initClass = React.createMixin(initClass);
        }

        return initClass;
    };
})();


