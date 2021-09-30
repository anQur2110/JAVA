package Inheritance_Example;

import java.util.Scanner;

public class FInal {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager();
        Manager d = new Director();
        Employee c = new coders();

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a srting");
        str = sc.nextLine();
        System.out.println(str);

        System.out.println("Enter details");
        System.out.println("1.Employee");
        System.out.println("2.Manager");
        System.out.println("3.Director");
        System.out.println("4.coder");
        System.out.println("5.EXIT");

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                e.getdetails();
                e.display();
                break;
            case 2:
                m.getdetails();
                m.display();
                break;
            case 3:
                d.getdetails();
                d.display();
                break;
            case 4:
                c.getdetails();
                c.display();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();

    }
}
