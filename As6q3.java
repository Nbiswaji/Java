package Biswajit.Java;
import java.util.Scanner;
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
    void erase() {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
    void erase() {
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
    void erase() {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
    void erase() {
        System.out.println("Erasing Square");
    }
}
public class As6q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Shape shape1 = circle;
        Shape shape2 = triangle;
        Shape shape3 = square;
        shape1.draw();
        shape1.erase();
        shape2.draw();
        shape2.erase();
        shape3.draw();
        shape3.erase();
    }
}