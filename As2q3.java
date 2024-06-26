package Biswajit.Java;
 import java.util.Scanner;
public class As2q3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[n-1];
                    arr[n-1] = temp;
                    n--;
                    j--;
                }
            }
        }
        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
