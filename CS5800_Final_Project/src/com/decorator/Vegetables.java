package com.decorator;

public class Vegetables extends ToppingDecorator {
    private static final double COST = 1.0;

    public Vegetables(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }
}
