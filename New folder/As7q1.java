package Biswajit.Java;
import mypack.Display;
public class As7q1{
    public static void main(String[] args) {
        Display intConstructor = new Display(42);
        Display floatConstructor = new Display(3.14f);
        Display intArrayConstructor = new Display(new int[]{1, 2, 3, 4, 5});
        Display stringConstructor = new Display("Hello, World!");
        Display stringArrayConstructor = new Display(new String[]{"Java", "is", "awesome"});
    }
}