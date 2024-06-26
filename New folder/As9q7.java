package Biswajit.Java;
import java.util.Scanner;
public class As9q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();
        String[] words = inputSentence.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                capitalizedSentence.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        System.out.println(capitalizedSentence.toString().trim());
    }
}