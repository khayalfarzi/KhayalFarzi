package Homework.HW9.Animals;

import Homework.HW9.Interface.Foulable;
import Homework.HW9.MyExtraPackage.Species;

public class Dog extends Pet implements Foulable {

    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.DOG.name() + "]. I miss you!' ";
    }

    @Override
    public String foul() {
        return "  'I need to cover it up' ";
    }
}
