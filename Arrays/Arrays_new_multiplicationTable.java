package Arrays;

import java.util.Scanner;

public class Arrays_new_multiplicationTable {
    public static void main(String[] args) {

        int[] multi[];
        int i, j;
        int num1 = 1;
        int num2 = 10;
        Scanner scanner = new Scanner(System.in);

        multi = new int[num1][num2];

        for (i = 0; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }

    }
}
