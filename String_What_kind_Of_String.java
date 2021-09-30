import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;

public class String_What_kind_Of_String {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            System.out.print("args[" + i + 1 + "] =   " + args[i] + " =\t " + args[i].length());
            char ch = str.charAt(str.length() - 1);

            if (Character.isLetter(ch)) {
                switch (ch) {

                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        System.out.println(": Vowal");
                        break;
                    default:
                        System.out.println(": Consonent");

                }
            } else {
                if (Character.isDigit(ch)) {
                    System.out.println(": Digit");

                } else
                    System.out.println(": Symbol");
            }
        }

    }
}
