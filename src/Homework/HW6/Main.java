
package Homework.HW6;


public class Main {

    public static void main(String[] args) {

        String[] scedule = new String[2];
        scedule[0] = DayOfWeek.SATURDAY.name() + "\"Meet the friends and do some activities\"";
        scedule[1] = DayOfWeek.SUNDAY.name() + "\"Watch TV, play different games\"";

        // First Family example
        Family Pharziyevs = new Family(
                new Human("Khayal", "Pharzi", 1998, 99, scedule),
                new Human("Ola", "Pharzi", 1998, 98, scedule));

        Human[] childrenPharziyevs = {
                new Human("Nikola", "Pharzi", 2020),
                new Human("Pupu", "Pharzi", 2020),
                new Human("Nono", "Pharzi", 2020),
                new Human("Tutu", "Pharzi", 2020),
                new Human("Lala", "Pharzi", 2020)
        };
        Pharziyevs.addChild(childrenPharziyevs);
        System.out.println(Pharziyevs.countFamily(Pharziyevs));
        System.out.println(Pharziyevs.deleteChild(3));
        System.out.println(Pharziyevs.countFamily(Pharziyevs));
        System.out.println(Pharziyevs.toString());

        System.out.println("");

        // Second Family example
        Family Valiyevs = new Family(
                new Human("Vali", "Valiyev", 1989, 89, scedule),
                new Human("Gul", "Valiyeva", 1999, 95, scedule));

        Human[] childrenValiyevs = {
                new Human("Ali", "Valiyev", 1),
                new Human("Aliya", "Valiyeva", 2),
                new Human("Nail", "Valiyev", 5),
                new Human("Naila", "Valiyeva", 9),
                new Human("Gulu", "Valiyeva", 9),
                new Human("Elshan", "Valiyeva", 9),
                new Human("Hadi", "Valiyeva", 9),
                new Human("Gulehmed", "Valiyeva", 9)
        };
        Valiyevs.addChild(childrenValiyevs);
        System.out.println(Valiyevs.countFamily(Valiyevs));
        System.out.println(Valiyevs.deleteChild(6));
        System.out.println(Valiyevs.deletechild(childrenValiyevs[2]));
        System.out.println(Valiyevs.countFamily(Valiyevs));
        System.out.println(Valiyevs.toString());
    }

}
