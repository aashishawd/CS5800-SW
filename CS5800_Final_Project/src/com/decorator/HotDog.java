package com.decorator;

public class HotDog implements FoodItem {
    private double basePrice;

    public HotDog(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getCost() {
        return basePrice;
    }
}
