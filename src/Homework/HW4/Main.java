package Homework.HW4;

public class Main {

    public static void main(String[] args) {


        String[] habit = {"'eat'", "'drink'", "'sleep'"};

        Pet pet = new Pet();
        Pet pet1 = new Pet("dog", "Rock");
        Pet pet2 = new Pet(pet1.species, pet1.nickname, 5, 75, habit);

        Human child = new Human();
        Human mother = new Human("Jane", "Karleone");
        Human father = new Human("Vito", "Karleone");
        Human human1 = new Human("Michael", "Karleone", 1977);
        Human human2 = new Human(human1.name, human1.surname, human1.year, mother, father);
        Human human3 = new Human(human1.name, human1.surname, human1.year, 90, pet2, mother, father);

        System.out.println(human3.toString());
        System.out.println(child.greetPet(pet1));
        System.out.println(pet.respond(pet1));
        System.out.println(child.describePet(pet2));


    }
}
