package DesignPatterns.Structural.DecoratorDesignPattern;

public interface Beverage {

    default void getDescription() {
        System.out.println("Best Bevereages ever created");
    }

    public abstract int cost();
}