package learning;
import java.util.Scanner;

public class IfElseOperators {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Unnamed ship, please enter your name : ");
        String nameOfShip = console.nextLine();
        System.out.println("Ok, " + nameOfShip + ", now please enter your tonnage(from 1 to 100) and we will count your size by world standart : ");
        int tonnage = console.nextInt();
        int size = 0;
        if(tonnage >= 1 && tonnage <=10)
            size = 1;
        else{
            if(tonnage > 10 && tonnage <=20)
                size = 2;
            else{
                if(tonnage > 20 && tonnage <=30)
                    size = 3;
                else{
                    if(tonnage > 30 && tonnage <=40)
                        size = 4;
                    else{
                        if(tonnage > 40 && tonnage <=50)
                            size = 5;
                        else{
                            if(tonnage > 50 && tonnage <=60)
                                size = 6;
                            else{
                                if(tonnage > 60 && tonnage <=70)
                                    size = 7;
                                else{
                                    if(tonnage > 70 && tonnage <=80)
                                        size = 8;
                                    else{
                                        if(tonnage > 80 && tonnage <=90)
                                            size = 9;
                                        else{
                                            if(tonnage > 90 && tonnage <=100)
                                                size = 10;
                                            else{
                                                System.out.println("Please, try again(You enter incorrect tonnage)");

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Ok, size of your ship : " + size);
        int sizeOfPort = 60;
        if(size > sizeOfPort)
            System.out.println("You can't put your ship into our Port, because your size is too huge");
        else{
            sizeOfPort = sizeOfPort - size;
            System.out.println("Ok, you can put your ship into our Port. Remaining places : " + sizeOfPort);
        }
    }
}
