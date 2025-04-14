package com.inheritance.overriding.internal;

public class Mobile extends Device {
    public Mobile() {
        System.out.println("Running the Mobile constructor");
    }

    public void show(Device device) {
        if (device != null) {
            device.useDevice();
            if (device instanceof SmartDevice) {
                SmartDevice smartDevice = (SmartDevice) device;
                smartDevice.maintainDevice();
            } else {
                System.out.println("Device is not SmartDevice, cannot call maintainDevice");
            }
        } else {
            System.out.println("Device is null");
        }
    }
}
