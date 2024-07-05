package com.jovisionapp.blekit.ble.callback;


import com.jovisionapp.blekit.ble.exception.BleException;

public abstract class BleRssiCallback extends BleBaseCallback{

    public abstract void onRssiFailure(BleException exception);

    public abstract void onRssiSuccess(int rssi);

}