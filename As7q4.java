package Biswajit.Java;
import java.util.Scanner;
public class As7q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();
            System.out.print("Enter the value of y: ");
            double y = scanner.nextDouble();
            if (x - y == 0) {
                throw new ArithmeticException();
            }
            double result = x / (x - y);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Exception Error: Division by zero is not allowed.");
        }
    }
}