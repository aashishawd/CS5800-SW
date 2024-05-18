package test;

import com.decorator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToppingsTest {

    @Test
    public void burgerWithCheeseAndBaconTest() {
        FoodItem burger = new Burger(5.0);
        burger = new Cheese(burger);
        burger = new Bacon(burger);
        Assertions.assertEquals(6.5, burger.getCost());
    }

    @Test
    public void friesWithSaltTest() {
        FoodItem fries = new Fries(2.0);
        fries = new Salt(fries);
        Assertions.assertEquals(2.0, fries.getCost());
    }

    @Test
    public void hotDogWithVegetablesAndSpreadTest() {
        FoodItem hotDog = new HotDog(3.0);
        hotDog = new Vegetables(hotDog);
        hotDog = new Spread(hotDog);
        Assertions.assertEquals(5.0, hotDog.getCost());
    }
}
