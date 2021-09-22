package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VeryImportantPersonTest {

    @Test
    public void testTellLifeStory() {
        StoryTeller teller = new VeryImportantPerson("Jan", 42);
        String lifeStory = teller.tellLifeStory();
        assertTrue(lifeStory.contains("42"));
        assertTrue(lifeStory.contains("Jan"));
    }

}
