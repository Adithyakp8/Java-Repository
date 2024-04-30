package DesignPatterns.Creational.FactoryDesignPattern;


//when there is a superclass and no of subclasses and object of which subclass should be created depends upon input 
//we use factory design patterns (loosely coupled)

public class FactoryDesignPatternMain {
    public static void main(String[] args) {
        Os os = OsFactory.getInstance("Secured");
        os.spec();
    }
}