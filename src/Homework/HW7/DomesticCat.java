package Homework.HW7;

public class DomesticCat extends Pet implements Foulable {

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.DOMESTIC_CAT.name() + "]. I miss you!' ";
    }

    @Override
    public String foul() {
        return "  'I need to cover it up' ";
    }
}