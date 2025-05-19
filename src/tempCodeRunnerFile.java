public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat(); // Output: Dog eats meat.
        dog.sleep(); // Output: Dog sleeps.

        Animal cat = new Cat();
        cat.eat(); // Output: Cat eats fish.
        cat.sleep(); // Output: Cat sleeps.
    }
}
