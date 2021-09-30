package Inheritance_Example;

import java.util.Scanner;

public class coders extends Employee {

    String langauge;
    Scanner sc = new Scanner(System.in);

    @Override
    void getdetails() {
        // TODO Auto-generated method stub
        super.getdetails();
        System.out.println("Enter your Language");
        langauge = sc.nextLine();
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("Languge: " + langauge);
    }
}
