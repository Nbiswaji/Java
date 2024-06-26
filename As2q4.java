package Biswajit.Java;
import java.util.Scanner;
public class As2q4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        if (rows > 1) {
            for (int j = 0; j < columns; j++) {
                int temp = matrix[0][j];
                matrix[0][j] = matrix[rows - 1][j];
                matrix[rows - 1][j] = temp;
            }
        }
        System.out.println("Matrix after swapping first and last rows:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}