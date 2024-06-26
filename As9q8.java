package Biswajit.Java;
import java.util.Scanner;
import java.util.Arrays;
public class As9q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 2 strings to check Anagram:\n");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (areAnagrams(str1, str2)) {
            System.out.println("The input strings are Anagram");
        } else {
            System.out.println("The input strings are not Anagram");
        }
    }
    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}