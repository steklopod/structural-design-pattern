package ru.steklopod.designpatterns.adapter;

public class IPhoneX implements IPhone {
    public void charge() {
        System.out.println("Charging IPhone X");
    }
}
