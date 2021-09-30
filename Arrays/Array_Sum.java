package Arrays;

import java.util.Scanner;

public class Array_Sum {

    public static void main(String[] args) {
        float[] marks = { 0 };
        float sum, subjects, i, avg;
        int j = 0;
        Scanner scan = new Scanner(System.in);
        // Accepting the length of array

        System.out.println("Enter Number of Subjects");
        subjects = scan.nextFloat();
        marks = new float[(int) subjects];

        for (i = 0; i < marks.length; i++) {
            j++;
            System.out.println("Enter Marks for subject " + j);
            marks[(int) i] = scan.nextFloat();
        }
        sum = 0;
        for (i = 0; i < marks.length; i++) {
            sum = marks[(int) i] + sum;
        }

        System.out.println("Total Marks:" + sum);

        avg = (sum / subjects);
        System.out.println("Avrage is " + avg + "%");

    }
}
