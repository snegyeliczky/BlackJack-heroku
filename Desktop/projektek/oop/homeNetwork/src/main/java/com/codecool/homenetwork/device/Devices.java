package com.codecool.homenetwork.device;

public abstract class Devices implements calculatePower {
    private int age;
    private int battery;

    public Devices(int age, int battery) {
        this.age = age;
        this.battery = battery;
    }




}
