package com.capillary.design.pattern.decorator.run;

import com.capillary.design.pattern.decorator.api.Beverage;
import com.capillary.design.pattern.decorator.impl.coffeeType.Decaf;
import com.capillary.design.pattern.decorator.impl.coffeeType.Espresso;
import com.capillary.design.pattern.decorator.impl.condiment.Mocha;
import com.capillary.design.pattern.decorator.impl.condiment.Soy;

/**
 * Created by rajeev on 4/2/18.
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        print(beverage);

        Beverage beverage1 = new Decaf();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        print(beverage1);
    }

    private static void print(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

}
