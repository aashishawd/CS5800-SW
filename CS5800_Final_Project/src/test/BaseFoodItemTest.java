package test;

import com.decorator.Burger;
import com.decorator.Fries;
import com.decorator.HotDog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseFoodItemTest {

    @Test
    public void burgerBasePriceTest() {
        Burger burger = new Burger(5.0);
        Assertions.assertEquals(5.0, burger.getCost());
    }

    @Test
    public void friesBasePriceTest() {
        Fries fries = new Fries(2.0);
        Assertions.assertEquals(2.0, fries.getCost());
    }

    @Test
    public void hotDogBasePriceTest() {
        HotDog hotDog = new HotDog(3.0);
        Assertions.assertEquals(3.0, hotDog.getCost());
    }
}
