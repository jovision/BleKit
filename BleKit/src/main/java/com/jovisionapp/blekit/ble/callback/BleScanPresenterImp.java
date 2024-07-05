package com.jovisionapp.blekit.ble.callback;

import com.jovisionapp.blekit.ble.data.BleDevice;

public interface BleScanPresenterImp {

    void onScanStarted(boolean success);

    void onScanning(BleDevice bleDevice);

}
