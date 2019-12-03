package com.codecool.homenetwork.device.deviceCategories;

import com.codecool.homenetwork.device.Devices;

public abstract class haveScrean extends Devices {

    private ScreanSize screanSize;

    public haveScrean(int age, int battery, ScreanSize screanSize) {
        super(age, battery);
        this.screanSize=screanSize;
    }

    public ScreanSize getScreanSize() {
        return screanSize;
    }
}
