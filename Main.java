
public class Main {

    public static void main(String ar[]) {

        // 6th program Method overlaoding Var args

        // 5th Program Method overlaoding
        // Run_Method_Overlaoding_Example();

        // 4th prgoream static methods
        // Run_Static_example();

        // 3rd Program Constructors
        // Run_Constructor();

        // 2nd Program for Encapsulation
        // Run_Encapsulation_program();

        // 1st Program to accept the Employee details
        // Run_Emp();
    }

    public static void Run_Method_Overlaoding_Example() {
        overloaded_methods om = new overloaded_methods();

        om.student("Ankur");
        om.student("Ankur 2", "Wardha");
        om.student("Ankur 3", "Wardha", 45.8f, 60.9f, 70.4f);
        om.student("Ankur 3", "Wardha", 45.8f, 60.9f, 70.4f, 0);
    }

    public static void Run_Static_example() {
        System.out.println("Monkey loves " + Static_method.fruits());
        System.out.println("Monkey also loves " + Static_method.fruits2("Mango and "));
    }

    public static void Run_Constructor() {

        /*
         * Constructor c1 = new Constructor(); Constructor c2 = new
         * Constructor("Kinjal"); Constructor c3 = new Constructor("Pritish", 32);
         * Constructor c4 = new Constructor("Tarun", 31, 'X');
         */
    }

    public static void Run_Encapsulation_program() {

        Encap e = new Encap();
        Encap e2 = new Encap();
        e.setName("pritam");
        e.setRoll_number(200);
        e2.setName("Ram");
        e2.setRoll_number(23);
        System.out.println("Name: " + e.getName());
        System.out.println("Roll Number: " + e.getRoll_number());
        System.out.println("Name: " + e2.getName());
        System.out.println("Roll Number: " + e2.getRoll_number());
    }

    public static void Run_Emp() {
        Employee em = new Employee();
        em.Accept_emp_details();
        em.Show_emp_details();
    }

}
