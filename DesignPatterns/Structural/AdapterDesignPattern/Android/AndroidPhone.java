package DesignPatterns.Structural.AdapterDesignPattern.Android;

public class AndroidPhone {
    AndroidCharger androidCharger;

    public AndroidCharger getCharger() {
        return androidCharger;
    }

    public void setCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    public void startCharging(String current) {
        androidCharger.turboCharge(current);
    }

}