package com.jovisionapp.blekit.ble.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

import com.jovisionapp.blekit.ble.event.GpsSwitchStateEvent;

import org.greenrobot.eventbus.EventBus;


/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-28 13:40
 * @description 自定义广播接收器用于监听GPS开关状态变化
 */
public class GpsSwitchStateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(LocationManager.PROVIDERS_CHANGED_ACTION)) {

            // GPS开关状态发生变化
            EventBus.getDefault().post(new GpsSwitchStateEvent());

        }
    }
}