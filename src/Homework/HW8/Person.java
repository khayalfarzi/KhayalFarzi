
package Homework.HW8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;


public class Person extends Human implements HumanCreator {

    Random rnd = new Random();

    public static ArrayList<String> Names() {
        ArrayList<String> name = new ArrayList<>();
        name.add(Names.Khayal.name());
        name.add(Names.Ali.name());
        name.add(Names.Elshan.name());
        name.add(Names.Gul.name());
        name.add(Names.Koko.name());
        name.add(Names.Lala.name());
        name.add(Names.Nikola.name());
        name.add(Names.Nono.name());
        name.add(Names.Pupu.name());
        return name;
    }

    public String randomName() {
        String name = Names().get(rnd.nextInt(9));
        return name;
    }

    @Override
    public Human bornChild(Man father, Woman mother) {

        HashMap<String, String> scedule = new HashMap<>();
        scedule.put(DayOfWeek.SATURDAY.name(), "go to courses; watch a film");
        scedule.put(DayOfWeek.SUNDAY.name(), " do home work ");

        setName(randomName());
        setSurname(father.getSurname());
        setYear(2020);
        setIQ(rnd.nextInt(100));
        setScedule(scedule);
        return new Human(getName(), getSurname(), getYear(), getIQ(), getScedule()) {

            @Override
            String greetPet(Pet pet) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    @Override
    public String greetPet(Pet pet) {

        return "";
    }

}
