package com.decorator;

public class Main {
    public static void main(String[] args) {
        // Test scenario 1: Burger with Cheese and Bacon
        FoodItem burger = new Burger(5.0);
        burger = new Cheese(burger);
        burger = new Bacon(burger);
        burger = new Vegetables(burger);

        // Test scenario 2: Fries with Salt
        FoodItem fries = new Fries(2.0);
        fries = new Salt(fries);

        // Test scenario 3: HotDog with Vegetables and Spread
        FoodItem hotDog = new HotDog(3.0);
        hotDog = new Vegetables(hotDog);
        hotDog = new Spread(hotDog);

        // Create order and add all items
        Order order = new Order();
        order.addFoodItem(burger);
        order.addFoodItem(fries);
        order.addFoodItem(hotDog);

        // Calculate total cost
        double totalCost = order.calculateTotalCost();

        // Apply loyalty discount
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(LoyaltyLevel.GOLD);
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);

        // Output total costs
        System.out.println("Total cost without discount: $" + totalCost);
        System.out.println("Total cost with discount: $" + discountedCost);
    }
}
