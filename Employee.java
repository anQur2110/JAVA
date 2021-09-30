import java.util.Scanner;

public class Employee {
    String City, Name, Dept;
    int EmpID;
    boolean Salary;

    public void Accept_emp_details() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employees ID:");
        EmpID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employees Name:");
        Name = sc.nextLine();
        System.out.print("Enter employees City:");
        City = sc.nextLine();
        System.out.print("Enter employees Dept:");
        Dept = sc.nextLine();
        sc.close();
    }

    public void Show_emp_details() {
        System.out.print("Employess details");
        System.out.print("\nEmployess Name:\t" + Name);
        System.out.print("\nEmployess ID:\t" + EmpID);
        System.out.print("\nEmployess Dept:\t" + Dept);
        System.out.print("\nEmployess City:\t" + City);
    }

}
