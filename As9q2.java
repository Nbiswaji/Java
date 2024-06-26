package Biswajit.Java;
public class As9q2{
    public static void main(String[] args) {
        String inputString = "String    With   Multiple     Spaces";
        System.out.println(inputString);
        StringManipulator stringManipulator = new StringManipulator();
        String resultString = stringManipulator.removeMultipleSpaces(inputString);
        System.out.println(resultString);
    }
}

class StringManipulator {
    public String removeMultipleSpaces(String input) {
        return input.replaceAll("\\s+"," ");
    }
}