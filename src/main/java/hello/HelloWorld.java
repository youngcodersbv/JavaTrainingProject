package hello;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        // Outputting to the console
        System.out.println("HelloWorld");

        ContretePerson kees = new ContretePerson("Kees Kaas", 43);
        ContretePerson jan = new VeryImportantPerson("Jan Smit", 48);

        List<AbstractPerson> people = new ArrayList();
        people.add(kees);
        people.add(jan);

        List<StoryTeller> tellers = new ArrayList();
        tellers.add(kees);
        tellers.add(jan);

        people.stream()
                .peek(p -> {
                    System.out.println(String.format("Ik ben %s", p.getName()));
                })
                .filter(AbstractPerson::isOld)
                .forEach(p -> {
                    System.out.println(String.format("Ik ben oud met %d jaar", p.getAge()));
                });

        for (StoryTeller teller: tellers) {
            System.out.println(teller.tellLifeStory());
        }
    }
}
