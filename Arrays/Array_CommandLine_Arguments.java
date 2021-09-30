package Arrays;

public class Array_CommandLine_Arguments {
    public static void main(String[] args) {
        int sum = 0;
        for (String i : args)
            sum = Integer.parseInt(i) + sum;

        int avg = sum / args.length;

        System.out.println("Sum:" + sum);
        System.out.println("Avg:" + avg);
    }
}
