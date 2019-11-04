package Homework.HW8;

public class Main {
    public static void main(String[] args) {

        Man m = new Man();
        m.setName("Khayal");
        m.setSurname("Pharzi");

        Woman w = new Woman();
        w.setName("Gul");
        w.setSurname("Guliyeva");

        Person p = new Person();
        Human child = p.bornChild(m, w);
        System.out.println(child);

        Family Pharziyevs = new Family(m, w);
        Pharziyevs.addChild(child);
        System.out.println(Pharziyevs.toString());
    }

}
