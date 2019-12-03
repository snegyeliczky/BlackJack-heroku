package com.codecool.homenetwork.device.deviceCategories.haveScreenDeviceTypes;

import com.codecool.homenetwork.device.deviceCategories.ScreanSize;
import com.codecool.homenetwork.device.deviceCategories.haveScrean;

public class Normal extends haveScrean {
    private int manufactured;

    public Normal(int age, int battery, ScreanSize screanSize, int manufactured) {
        super(age, battery, screanSize);
        this.manufactured=manufactured;
    }

    public int calculatePower() {
        return 0;
    }
}
