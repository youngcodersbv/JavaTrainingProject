package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcretPeronTest {

    @Test
    public void testTellLifeStory() {
        StoryTeller teller = new ContretePerson("Jan", 42);
        String lifeStory = teller.tellLifeStory();
        assertTrue(lifeStory.contains("42"));
        assertFalse(lifeStory.contains("Jan"));
    }
}
