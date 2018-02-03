package com.capillary.design.pattern.decorator.impl.coffeeType;

import com.capillary.design.pattern.decorator.api.Beverage;

/**
 * Created by rajeev on 4/2/18.
 */
public class Espresso implements Beverage {

    private static final String DESCRIPTION = "Espresso";

    public String getDescription() {
        return DESCRIPTION;
    }

    public double cost() {
        return 1.99;
    }
}
