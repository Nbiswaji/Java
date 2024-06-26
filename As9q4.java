package Biswajit.Java;
import java.util.Scanner;
public class As9q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to find its sub-strings: ");
        String inputString = sc.nextLine();
        SubstringFinder substringFinder = new SubstringFinder();
        System.out.println("Sub-strings of the string \"" + inputString + "\" are ");
        substringFinder.findSubstrings(inputString);
    }
}
class SubstringFinder {
    public void findSubstrings(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}