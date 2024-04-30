package DesignPatterns.Creational.FactoryDesignPattern;

public class OsFactory {

    public static Os getInstance(String str) {
        if (str.equals("Open Source")) {
            return new Android();
        } else if (str.equals("Secured")) {
            return new Ios();
        } else {
            return new Windows();
        }
    }

}