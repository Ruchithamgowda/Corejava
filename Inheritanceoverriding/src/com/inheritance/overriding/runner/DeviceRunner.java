package com.inheritance.overriding.runner;

import com.inheritance.overriding.internal.Device;
import com.inheritance.overriding.internal.SmartDevice;
import com.inheritance.overriding.internal.Mobile;

public class DeviceRunner {
    public static void main(String[] args) {

        Device device = new Device();
        device.useDevice();

        Device smartAsDevice = new SmartDevice();
        smartAsDevice.useDevice();

        SmartDevice smartDevice = new SmartDevice();
        smartDevice.useDevice();
        smartDevice.maintainDevice();

        Mobile mobile = new Mobile();
        mobile.show(device);
        mobile.show(smartDevice);

    }
}
