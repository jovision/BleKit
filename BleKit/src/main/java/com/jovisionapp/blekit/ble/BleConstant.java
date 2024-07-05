package com.jovisionapp.blekit.ble;

/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-28 10:27
 * @description 蓝牙功能相关常量
 */
public class BleConstant {

    /**
     * 蓝牙扫描状态
     */
    public final static int SCAN_STATUS_UNKONW = 1;//未开始
    public final static int SCAN_STATUS_START = 2;//开始
    public final static int SCAN_STATUS_SCANING = 3;//扫描中
    public final static int SCAN_STATUS_FINISH = 4;//扫描结束


    /**
     * 蓝牙设备连接状态
     */
    public final static int CONNECT_STATUS_CONNECTING = 1;//连接中
    public final static int CONNECT_STATUS_SUCCESS = 2;//连接成功
    public final static int CONNECT_STATUS_FAILURE = 3;//连接失败
    public final static int CONNECT_STATUS_DISCONNECT = 4;//断开连接

    /**
     * 添加蓝牙设备的方式
     */
    public final static String ADD_DEVICE_WAY = "add_ble_device_way";
    public final static int ADD_DEVICE_WAY_SCAN = 1;//扫描得到设备列表
    public final static int ADD_DEVICE_WAY_QR = 2;//扫码


    public final static String INTENT_BLE_DEVICE_MAC = "ble_device_mac";
}
