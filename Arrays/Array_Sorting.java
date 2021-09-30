package Arrays;

import java.util.Scanner;

public class Array_Sorting {
    public static void main(String[] args) {

        int[] arr;
        // Accepting the length of an Array
        System.out.println("Enter length of an array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        // Initilazing Array variable
        arr = new int[length];

        // Accepting array values
        System.out.println("Enter " + length + " int value in array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing Aray values
        System.out.println("Array values");
        for (int i = 0; i < length; i++) {
            System.out.println("Array[" + i + "]" + arr[i]);
        }

        // Sorting Array
        int j, i;
        System.out.println("Printing sorted array");
        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing Sprted array

        for (i = 0; i < length; i++)
            System.out.println("Array[" + i + "]" + arr[i]);

        sc.close();
    }
}