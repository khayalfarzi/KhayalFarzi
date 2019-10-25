package Homework.HW4;

public class Human {
    public  String name;
    public  String surname;
    public  int year;
    public  byte iq;
    public Pet pet;
    public  Human mother;
    public Human father;
    public  String[][] scedule;

    public Human() {
    }

    public Human(String name, String surname, int year, byte iq, Pet pet, Human mother, Human father, String[][] scedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.scedule = scedule;
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

    public  void greetpet(){
        System.out.println("Hello "+pet.nickname);
    }
    public  void describePet(){
        System.out.println(" I have a "+pet.species+" he is "+pet.age+" years old he is ...");
    }
}
