// AddOn is-a Beverage and has-a beverage
package DesignPatterns.Structural.DecoratorDesignPattern.Decorators;

import DesignPatterns.Structural.DecoratorDesignPattern.Beverage;

public class Caramel extends AddOnDecorators {

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.beverage.cost() + 20;

    }

}