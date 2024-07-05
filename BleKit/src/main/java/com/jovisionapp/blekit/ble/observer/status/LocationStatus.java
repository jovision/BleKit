package com.jovisionapp.blekit.ble.observer.status;

/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-27 15:30
 * @description 定位权限、状态实体
 */

public class LocationStatus {

    private boolean hasPermission;//是否已授权

    private boolean isOpen;//蓝牙是否打开

    public LocationStatus(boolean hasPermission, boolean isOpen) {
        this.hasPermission = hasPermission;
        this.isOpen = isOpen;
    }

    public boolean hasPermission() {
        return hasPermission;
    }

    public void setPermission(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
