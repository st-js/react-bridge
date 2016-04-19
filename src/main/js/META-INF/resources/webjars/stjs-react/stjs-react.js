/* global stjs */

(function () {
  "use strict";
  var oldExtend = stjs.extend;

  stjs.extend = function (_constructor, _super, _implements, _initializer, _typeDescription, _annotations) {
    // Here we will detect if the class has
    // the "IsReactClass" or "IsReactMixin"
    // annotation and call the right method
    // on the React object.
    // React only supports inheritance with
    // mixins, so we won't call stjs.extend
    if (_annotations && _annotations._ && (_annotations._.IsReactClass || _annotations._.IsReactMixin)) {
      var method = (_annotations._.IsReactClass) ? "createClass" : "createMixin",
        statics = {},
        proto = {};

      // Use the STJS initializer to get the methods
      if (typeof _initializer == "function") {
        _initializer(statics, proto);
        proto.statics = statics;

        // Due to a limitation with instance fields
        // initialization in java, we will take the
        // statically initialized propTypes and add
        // them to the prototype
        var staticToInstance = ["propTypes", "mixins"];
        staticToInstance.forEach(function(p){
	        if (statics.hasOwnProperty(p)) {
	          proto[p] = statics[p];
	          delete statics[p];
	        }
        });
      }

      return React[method](proto);
    }

    // Apply the usual extend on non-React classes
    return oldExtend.apply(null, arguments);
  };
})();
