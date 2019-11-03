
package Homework.HW7;

import java.util.ArrayList;
import java.util.Arrays;
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
    public String bornChild(Man father, Woman mother) {

        String[] scedule = new String[2];
        scedule[0] = DayOfWeek.SATURDAY.name() + "";
        scedule[1] = DayOfWeek.SUNDAY.name() + "";

        setName(randomName());
        setSurname(father.getSurname());
        setYear(2020);
        setIQ(rnd.nextInt(100));
        setScedule(scedule);

        return getName() + "," + getSurname() + "," + getYear() + "," + getIQ() + "," + Arrays.toString(getScedule());
    }

    @Override
    String greetPet(Pet pet) {

        return "";
    }

}
