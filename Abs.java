abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("This is abstract class method");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
        // super.message();   // calls parent method
    }

    // overridden method
    void message() {
        System.out.println("This is circle class method");
    }
}

public class Abs {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.message();
        s.message();
    }
}
