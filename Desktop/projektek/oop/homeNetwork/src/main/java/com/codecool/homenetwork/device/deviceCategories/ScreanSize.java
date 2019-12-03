package com.codecool.homenetwork.device.deviceCategories;

public enum ScreanSize {
    EDTV(5),
    HD(10)
    ;

    public final int name;

    ScreanSize(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }
}
