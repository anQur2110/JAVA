package Arrays;

public class Arrays_Nonrectulgular {
    public static void main(String[] args) {
        boolean arr[][] = new boolean[5][];

        arr[0] = new boolean[1];
        arr[1] = new boolean[2];
        arr[2] = new boolean[3];
        arr[3] = new boolean[2];
        arr[4] = new boolean[1];

        for (boolean b[] : arr) {
            for (boolean bo : b) {
                System.out.print("\t" + bo);
            }
            System.out.println();
        }
    }
}
