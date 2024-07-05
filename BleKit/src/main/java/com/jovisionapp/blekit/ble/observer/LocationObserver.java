package com.jovisionapp.blekit.ble.observer;


import com.jovisionapp.blekit.ble.observer.status.LocationStatus;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-27 15:28
 * @description 蓝牙权限与状态
 */
public class LocationObserver {

    private BehaviorSubject<LocationStatus> locationSubject = BehaviorSubject.createDefault(new LocationStatus(false,false));


    public void setLocationStatusValue(LocationStatus value) {
        locationSubject.onNext(value);
    }

    public Observable<LocationStatus> observeLocationStatus() {
        return locationSubject;
    }

}
