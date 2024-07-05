package com.jovisionapp.blekit.ble.callback;


import com.jovisionapp.blekit.ble.exception.BleException;

public abstract class BleReadCallback extends BleBaseCallback {

    public abstract void onReadSuccess(byte[] data);

    public abstract void onReadFailure(BleException exception);

}
