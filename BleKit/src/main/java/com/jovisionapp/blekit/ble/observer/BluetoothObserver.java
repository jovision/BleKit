package com.jovisionapp.blekit.ble.observer;


import com.jovisionapp.blekit.ble.observer.status.BluetoothStatus;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-27 15:28
 * @description 蓝牙权限与状态
 */
public class BluetoothObserver {

    private BehaviorSubject<BluetoothStatus> bluetoothSubject = BehaviorSubject.createDefault(new BluetoothStatus(false,false));


    public void setBluetoothStatusValue(BluetoothStatus value) {
        bluetoothSubject.onNext(value);
    }

    public Observable<BluetoothStatus> observeBluetoothStatus() {
        return bluetoothSubject;
    }

}
