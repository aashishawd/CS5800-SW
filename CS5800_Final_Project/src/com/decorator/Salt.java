package com.decorator;

public class Salt extends ToppingDecorator {
    private static final double COST = 0.0;

    public Salt(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }
}
