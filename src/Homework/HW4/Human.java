package Homework.HW4;

public class Human {

    public String name;
    public String surname;
    public int year;
    public int IQ;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] scedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int IQ, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String greetPet(Pet pet) {
        return " Hello, [" + pet.nickname + "] ";
    }

    public String describePet(Pet pet) {
        return "I have a [" + pet.species + "], he is [" + pet.age + "] "
                + "years old, he is very sly.";

    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", surname=" + surname + ", year=" + year + ", "
                + "IQ=" + IQ + ", pet=" + pet + ", mother=" + mother.name + "  " + mother.surname + ","
                + " father=" + father.name + " " + father.surname + ", "
                + '}';
    }
}
