package com.jovisionapp.blekit.ble.event;

/**
 * Copyright@中维世纪
 *
 * @authore 彭强-24007
 * @time 2024-02-28 13:40
 * @description GPS开关状态变化
 */
public class CloudStorageEvent {



    public static class CloudStorageStateChange {

        public  boolean isOpen;

        public  boolean isIsOpen() {
            return isOpen;
        }

        public CloudStorageStateChange(boolean isOpen){
            this.isOpen = isOpen;
        }
    }

    public static class SDCardStorageStateChange {

        public  boolean isOpen;

        public  boolean isIsOpen() {
            return isOpen;
        }

        public SDCardStorageStateChange(boolean isOpen){
            this.isOpen = isOpen;
        }
    }
}
