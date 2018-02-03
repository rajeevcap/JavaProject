package com.capillary.design.pattern.decorator.impl.coffeeType;

import com.capillary.design.pattern.decorator.api.Beverage;

/**
 * Created by rajeev on 4/2/18.
 */
public class HouseBlend implements Beverage {

    private static final String DESCRIPTION = "House Blend Coffee";

    public String getDescription() {
        return DESCRIPTION;
    }

    public double cost() {
        return .89;
    }

}
