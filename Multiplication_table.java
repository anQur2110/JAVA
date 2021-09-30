import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        int num = 2;
        int num2 = 10;
        int i, j;
        Scanner cs = new Scanner(System.in);
        System.out.println("enter number for Multiplication table");
        num = cs.nextInt();
        System.out.println("enter number for Multiplication table limit");
        num2 = cs.nextInt();

        for (i = num; i <= num; i++) {
            for (j = 1; j <= num2; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}
