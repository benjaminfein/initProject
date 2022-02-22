package learning.basic;

public class TypeString {
    public static void main(String[] args) {
        String a = "" + 124830;
        String b = "100000".trim();
        String d = "aaaaDDDDDDDDDDBBBBB";

        int k = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(a + " + " + b + " = " + k);

        int c = (a + b).length();
        System.out.println(c);
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());
    }
}
