package com.codecool.homenetwork.device.deviceCategories;

import com.codecool.homenetwork.device.Devices;

import java.util.List;

public class Connected extends Devices implements knowOthers{

    public Connected(int age, int battery) {
        super(age, battery);
    }

    public int calculatePower() {
        return 0;
    }

    public int countOthers(List<Devices> deviceList) {
        return 0;
    }
}
