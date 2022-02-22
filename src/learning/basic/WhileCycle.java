package learning.basic;

import java.util.Scanner;

public class WhileCycle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter your name : ");
        String name = console.nextLine();
        int agreement = 0;
        double price = 15;
        while(agreement == 0 || agreement == 2) {
            System.out.println("Ok, now we can suggest our special sale for client like you! It's a Ford Mustang just about " + price + "k$! Just write '1' if you agree, " +
                    "'2' if you want to think or '0' if you don't agree : ");
            agreement = console.nextInt();
            if (agreement == 1) {
                System.out.println("Ok, " + name + ", this Mustang is yours! You buy it for " + price + "k$");
                break;
            }
            if (agreement == 0 || price <= 7.5){
                System.out.println("Deal failed. Have a good day, " + name + "!");
                break;
            }
            if (agreement == 2) {
                price -= 1.5;
                System.out.println("Ok, " + name + ", now we can suggest same Mustang for only " + price + "k$. What do you think about that? Just write '1' if you agree, " +
                        "'2' if you want to think or '0' if you don't agree : ");
                agreement = console.nextInt();
                continue;
            }
        }

    }
}
