package Q1.tests;

import Q1.CharacterProperties;
import Q1.FlyweightFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FlyweightFactoryTest {
    @Test
    public void testGetCharacterProperties() {
        CharacterProperties properties1 = FlyweightFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties properties2 = FlyweightFactory.getCharacterProperties("Arial", "Red", 12);
        assertEquals(properties1, properties2);
        assertSame(properties1, properties2);
    }
}
