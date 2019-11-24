
package Homework.HW9.Animals;

import Homework.HW9.MyExtraPackage.Species;

import java.util.HashSet;
import java.util.Objects;


public abstract class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, HashSet<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String nickname, int age, int trickLevel) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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

    public HashSet<String> getHabits() {
        return habits;
    }

    public void setHabits(HashSet<String> habits) {
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
