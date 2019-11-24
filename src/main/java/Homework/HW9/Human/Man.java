package Homework.HW9.Human;

import Homework.HW9.Animals.Pet;

public class Man extends Human {

    public String repairCar() {
        return "All man like Cars...";
    }

    @Override
    public String greetPet(Pet pet) {
        return " Hello, [" + pet.getNickname() + "] ";

    }
}