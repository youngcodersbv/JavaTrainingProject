package hello;

public class ContretePerson extends AbstractPerson implements StoryTeller {
    private String name;
    private int age;

    public ContretePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String tellLifeStory() {
        return String.format("Was born %d years ago. Hope to live %d more years", age, 100 - age);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
