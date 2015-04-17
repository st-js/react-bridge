/* global stjs */

(function() {
    var oldExtend = stjs.extend;

    stjs.extend = function(_constructor, _super, _implements, _initializer, _typeDescription, _annotations) {

        // In this method, we go with the idea that a
        // React Class never extends another one as
        // Mixins should be used for the matter. Thus,
        // we don't call extend when we encounter a React Class or Mixin
        if (_annotations && _annotations._ && (_annotations._.IsReactClass || _annotations._.IsReactMixin) ) {
            var method = (_annotations._.IsReactClass)? "createClass" : "createMixin",
                statics = {},
                proto = {};

            // Use the STJS initializer to get the methods
            if(typeof _initializer == "function") {
                _initializer(statics, proto);
                proto.statics = statics;
            }

            return React[method](proto);
        }

        return oldExtend.apply(null, arguments);
    };
})();
