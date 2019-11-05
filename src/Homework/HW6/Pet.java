package Homework.HW6;

import Homework.HW6.Species;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
import java.util.Objects;

/*

package Homework.HW6;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String [] habits;

    public Pet() {
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
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
