package Biswajit.Java;
public class Display {
    public Display(int data) {
        System.out.println("Constructor with int data: " + data);
    }

    public Display(float data) {
        System.out.println("Constructor with float data: " + data);
    }

    public Display(int[] data) {
        System.out.print("Constructor with int array data: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public Display(String data) {
        System.out.println("Constructor with String data: " + data);
    }

    public Display(String[] data) {
        System.out.print("Constructor with String array data: ");
        for (String str : data) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}