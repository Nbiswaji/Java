package Biswajit.Java;
import java.util.Scanner;

class Employee {
    String name;
    int empNo;
    int basicSalary;
    int da;
    int hra;
    int gross;

    Employee(String name, int empNo, int basicSalary) {
        name = name;
        empNo = empNo;
        basicSalary = basicSalary;

    }

    public void displayAll() {
        da = (basicSalary * 30) / 100;
        hra = (basicSalary * 10) / 100;
        gross = basicSalary + da + hra;

        System.out.println(gross);
    }

}

/**
 * As3q2
 */
public class As3q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee("ram", 2, 10000);
        obj.displayAll();
    }
}