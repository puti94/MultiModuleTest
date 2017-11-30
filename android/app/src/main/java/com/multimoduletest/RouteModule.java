package com.multimoduletest;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by puti on 2017/11/25.
 */

public class RouteModule extends ReactContextBaseJavaModule {
    public RouteModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "NativeRoute";
    }


    @ReactMethod
    public void to(String url) {
        if (url.equals("page2")) {
            getCurrentActivity().startActivity(new Intent(getCurrentActivity(), Main2Activity.class));
        }
        if (url.equals("page1")) {
            getCurrentActivity().startActivity(new Intent(getCurrentActivity(), MainActivity.class));
        }
    }

    @ReactMethod
    public void pop() {
        getCurrentActivity().finish();
    }
}
