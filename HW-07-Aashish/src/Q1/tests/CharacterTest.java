package Q1.tests;

import Q1.Character;
import Q1.CharacterProperties;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    @Test
    public void testGetCharacter() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        Character character = new Character('A', properties);
        assertEquals('A', character.getCharacter());
    }

    @Test
    public void testGetProperties() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        Character character = new Character('A', properties);
        assertEquals(properties, character.getProperties());
    }
}
