package com.codecool.homenetwork.device.deviceCategories.haveScreenDeviceTypes;

import com.codecool.homenetwork.device.Devices;
import com.codecool.homenetwork.device.deviceCategories.ScreanSize;
import com.codecool.homenetwork.device.deviceCategories.haveScrean;

import java.util.List;
import java.util.UUID;

public class Smart extends haveScrean implements shownormldivecebybutteryrange{

    private UUID name;

    public Smart(int age, int battery, ScreanSize screanSize) {
        super(age, battery, screanSize);
        this.name = UUID.randomUUID();
    }

    public int calculatePower() {
        return 0;
    }


    public int show(int range, List<Devices> devices) {
        return 0;
    }
}
