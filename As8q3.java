package Biswajit.Java;
import java.util.Scanner;
class VectorMultiplier implements Runnable {
    private int[] vector1;
    private int[] vector2;
    private int[] result;
    private int startIndex;
    private int endIndex;
    public VectorMultiplier(int[] vector1, int[] vector2, int startIndex, int endIndex) {
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.result = new int[(endIndex - startIndex) / 2 + 1];
    }
    public void run() {
        multiplyVectors();
    }
    private void multiplyVectors() {
        int resultIndex = 0;

        for (int i = startIndex; i <= endIndex; i += 2) {
            result[resultIndex] = vector1[i] * vector2[i];
            resultIndex++;
        }
    }
    public int[] getResult() {
        return result;
    }
}
public class As8q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the vectors: ");
        int size = scanner.nextInt();
        int[] vector1 = new int[size];
        int[] vector2 = new int[size];
        System.out.println("Enter elements for the first vector:");
        for (int i = 0; i < size; i++) {
            vector1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements for the second vector:");
        for (int i = 0; i < size; i++) {
            vector2[i] = scanner.nextInt();
        }
        VectorMultiplier oddMultiplier = new VectorMultiplier(vector1, vector2, 1, size - 1);
        VectorMultiplier evenMultiplier = new VectorMultiplier(vector1, vector2, 0, size - 2);
        Thread oddThread = new Thread(oddMultiplier);
        Thread evenThread = new Thread(evenMultiplier);
        oddThread.start();
        evenThread.start();
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] oddResult = oddMultiplier.getResult();
        int[] evenResult = evenMultiplier.getResult();
        int[] finalResult = new int[size / 2];
        int resultIndex = 0;
        for (int i = 0; i < oddResult.length; i++) {
            finalResult[resultIndex++] = oddResult[i];
        }
        resultIndex = 0;
        for (int i = 0; i < evenResult.length; i++) {
            finalResult[resultIndex++] = evenResult[i];
        }
        System.out.println("Result Vector:");
        for (int value : finalResult) {
            System.out.print(value + " ");
        }
    }
}