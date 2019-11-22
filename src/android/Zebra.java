package com.adp.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Zebra extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("print")) {

            String name = data.getString(0);
            String message = "Zebra, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
