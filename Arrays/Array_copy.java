package Arrays;

import java.util.Scanner;

public class Array_copy {
    public static void main(String[] args) {
        int[] old = { 1, 2, 3, 4, 5 };
        int[] temp = new int[10];

        System.arraycopy(old, 0, temp, 0, 5);

        old = temp;
        temp = null;

        for (int i : old)
            System.out.println(i);

    }
}
