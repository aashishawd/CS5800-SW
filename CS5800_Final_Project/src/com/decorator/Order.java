package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (FoodItem foodItem : foodItems) {
            totalCost += foodItem.getCost();
        }
        return totalCost;
    }
}
