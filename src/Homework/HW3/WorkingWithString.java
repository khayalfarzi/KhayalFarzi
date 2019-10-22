package Homework.HW3;

import java.util.Scanner;

public class WorkingWithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] scedule = new String[7][2];
        scedule[0][0] = " Sunday ";
        scedule[0][1] = " do home work ";
        scedule[1][0] = " Monday ";
        scedule[1][1] = "go to courses; watch a film";
        boolean loopbrk =true;   // for break the Loop

        while (loopbrk ==true) {
            System.out.print(" Please, input the day of the week: ");
            String WeekDay = sc.nextLine();

            switch (WeekDay.toLowerCase().trim()) {

                default: {
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
                }
                case "monday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[1][1]);
                    break;
                }
                case "sunday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[0][1]);
                    break;
                }
                case "exit": {
                    loopbrk=false;
                    break;
                }
            }

        }
    }
}
