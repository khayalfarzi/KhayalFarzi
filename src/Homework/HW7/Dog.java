package Homework.HW7;

public class Dog extends Pet implements Foulable {

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.DOG.name() + "]. I miss you!' ";
    }

    @Override
    public String foul() {
        return "  'I need to cover it up' ";
    }
}
