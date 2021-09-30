import java.util.Scanner;
import java.lang.*;

public class Palindrome {
    public static void main(String[] args) {
        String str, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        str = sc.nextLine();

        if (new StringBuffer(str).reverse().toString().equals(str))

        /*
         * StringBuffer sb = new StringBuffer(str); sb.reverse().toString();
         * 
         * if (sb.toString().equals(str))
         */ {
            System.out.println(str + " Is Palindrome");
        } else
            System.out.println(str + " Is Not a Palindrome");
        sc.close();

    }

}
