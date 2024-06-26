package Biswajit.Java;
import java.util.Scanner;
class Employee{
  private String empName;
  private String empNo;
  private int dependentCnt;

  public Employee(String name, String eno, int depcnt) {
    empName = name;
    empNo = eno;
    dependentCnt = depcnt;
  }

  public void showEmpDetails() {
    System.out.println("Employee Number: " + empNo);
    System.out.println("Employee Name: " + empName);
  }

  public int depCount() {
    return dependentCnt;
  }
}
class As4q1emp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employees: ");
    int n = sc.nextInt();
    Employee[] empArray = new Employee[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the name, number and dependent count of employee " + (i + 1) + ": ");
      String name = sc.next();
      String eno = sc.next();
      int depcnt = sc.nextInt();
      empArray[i] = new Employee(name, eno, depcnt);
    }
    System.out.println("The employees with more than two dependents are: ");
    for (int i = 0; i < n; i++) {
      if (empArray[i].depCount() > 2) {
        empArray[i].showEmpDetails();
      }
    }
  }
}