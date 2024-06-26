package Biswajit.Java;
import java.util.Scanner;
abstract class GeometricFigure {
    double dim1;
    double dim2;
    public GeometricFigure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double getArea();
}
class Rectangle extends GeometricFigure {
    public Rectangle(double length, double width) {
        super(length, width);
    }
    double getArea() {
        return dim1 * dim2;
    }
}
class Triangle extends GeometricFigure {
    public Triangle(double base, double height) {
        super(base, height);
    }
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}
public class As6q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double rectWidth = scanner.nextDouble();
        GeometricFigure rectangle = new Rectangle(rectLength, rectWidth);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.print("Enter base of Triangle: ");
        double triBase = scanner.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double triHeight = scanner.nextDouble();
        GeometricFigure triangle = new Triangle(triBase, triHeight);
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}