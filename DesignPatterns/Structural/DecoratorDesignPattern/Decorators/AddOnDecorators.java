package DesignPatterns.Structural.DecoratorDesignPattern.Decorators;

import DesignPatterns.Structural.DecoratorDesignPattern.Beverage;

public abstract class AddOnDecorators implements Beverage {

    Beverage beverage;

    public AddOnDecorators(Beverage beverage) {
        this.beverage = beverage;

    }

}
