package Homework.HW7;

public class Main {
    public static void main(String[] args) {

        Man m = new Man();
        m.setName("Khayal");
        m.setSurname("Pharzi");
        Woman w = new Woman();
        Person p = new Person();
        System.out.println(p.bornChild(m, w));
    }

}
