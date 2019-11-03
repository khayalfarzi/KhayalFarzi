package Homework.HW7;


public class Woman extends Human {

    public String makeUp() {
        return "All woman like make Up";
    }

    @Override
    public String greetPet(Pet pet) {
        return " Hello, [" + pet.getNickname() + "] ";
    }

}
