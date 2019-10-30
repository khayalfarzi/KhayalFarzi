package Homework.HW3;

import java.util.Scanner;

public class WorkingWithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] Scedule = new String[7][2];

        Scedule[0][0] = " Monday ";
        Scedule[0][1] = "go to courses; watch a film";
        Scedule[1][0] = " Tuesday ";
        Scedule[1][1] = " go to IBA Tech Academy; do home work";
        Scedule[2][0] = " Wednesday ";
        Scedule[2][1] = " go to University ; do home work ";
        Scedule[3][0] = " Thursday ";
        Scedule[3][1] = " go to IBA Tech Academy; do home work ";
        Scedule[4][0] = " Friday ";
        Scedule[4][1] = " go to courses; meet the friends ";
        Scedule[5][0] = " Saturday ";
        Scedule[5][1] = " go to IBA Tech Academy; do home work ";
        Scedule[6][0] = " Sunday ";
        Scedule[6][1] = " do home work ";
        boolean loopBrk = true;   // for break the Loop

        while (loopBrk == true) {
            System.out.print(" Please, input the day of the week: ");
            String WeekDay = sc.nextLine();

            switch (WeekDay.toLowerCase().trim()) {

                default: {
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
                }
                case "monday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[0][1]);
                    break;
                }
                case "tuesday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[1][1]);
                    break;
                }
                case "wednesday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[2][1]);
                    break;
                }
                case "thursday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[3][1]);
                    break;
                }
                case "friday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[4][1]);
                    break;
                }
                case "saturday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[5][1]);
                    break;
                }
                case "sunday": {
                    System.out.println("Your tasks for " + WeekDay + " : " + Scedule[6][1]);
                    break;
                }
                case "exit": {
                    loopBrk = false;
                    break;
                }
            }

        }
    }
}
