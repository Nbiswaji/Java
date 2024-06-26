package Biswajit.Java;
import java.util.Scanner;
class MinimumFinder implements Runnable {
    private int[] array;
    private int startIndex;
    private int endIndex;
    private int[] globalMin;
    public MinimumFinder(int[] array, int startIndex, int endIndex, int[] globalMin) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.globalMin = globalMin;
    }
    public void run() {
        int localMin = findLocalMin();
        synchronized (globalMin) {
            if (localMin < globalMin[0]) {
                globalMin[0] = localMin;
            }
        }
    }
    private int findLocalMin() {
        int localMin = array[startIndex];
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (array[i] < localMin) {
                localMin = array[i];
            }
        }
        return localMin;
    }
}
public class As8q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();
        int[] array = new int[numElements];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        }
        int[] globalMin = new int[]{Integer.MAX_VALUE};
        int chunkSize = numElements / numThreads;
        int remainingElements = numElements % numThreads;
        Thread[] threads = new Thread[numThreads];
        int start = 0;
        int end;
        for (int i = 0; i < numThreads; i++) {
            end = start + chunkSize - 1 + (i < remainingElements ? 1 : 0);
            threads[i] = new Thread(new MinimumFinder(array, start, end, globalMin));
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
        System.out.println("Minimum element in the array: " + globalMin[0]);
    }
}