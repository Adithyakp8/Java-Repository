package DesignPatterns.Structural.DecoratorDesignPattern.Decorators;

import DesignPatterns.Structural.DecoratorDesignPattern.Beverage;

public class Soya extends AddOnDecorators {

    public Soya(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.beverage.cost() + 10;
    }

}
