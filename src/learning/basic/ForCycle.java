package learning.basic;

import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the variable, from which you want to calculate the factorial : ");
        int f = console.nextInt();
        System.out.println("You entered " + f);
        int k = 1;
        for (int i = 1; i <= f; i++)
            k = k * i;
        System.out.println("Result : " + f + "! = " + k);
    }
}
