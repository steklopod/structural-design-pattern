package ru.steklopod.designpatterns.adapter;

public class IPhoneCharger {

    public void charge(IPhone iPhone){
        iPhone.charge();
    }
}
