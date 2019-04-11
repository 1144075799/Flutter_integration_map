package com.example.mymapshow;

import android.content.Context;
import android.view.View;

import com.baidu.mapapi.map.MapView;

import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class MapViewFactory extends PlatformViewFactory {
    private MapView mapView;

    public MapViewFactory(MessageCodec<Object> createArgsCodec, MapView mapView) {
        super(createArgsCodec);
        this.mapView = mapView;
    }

    @Override
    public PlatformView create(final Context context, int i, Object o) {
        return new PlatformView() {
            @Override
            public View getView() {
                return mapView;
            }

            @Override
            public void dispose() {

            }
        };
    }
}
