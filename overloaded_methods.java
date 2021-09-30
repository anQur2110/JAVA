public class overloaded_methods {

    String Name, Address, Surname;
    float Math, English, Chemistry;
    double Percentage;

    public void student(String Name) {

        System.out.println("Student Name: " + Name);

    }

    public void student(String Name, String Address) {
        System.out.println("\nStudent Name: " + Name);
        System.out.println("Student Address: " + Address);
    }

    public void student(String Name, String Address, float Math, float English, float Chemistry) {
        System.out.println("\nStudent Name: " + Name);
        System.out.println("Student Address: " + Address);
        System.out.println("Math: " + Math);
        System.out.println("English: " + English);
        System.out.println("Chemistry: " + Chemistry);
    }

    public void student(String Name, String Address, float Math, float English, float Chemistry, double Percentage) {
        System.out.println("\nStudent Name: " + Name);
        System.out.println("Student Address: " + Address);
        System.out.println("Math: " + Math);
        System.out.println("English: " + English);
        System.out.println("Chemistry: " + Chemistry);
        Percentage = (Math + English + Chemistry) / 3;
        System.out.println("Percentage: " + Percentage);
    }

}
