package com.example.mymapshow;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

import io.flutter.app.FlutterApplication;

public class MainApplication extends FlutterApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化百度地图 SDK
        SDKInitializer.initialize(this);
        SDKInitializer.setCoordType(CoordType.BD09LL);
    }
}
