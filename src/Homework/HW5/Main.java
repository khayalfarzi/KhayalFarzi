package Homework.HW5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] habit = {"'eat'", "'drink'", "'sleep'"};
        ArrayList<String> schedule = new ArrayList<>();
        schedule.add("\"Saturday\",\"Meet the friends and do some activities\"");
        schedule.add("\"Sunday\",\"Watch TV, play different games\"");

        // First Family example
        Family Pharziyevs = new Family(
                new Human("Khayal", "Pharzi", 1998, 99, schedule),
                new Human("Ola", "Pharzi", 1998, 98, schedule));

        ArrayList<Human> childPharziyevs = new ArrayList<>();
        childPharziyevs.add(new Human("Lola", "Pharzi", 8));
        childPharziyevs.add(new Human("Lola", "Pharzi", 8));
        Pharziyevs.addChild(childPharziyevs);

        System.out.println(Pharziyevs.addChild(childPharziyevs));
        System.out.println(Pharziyevs.deleteChild(1));
        System.out.println(Pharziyevs.countFamily(Pharziyevs));
        System.out.println(Pharziyevs.toString());

        System.out.println("");

        // Second Family example
        Family Valiyevs = new Family(
                new Human("Vali", "Valiyev", 1989, 89, schedule),
                new Human("Gul", "Valiyeva", 1999, 95, schedule));

        ArrayList<Human> childValiyevs = new ArrayList<>();
        childValiyevs.add(new Human("Ali", "Valiyev", 1));
        childValiyevs.add(new Human("Aliya", "Valiyeva", 2));
        childValiyevs.add(new Human("Nail", "Valiyev", 5));
        childValiyevs.add(new Human("Naila", "Valiyeva", 9));

        System.out.println(Valiyevs.addChild(childValiyevs));
        System.out.println(Valiyevs.countFamily(Valiyevs));
        System.out.println(Valiyevs.toString());

    }

}
