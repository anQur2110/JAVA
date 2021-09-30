package Inheritance_Example;

public class Director extends Manager {

    double Car_allowence;
    String Car;

    @Override
    void getdetails() {
        // TODO Auto-generated method stub
        super.getdetails();
        System.out.println("Enter car allowence");
        Car_allowence = super.sc.nextDouble();
        System.out.println("Enter Car name");
        Car = super.sc.nextLine();

    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("Car Allowence:" + Car_allowence);
        System.out.println("Car Model:" + Car);
    }
}