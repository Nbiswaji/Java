package Biswajit.Java;
import java.util.Scanner;
public class As2q1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[10];
            boolean flag = false;
            int j;
            System.out.println("Enter 10 numbers:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt();
            }
            System.out.print("Enter the number to search: ");
            int searchNumber = scanner.nextInt();
            for (j = 0; j < 10; j++) {
                if (numbers[j] == searchNumber) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Number found at position: " + j);
            } else {
                System.out.println("Number not found in the array.");
            }
        }
    }
