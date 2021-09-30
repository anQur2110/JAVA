package Arrays;

public class Arrays_Programs {

    public static void main(String ar[]) {
        int quiz[] = { 10, 20, 30, 40, 50 };
        int j = 0;

        // Printing array in the same order

        for (int i : quiz) {
            j = j + 1;
            System.out.println("quiz[" + j + "]" + i);
        }

        // Pringing array upside down

        System.out.println("Printing array upside down");
        j = quiz.length;
        for (int k = quiz.length - 1; k >= 0; k--) {
            System.out.println("quiz[" + j + "]" + quiz[k]);
            j = j - 1;
        }

        // String hello2 = Arrays.toString(hello);
        // System.out.println("Array is:" + hello2);
        /*
         * int[] x = { 1, 2, 3, 4, 5 }; int[] y; y = x.clone(); String printed =
         * Arrays.toString(x); String printed2 = Arrays.toString(y);
         * System.out.println(printed); System.out.println(printed2);
         */}
}
