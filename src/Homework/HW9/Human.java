
package Homework.HW9;

import java.util.HashMap;
import java.util.Objects;


public abstract class Human {

    private String name;
    private String surname;
    private int year;
    private int IQ;
    private HashMap<String, String> scedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int IQ, HashMap<String, String> scedule) {
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

    public HashMap<String, String> getScedule() {
        return scedule;
    }

    public void setScedule(HashMap<String, String> scedule) {
        this.scedule = scedule;
    }

    abstract String greetPet(Pet pet);

    public String describePet(Pet pet) {
        return "I have a [" + pet.getSpecies() + "], he is [" + pet.getAge() + "] "
                + "years old, he is very sly.";
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Human Garbage collector is running... ");
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", surname=" + surname + ", "
                + "year=" + year + ", IQ=" + IQ + ", scedule=" + scedule + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                IQ == human.IQ &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(scedule, human.scedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, IQ, scedule);
    }
}
