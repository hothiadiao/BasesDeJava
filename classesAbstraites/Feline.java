package classesAbstraites;

abstract public class Feline {
    protected String mName;

    abstract public void eat();

    abstract public void speak() {
        System.out.println("Roaar");
    }

}
