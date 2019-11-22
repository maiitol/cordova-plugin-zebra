Cordova Plugin
Simple plugin that returns your string prefixed with hello.

Greeting a user with "Hello, world" is something that could be done in JavaScript. This plugin provides a simple example demonstrating how Cordova plugins work.

Using
Create a new Cordova Project

$ cordova create hello com.example.helloapp Hello
Install the plugin

$ cd hello
$ cordova plugin add https://github.com/maiitol/cordova-plugin-zebra.git
Edit www/js/index.js and add the following code inside onDeviceReady

    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Hello Plugin");
    }

    hello.greet("World", success, failure);

cordova platform add ios
Run the code

cordova run 
