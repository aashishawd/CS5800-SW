package com.decorator;

public class Spread extends ToppingDecorator {
    private static final double COST = 1.0;

    public Spread(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }
}
