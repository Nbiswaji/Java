package Biswajit.Java;
import java.util.Scanner;
public class As7q212{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n1: ");
        double n1 = scanner.nextDouble();
        double result = 0;
            try {
                System.out.print("Enter the value of n2: ");
                double n2 = scanner.nextDouble();
                if (n2 == 0) {
                    throw new ArithmeticException();
                }
                result = n1 / n2;
                System.out.println("Result of n1/n2: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please enter a non-zero value for n2.");
            } 
    }
}