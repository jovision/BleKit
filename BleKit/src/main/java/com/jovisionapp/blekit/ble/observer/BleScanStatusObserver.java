package com.jovisionapp.blekit.ble.observer;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import com.jovisionapp.blekit.ble.BleConstant;

/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-28 10:25
 * @description 蓝牙扫描状态
 */
public class BleScanStatusObserver {

    private BehaviorSubject<Integer> bluetoothSubject = BehaviorSubject.createDefault(BleConstant.SCAN_STATUS_UNKONW);


    public void setBleScanStatusValue(Integer value) {
        bluetoothSubject.onNext(value);
    }

    public Observable<Integer> observeBleScanStatus() {
        return bluetoothSubject;
    }

}
