package Biswajit.Java;
import java.util.Scanner;
interface Calculator {
    double add(double num1, double num2);
    double sub(double num1, double num2);
    double mul(double num1, double num2);
    double div(double num1, double num2);
}
class DemoCalculator implements Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double sub(double num1, double num2) {
        return num1 - num2;
    }
    public double mul(double num1, double num2) {
        return num1 * num2;
    }
    public double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;wq
        }
    }
}
public class As6q2 {
    public static void main(String[] args) {
        Calculator calculator = new DemoCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
       System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.sub(num1, num2));
        System.out.println("Multiplication: " + calculator.mul(num1, num2));
        System.out.println("Division: " + calculator.div(num1, num2));
    }
}