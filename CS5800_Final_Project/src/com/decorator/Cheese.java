package com.decorator;

public class Cheese extends ToppingDecorator {
    private static final double COST = 0.5;

    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }
}
