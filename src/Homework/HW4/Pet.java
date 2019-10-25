package Homework.HW4;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String habits;

    public Pet() {
    }

    public Pet(String species, String nickname, int age, int tricklevel, String habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println(" I am eating... ");
    }

    public void respond(String name) {
        this.nickname = name;
        System.out.println("' Hello owner. I am - " + name + ". I miss you! '");
    }

    public void foul() {
        System.out.println(" 'I need to cover it up' ");
    }

}
