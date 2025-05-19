
    // An interface is a reference type in Java, similar to class, that can contain only constants, method signatures, default methods, static methods, and nested types.
    // Interfaces cannot contain instance fields. The methods in interfaces are abstract by default.
    // Interfaces cannot be instantiated, but they can be implemented by classes or extended by other interfaces.

    interface Animal {
        void eat(); // Abstract method
        void sleep(); // Abstract method
    }

    class Dog implements Animal {
        public void eat() {
            System.out.println("Dog eats meat.");
        }

        public void sleep() {
            System.out.println("Dog sleeps.");
        }
    }

    class Cat implements Animal {
        public void eat() {
            System.out.println("Cat eats fish.");
        }

        public void sleep() {
            System.out.println("Cat sleeps.");
        }
    }

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
