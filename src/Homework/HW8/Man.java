package Homework.HW8;

public class Man extends Human {

    public String repairCar() {
        return "All man like Cars...";
    }

    @Override
    public String greetPet(Pet pet) {
        return " Hello, [" + pet.getNickname() + "] ";

    }
}