
package Homework.HW8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;


public abstract class Pet {

    private Species species;
    private Species nickname;
    private int age;
    private int trickLevel;
    private HashSet<Species> habits;

    public Pet() {
    }

    public Pet(Species nickname) {
        this.nickname = nickname;
    }

    public Pet(Species nickname, int age, int trickLevel, HashSet<Species> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Species getNickname() {
        return nickname;
    }

    public void setNickname(Species nickname) {
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

    public HashSet<Species> getHabits() {
        return habits;
    }

    public void setHabits(HashSet<Species> habits) {
        this.habits = habits;
    }

    public abstract String respond(Pet pet);

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Garbage collector is running... ");
    }

    @Override
    public String toString() {
        return "Pet{" + "species=" + species + ", nickname=" + nickname +
                ", age=" + age + ", trickLevel=" + trickLevel + ", habits=" + habits + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.species);
        hash = 67 * hash + Objects.hashCode(this.nickname);
        hash = 67 * hash + this.age;
        hash = 67 * hash + this.trickLevel;
        hash = 67 * hash + Objects.hashCode(this.habits);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
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
        if (this.species != other.species) {
            return false;
        }
        if (this.nickname != other.nickname) {
            return false;
        }
        if (!Objects.equals(this.habits, other.habits)) {
            return false;
        }
        return true;
    }

}
