//Abstract means hiding the implementation details and showing only the essential features of the object.
//In Java, abstraction can be achieved with the help of abstract classes and interfaces.
//An abstract class is a class that cannot be instantiated, but can be subclassed.
abstract class shape {
    // Abstract method (does not have a body)
    abstract void draw();// Abstract method

    public void display() {
        System.out.println("This is a display method.");
    }

    // Regular method
    void regularMethod() {
        System.out.println("This is a regular method.");
    }
}

class circle extends shape {
    // Implementing the abstract method
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class rectangle extends shape {
    // Implementing the abstract method
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Test{ 
    public static void main(String[] args) {
        shape s1 = new circle();
        s1.draw(); // Output: Drawing a circle.
        s1.display(); // Output: This is a display method.

        shape s2 = new rectangle();
        s2.draw(); // Output: Drawing a rectangle.
        s2.display(); // Output: This is a display method.
    }
}