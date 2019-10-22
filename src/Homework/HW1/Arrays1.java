package Homework.HW1;

import java.util.Random;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Scanner sc =new  Scanner(System.in);
        Random rnd=new Random();
        int range=rnd.nextInt(100);
        boolean loop=true;
        System.out.println("Let the game begin!");
        System.out.print("Please enter your name... ");
        String name = sc.nextLine();

        while (loop) {
            System.out.print("Please enter number...");
            int number = sc.nextInt();

            if(range>number){
                System.out.println("Your number is too small. Please, try again.");
            }

            else if (range<number) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else { System.out.println("Congratulations, { "+name+" }! ");
                loop=false;
            }

        }

    }
}
