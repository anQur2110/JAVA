public class String_Programs {
    public static void main(String[] args) {

        String str = new String("Hello");
        String str2 = new String("Hello");
        String str3 = ("Hello");
        String str4 = ("hello");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        int len;
        System.out.println(len = str4.length());

    }
}
