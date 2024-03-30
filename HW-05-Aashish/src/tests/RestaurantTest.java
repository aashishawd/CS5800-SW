package tests;

import decoratorcode.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

    @Test
    public void testBaseFoodItem() {
        FoodItem subway = new BaseFoodItem("Sub", 6.0);
        assertEquals(6.0, subway.getCost(), 0.01);
    }

    @Test
    public void testAdditionalTopping() {
        FoodItem burger = new BaseFoodItem("Sub", 6.0);
        FoodItem subwithextracheese = new AdditionalTopping(burger, "Cheese", 2.0);
        assertEquals(8.0, subwithextracheese.getCost(), 0.01);
    }

    @Test
    public void testOrder() {
        Order order = new Order();
        FoodItem subway = new BaseFoodItem("Sub", 10.0);
        FoodItem churros = new BaseFoodItem("Churros", 2.5);
        order.addItem(subway);
        order.addItem(churros);
        assertEquals(12.5, order.calculateTotalCost(), 0.01);
    }

    @Test
    public void testLoyaltyStatus() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1);
        assertEquals(90.0, loyaltyStatus.applyDiscount(100.0), 0.01);
    }
}
