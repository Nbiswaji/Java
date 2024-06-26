package Biswajit.Java;
import java.util.Scanner;

public class As9q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        String reverseString = reverse(inputString);
        System.out.println("Reverse of " + inputString + " is " + reverseString);
    }
    private static String reverse(String input) {
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }
        return reverseString;
    }
}