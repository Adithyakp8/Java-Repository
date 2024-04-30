package DesignPatterns.Structural.AdapterDesignPattern.Android;

import DesignPatterns.Structural.AdapterDesignPattern.Iphone.IphoneCharger;

public class IphoneToAndroidAdapter implements AndroidCharger {

    IphoneCharger iphoneCharger = new IphoneCharger();

    @Override
    public void turboCharge(String current) {
        iphoneCharger.charge(current);
    }

}