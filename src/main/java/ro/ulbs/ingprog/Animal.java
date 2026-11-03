package ro.ulbs.ingprog;

public class Animal implements Sleepy {
    public void eat() {
        System.out.println("Animal eats.");
    }

    @Override
    public void sleep() {
        System.out.println("Animal sleeps.");
    }
}
