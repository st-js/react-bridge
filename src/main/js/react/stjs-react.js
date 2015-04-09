/* global stjs */

(function() {
    var oldExtend = stjs.extend;

    stjs.extend = function() {
        var initClass = oldExtend.call(this, arguments);

        if (stjs.getTypeAnnotation(initClass, "IsReact")) {
            //console.log("is React !");
            initClass = React.createClass(initClass);
        }

        return initClass;
    };
})();


