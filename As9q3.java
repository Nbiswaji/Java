package Biswajit.Java;
import java.util.Arrays;
public class As9q3{
    public static void main(String[] args) {
        String[] namesArray = {"Ram", "John", "Harish", "Anand", "Ajay"};
        System.out.println("The Original Array:");
        System.out.println(Arrays.toString(namesArray));
        NameSorter nameSorter = new NameSorter();
        nameSorter.sortNames(namesArray);
        System.out.println("The Sorted Array:");
        System.out.println(Arrays.toString(namesArray));
    }
}

class NameSorter {
    public void sortNames(String[] names) {
        Arrays.sort(names);
    }
}