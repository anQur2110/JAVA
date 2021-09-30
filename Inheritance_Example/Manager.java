package Inheritance_Example;

public class Manager extends Employee {

    double Manager_bonus;

    @Override
    void getdetails() {
        // TODO Auto-generated method stub
        super.getdetails();
        System.out.println("Enter Managers bonus");
        Manager_bonus = sc.nextDouble();

    }

    @Override
    void display() {
        super.display();
        System.out.println("Managers bonus:" + Manager_bonus);
    }
}
