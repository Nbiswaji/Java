package Biswajit.Java;

import java.util.Scanner;
class NumberPrinter implements Runnable {
    private int start;
    private int end;
    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        if (start % 2 != 0) {
            printOddNumbers();
        }
    }
    private void printOddNumbers() {
        for (int i = start; i <= end; i += 2) {
            System.out.println("child: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class As88q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Thread childThread = new Thread(new NumberPrinter(1, n));
        childThread.start();
        for (int i = 2; i <= n; i += 2) {
            System.out.println("parent: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}