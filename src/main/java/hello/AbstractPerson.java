package hello;

abstract public class AbstractPerson {
    abstract public String getName();
    abstract public int getAge();

    public boolean isOld() {
        return getAge() > 42;
    }
}
