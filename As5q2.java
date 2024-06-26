package Biswajit.Java;
    import java.util.Scanner;
    class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void printPoint() {
            System.out.println("Point: (" + x + ", " + y + ")");
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }
    
    class Circle extends Point {
        private double radius;
        public Circle(double x, double y) {
            super(x, y);
            calculateRadius();
        }
        private void calculateRadius() {
            double x = getX();
            double y = getY();
            radius = Math.sqrt(x * x + y * y);
        }
        public void printCircle() {
            System.out.println("Circle - Radius: " + radius);
        }
        public double getRadius() {
            return radius;
        }
    }
    
    class Cylinder extends Circle {
        private double height;
        public Cylinder(double x, double y) {
            super(x, y);
            calculateHeight();
        }
        private void calculateHeight() {
            height = 2 * getRadius();
        }
        public void printCylinder() {
            System.out.println("Cylinder - Height: " + height);
        }
        public double getHeight() {
            return height;
        }
    }
    
    public class As5q2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter x-coordinate for Point:");
            double x = scanner.nextDouble();
            System.out.println("Enter y-coordinate for Point:");
            double y = scanner.nextDouble();
            Cylinder cylinder = new Cylinder(x, y);
            cylinder.printPoint();
            cylinder.printCircle();
            cylinder.printCylinder();
        }
    }