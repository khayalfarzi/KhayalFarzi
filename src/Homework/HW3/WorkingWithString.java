package Homework.HW3;

import java.util.Scanner;

public class WorkingWithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] scedule = new String[7][2];

        scedule[0][0] = " Monday ";
        scedule[0][1] = "go to courses; watch a film";
        scedule[1][0] = " Tuesday ";
        scedule[1][1] = " go to IBA Tech Academy; do home work";
        scedule[2][0] = " Wednesday ";
        scedule[2][1] = " go to University ; do home work ";
        scedule[3][0] = " Thursday ";
        scedule[3][1] = " go to IBA Tech Academy; do home work ";
        scedule[4][0] = " Friday ";
        scedule[4][1] = " go to courses; meet the friends ";
        scedule[5][0] = " Saturday ";
        scedule[5][1] = " go to IBA Tech Academy; do home work ";
        scedule[6][0] = " Sunday ";
        scedule[6][1] = " do home work ";
        boolean loopbrk = true;   // for break the Loop

        while (loopbrk == true) {
            System.out.print(" Please, input the day of the week: ");
            String WeekDay = sc.nextLine();

            switch (WeekDay.toLowerCase().trim()) {

                default: {
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
                }
                case "monday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[0][1]);
                    break;
                }
                case "tuesday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[1][1]);
                    break;
                }
                case "wednesday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[2][1]);
                    break;
                }
                case "thursday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[3][1]);
                    break;
                }
                case "friday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[4][1]);
                    break;
                }
                case "saturday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[5][1]);
                    break;
                }
                case "sunday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + scedule[6][1]);
                    break;
                }
                case "exit": {
                    loopbrk = false;
                    break;
                }
            }

        }
    }
}
