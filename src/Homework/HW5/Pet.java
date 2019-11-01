
package Homework.HW5;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
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


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.species);
        hash = 59 * hash + Objects.hashCode(this.nickname);
        hash = 59 * hash + this.age;
        hash = 59 * hash + this.trickLevel;
        hash = 59 * hash + Arrays.deepHashCode(this.habits);
        return hash;
    }

    public boolean equals(Pet obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet other = (Pet) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.trickLevel != other.trickLevel) {
            return false;
        }
        if (!Objects.equals(this.species, other.species)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Arrays.deepEquals(this.habits, other.habits)) {
            return false;
        }
        return true;
    }

}
