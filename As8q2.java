package Biswajit.Java;
import java.util.Scanner;
class SquareCalculator implements Runnable {
    private int number;
    private int square;

    public SquareCalculator(int number) {
        this.number = number;
    }
    public void run() {
        calculateSquare();
    }

    private void calculateSquare() {
        square = number * number;
        System.out.println("Thread 1 - Square of " + number + ": " + square);
        Thread digitSumThread = new Thread(new DigitSumCalculator(square));
        digitSumThread.start();
    }
}
class DigitSumCalculator implements Runnable {
    private int number;
    public DigitSumCalculator(int number) {
        this.number = number;
    }
    public void run() {
        calculateDigitSum();
    }
    private void calculateDigitSum() {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Thread 2 - Sum of digits of squared number: " + sum);
    }
}

public class As8q2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();
        Thread squareThread = new Thread(new SquareCalculator(inputNumber));
        squareThread.start();
    }
}
