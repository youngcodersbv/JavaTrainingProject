package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {

    @Test
    public void testIntroducePerson() {
        ContretePerson testkees = new ContretePerson("Kees Test", 43);
        String result = HelloWorld.introducePerson(testkees);
        assertTrue(result.contains(testkees.getName()));
    }

    @Test
    public void testTellPersonIsOld() {
        ContretePerson testkees = new ContretePerson("Kees Test", 43);
        String result = HelloWorld.tellPersonIsOld(testkees);
        assertTrue(result.contains(String.valueOf(testkees.getAge())));
    }
}
