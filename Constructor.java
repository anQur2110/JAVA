
public class Constructor {

    String Name;
    int Roll;
    char std;

    public Constructor() {
        System.out.println("This is non parameterized constructor");
    }

    public Constructor(String Name) {
        this.Name = Name;
        System.out.println("Student Name:" + Name);
    }

    public Constructor(String Name, int Roll) {
        this.Name = Name;
        this.Roll = Roll;
        System.out.println("Student Name:" + Name);
        System.out.println("Student Roll:" + Roll);
    }

    public Constructor(String Name, int Roll, char std) {
        this.Name = Name;
        this.Roll = Roll;
        this.std = std;
        System.out.println("Student Name:" + Name);
        System.out.println("Student Roll:" + Roll);
        System.out.println("Student Class:" + std);
    }

    /*
     * public void display() { System.out.println("Student Name:" + Name);
     * System.out.println("Student Roll:" + Roll);
     * System.out.println("Student Class:" + std); }
     */

}
