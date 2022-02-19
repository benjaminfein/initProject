package learning;

import java.util.Locale;

public class TypeString {
    public static void main(String[] args) {
        String a = "" + 124830;
        String b = " + 100000";
        String d = "aaaaDDDDDDDDDDBBBBB";


        System.out.println(a + b);

        int c = (a + b).length();
        System.out.println(c);
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());
    }
}
