package DesignPatterns.Structural.AdapterDesignPattern.Android;

public class MainFile {
    public static void main(String[] args) {

        AndroidPhone phone = new AndroidPhone();
        phone.setCharger(new IphoneToAndroidAdapter());
        phone.startCharging("Android is charging");
    }

}