package Biswajit.Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class As9q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String inputString = sc.nextLine();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println("The Character " + character + " has occurred " + count + " times");
        }
    }
}