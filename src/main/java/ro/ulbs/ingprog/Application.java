package ro.ulbs.ingprog;

// 1.5 Polimorfism + 1.6 Interfete
public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Cat();
        animal.eat();   // Animal eats.
        animal2.eat();  // The cat eats.  (metoda suprascrisa in Cat, apel virtual)

        animal.sleep();  // Animal sleeps.
        animal2.sleep(); // Animal sleeps. (Cat nu suprascrie sleep, mosteneste din Animal)
    }
}
