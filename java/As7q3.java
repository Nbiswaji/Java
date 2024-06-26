package Biswajit.Java;
import java.util.Scanner;
public class As7q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the index position to retrieve: ");
        int index = scanner.nextInt();
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Please enter a valid index.");
        } 
    }
}