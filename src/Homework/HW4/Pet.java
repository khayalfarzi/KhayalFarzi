package Homework.HW4;

import java.util.Arrays;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String eat() {
        return " 'I am eating' ";
    }

    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + pet.nickname + "]. I miss you!' ";
    }

    public String foul() {
        return "  'I need to cover it up' ";
    }

    @Override
    public String toString() {
        return "Pet{" + "species=" + species + ", nickname=" + nickname + ", "
                + "age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + '}';
    }

}
