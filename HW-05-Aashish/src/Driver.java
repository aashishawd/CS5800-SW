import decoratorcode.*;

// Driver program
public class Driver {
    public static void main(String[] args) {
        // Create food items
        FoodItem subway = new BaseFoodItem("SUB", 10.0);
        FoodItem churos = new BaseFoodItem("churros", 2.5);

        // Add toppings
        FoodItem subwithpatty = new AdditionalTopping(subway, "Patty", 5.0);
        FoodItem subwithextraCheese = new AdditionalTopping(subwithpatty, "Cheese", 1.5);

        // Create order
        Order order = new Order();
        order.addItem(subwithextraCheese);
        order.addItem(churos);

        // Calculate total cost
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Apply discount based on loyalty status
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1); // 10% discount for example
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total cost after discount: $" + discountedCost);
    }
}
