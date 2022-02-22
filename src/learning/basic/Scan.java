package learning.basic;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name : ");

        String name = console.nextLine();

        System.out.println(name + ", enter your real balance : ");

        int balance = console.nextInt();

        int outBalance = balance - 100;
        System.out.println(name + ", your balance after purchase will be : " + outBalance);

        System.out.println(name + ", enter Pi number : ");

        double pi = console.nextDouble();

        if(pi == 3.1415926535) {
            System.out.println("You entered the correct number");
            }else{
            System.out.println("You entered incorrect number, change it");
            }
        }
    }

