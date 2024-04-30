package DesignPatterns.Structural.DecoratorDesignPattern;

import DesignPatterns.Structural.DecoratorDesignPattern.Decorators.Caramel;
import DesignPatterns.Structural.DecoratorDesignPattern.Decorators.Soya;

public class MainFile {
    public static void main(String[] args) {
        Beverage beverage = new Caramel(new Soya(new Espresso()));
        System.out.println(beverage.cost());
    }
}

// Christopher Okhravi