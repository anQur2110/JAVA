package Inheritance_Example;

import java.util.Scanner;

public class Employee {

    String Name, ID;
    double Basic_salary;
    Scanner sc = new Scanner(System.in);

    void getdetails() {
        System.out.println("Enter Name");
        Name = sc.nextLine();
        System.out.println("Employee ID");
        ID = sc.nextLine();
        System.out.println("Enter Salary");
        Basic_salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Name:" + Name);
        System.out.println("ID:" + ID);
        System.out.println("Basic salary" + Basic_salary);
    }

}
