package Homework.HW5;

import java.util.ArrayList;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int IQ;
    private ArrayList<String> scedule;
    private Family family;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int IQ, ArrayList<String> scedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.scedule = scedule;
        this.family = family;
    }

    public Human(String name, String surname, int year, int IQ, ArrayList<String> scedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.scedule = scedule;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public ArrayList<String> getScedule() {
        return scedule;
    }

    public void setScedule(ArrayList<String> scedule) {
        this.scedule = scedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String greetPet(Pet pet) {
        return " Hello, [" + pet.getNickname() + "] ";
    }

    public String describePet(Pet pet) {
        return "I have a [" + pet.getSpecies() + "], he is [" + pet.getAge() + "] "
                + "years old, he is very sly.";
    }

    public void toWelcomeTheFavourite() {

    }

    public void toDescribeTheFavourite() {

    }

    public void toFeed() {

    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", surname=" + surname + ", "
                + "year=" + year + ", IQ=" + IQ + ", scedule=" + scedule + ", family=" + family + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.surname);
        hash = 23 * hash + this.year;
        hash = 23 * hash + this.IQ;
        hash = 23 * hash + Objects.hashCode(this.scedule);
        hash = 23 * hash + Objects.hashCode(this.family);
        return hash;
    }

    public boolean equals(Human obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.IQ != other.IQ) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.scedule, other.scedule)) {
            return false;
        }
        if (!Objects.equals(this.family, other.family)) {
            return false;
        }
        return true;
    }

}
