
public class Encap {

    private int roll_number;
    private String Name;

    public void setName(String Name) {
        if (Name.isEmpty())
            this.Name = "Unknown";
        else

            this.Name = Name;
    }

    public void setRoll_number(int roll_number) {
        if ((roll_number < 0) || (roll_number > 100))
            this.roll_number = 1;
        else
            this.roll_number = roll_number;
    }

    public String getName() {
        return this.Name;
    }

    public int getRoll_number() {
        return this.roll_number;
    }
}
