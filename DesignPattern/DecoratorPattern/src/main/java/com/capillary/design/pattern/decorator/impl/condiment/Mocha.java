package com.capillary.design.pattern.decorator.impl.condiment;

import com.capillary.design.pattern.decorator.api.Beverage;
import com.capillary.design.pattern.decorator.api.Condiment;

/**
 * Created by rajeev on 4/2/18.
 */
public class Mocha implements Condiment {

    private Beverage beverage;

    private static final String DESCRIPTION = ", Mocha";

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + this.DESCRIPTION;
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
