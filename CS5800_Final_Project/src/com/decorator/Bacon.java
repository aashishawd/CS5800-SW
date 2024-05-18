package com.decorator;

public class Bacon extends ToppingDecorator {
    private static final double COST = 1.0;

    public Bacon(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }
}
