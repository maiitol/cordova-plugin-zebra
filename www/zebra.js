/*global cordova, module*/

module.exports = {
    print: function (object, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Zebra", "print", object);
    }
};
