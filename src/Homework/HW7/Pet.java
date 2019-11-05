
package Homework.HW7;

import java.util.Arrays;
import java.util.Objects;


public abstract class Pet {

    private Species species;
    private Species nickname;
    private int age;
    private int trickLevel;
    private Species[] habits;

    public Pet() {
    }

    public Pet(Species nickname) {
        this.nickname = nickname;
    }

    public Pet(Species nickname, int age, int trickLevel, Species[] habits) {
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

    public Species[] getHabits() {
        return habits;
    }

    public void setHabits(Species[] habits) {
        this.habits = habits;
    }

    public abstract String respond(Pet pet);

    public void eat() {
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Garbage collector is running... ");
    }

    @Override
    public String toString() {
        return "Pet{" + "species=" + species + ", nickname=" + nickname + ","
                + " age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + '}';
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
