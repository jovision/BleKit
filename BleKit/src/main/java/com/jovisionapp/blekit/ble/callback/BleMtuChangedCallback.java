package com.jovisionapp.blekit.ble.callback;


import com.jovisionapp.blekit.ble.exception.BleException;

public abstract class BleMtuChangedCallback extends BleBaseCallback {

    public abstract void onSetMTUFailure(BleException exception);

    public abstract void onMtuChanged(int mtu);

}
