package Biswajit.Java;
import java.util.Scanner;
class SumCalculator implements Runnable {
    private int start;
    private int end;
    private int[] globalSum;
    public SumCalculator(int start, int end, int[] globalSum) {
        this.start = start;
        this.end = end;
        this.globalSum = globalSum;
    }
    public void run() {
        int localSum = calculateLocalSum();
        synchronized (globalSum) {
            globalSum[0] += localSum;
        }
    }
    private int calculateLocalSum() {
        int localSum = 0;
        for (int i = start; i <= end; i++) {
            localSum += i;
        }
        return localSum;
    }
}

public class As8q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of threads (m): ");
        int numThreads = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] globalSum = new int[]{0};
        int chunkSize = n / numThreads;
        int remainingNumbers = n % numThreads;
        Thread[] threads = new Thread[numThreads];
        int start = 1;
        int end;
        for (int i = 0; i < numThreads; i++) {
            end = start + chunkSize - 1 + (i < remainingNumbers ? 1 : 0);
            threads[i] = new Thread(new SumCalculator(start, end, globalSum));
            threads[i].start();
            start = end + 1;
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum of " + n + " natural numbers using " + numThreads + " threads: " + globalSum[0]);
    }
}