package com.jovisionapp.blekit.ble.receiver;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.jovisionapp.blekit.ble.event.BluetoothSwitchStateEvent;

import org.greenrobot.eventbus.EventBus;


/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-28 13:40
 * @description 自定义广播接收器用于监听蓝牙开关状态变化
 */
public class BluetoothSwitchStateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(BluetoothAdapter.ACTION_STATE_CHANGED)) {

            // 蓝牙开关状态发生变化
            EventBus.getDefault().post(new BluetoothSwitchStateEvent());

        }
    }
}