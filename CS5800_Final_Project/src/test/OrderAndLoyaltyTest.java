package test;

import com.decorator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderAndLoyaltyTest {

    private Order order;
    private Burger burger;
    private Cheese cheeseBurger;

    @BeforeEach
    public void setUp() {
        order = new Order();
        burger = new Burger(5.0);
        cheeseBurger = new Cheese(new Burger(5.0));
    }

    @Test
    public void orderTotalCostTest() {
        order.addFoodItem(burger);
        Assertions.assertEquals(5.0, order.calculateTotalCost(), "Order total should match the cost of a single burger");
    }

    @Test
    public void loyaltyDiscountAppliedTest() {
        order.addFoodItem(cheeseBurger);
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(LoyaltyLevel.GOLD);
        double totalCost = order.calculateTotalCost();
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        Assertions.assertEquals(totalCost * LoyaltyLevel.GOLD.getDiscountRate(), discountedCost, "Discounted cost should reflect loyalty discount");
    }
}
