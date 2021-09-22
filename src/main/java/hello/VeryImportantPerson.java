package hello;

public class VeryImportantPerson extends ContretePerson {

    public VeryImportantPerson(String name, int Age) {
        super(name, Age);
    }

    @Override
    public String tellLifeStory() {
        return String.format("Being cool for %d years... %s is the name!", getAge(), getName());
    }

    @Override
    public boolean isOld() {
        return getAge() > 64;
    }
}
