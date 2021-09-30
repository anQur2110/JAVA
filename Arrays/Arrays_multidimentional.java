package Arrays;

import java.util.Scanner;

public class Arrays_multidimentional {
    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 }, { 100, 200, 300,
        // 400, 500 } };
        int[] multi[];
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        row = sc.nextInt();
        System.out.println("Enter the limit");
        col = sc.nextInt();
        multi = new int[row][col];

        System.out.println("i" + multi.length);
        System.out.println("j" + multi[0].length);

        /*
         * for (int n = 0; n < multi.length; n++) { for (int m = 0; m < multi[n].length;
         * m++) { System.out.print(multi[n][m]); } System.out.println(); }
         */
        // Printing and calculating the multiplication table

        for (int i = 0; i < multi.length; i++) {

            for (int j = 0; j < multi[i].length; j++) {

                multi[i][j] = (i + 1) * (j + 1);

            }
        }
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.print("\t" + multi[i][j]);
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
