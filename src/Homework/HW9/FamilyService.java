package Homework.HW9;

import Homework.HW9.MyExtraPackage.Extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FamilyService implements FamilyDao<Family> {

    private ArrayList<Family> Families = new ArrayList<>();
    private CollectionFamilyDao cfd;

    public ArrayList<Family> getFamilies() {
        return Families;
    }

    public void setFamilies(ArrayList<Family> families) {
        Families = families;
    }

    public CollectionFamilyDao getCfd() {
        return cfd;
    }

    public void setCfd(CollectionFamilyDao cfd) {
        this.cfd = cfd;
    }

    @Override
    public List<Family> getAllFamilies() {
        ArrayList<Family> allFamily = new ArrayList<>();
        for (int i = 0; i < Families.size(); i++) {
            allFamily.add(Families.get(i));
        }
        return allFamily;
    }

    @Override
    public List<Family> getFamilyByIndex(int index) {
        ArrayList<Family> getFamily = new ArrayList<>();
        for (int i = 0; i < getFamilies().size(); i++) {
            if (index == i) {
                getFamily.add(getFamilies().get(i));
            }
        }
        return getFamily;
    }

    @Override
    public boolean deleteFamily(int index) {
        boolean result = false;
        if (index >= 0 && index < Families.size()) {
            for (int i = 0; i < Families.size(); i++) {
                if (index == i) {
                    Families.remove(index);
                    return result = true;
                } else {
                    return result;
                }
            }
        }
        return result;
    }

    @Override
    public boolean deleteFamily(String family) {
        boolean result = false;
        for (int i = 0; i < Families.size(); i++) {
            if (Families.get(i).getNameFamily().equals(family)) {
                Families.remove(i);
                return result = true;
            }
        }
        return result;
    }

    @Override
    public void saveFamily(List<Family> family) {
        cfd.saveFamily(family);
    }

    @Override
    public void displayAllFamilies() {
        for (int i = 0; i < Families.size(); i++) {
            System.out.println(Families.get(i));
        }
    }

    @Override
    public List<Family> getFamiliesBiggerThan() {
        List<Family> biggerFamily = new ArrayList<>();
        biggerFamily.add(Families.get(0));
        for (int i = 0; i < Families.size(); i++) {
            if (biggerFamily.get(0).getChildren().size() + 2 > Families.get(i).getChildren().size() + 2) {
                biggerFamily.add(Families.get(i));
            } else {
                biggerFamily.add(Families.get(0));
            }
        }
        return biggerFamily;
    }

    @Override
    public List<Family> getFamiliesLessThan() {
        List<Family> lessFamily = new ArrayList<>();
        lessFamily.add(Families.get(0));
        for (int i = 0; i < Families.size(); i++) {
            if (lessFamily.get(0).getChildren().size() + 2 < Families.get(i).getChildren().size() + 2) {
                lessFamily.add(Families.get(i));
            } else {
                lessFamily.add(Families.get(0));
            }
        }
        return lessFamily;

    }

    @Override
    public ArrayList<Integer> countFamiliesWithMemberNumber() {
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < Families.size(); i++) {
            count.add(Families.get(i).getChildren().size() + 2);
        }
        return count;
    }

    @Override
    public void createNewFamily(int ID, String name, Human man, Human woman) {
        Family family = new Family(ID, name, man, woman);
        Families.add(family);
    }

    @Override
    public void deleteFamilyByIndex(int index) {
        if (index >= 0 && index <= Families.size()) {
            Families.remove(index);
            System.out.println(Families.get(index).getNameFamily() + " deleted! ");
        } else {
            throw new IndexOutOfBoundsException("This index not in range Families");
        }
    }

    @Override
    public ArrayList<Family> bornChild(ArrayList<Family> family, String masculie, String feminine) {
        Person person = new Person();
        ArrayList<Family> reNewedFamily = new ArrayList<>();

        for (int i = 0; i < Families.size(); i++) {
            if (family.get(0).getNameFamily().equals(Families.get(i).getNameFamily())) {
                if (Families.get(i).getFather().getName().equals(masculie) &&
                        Families.get(i).getMother().getName().equals(feminine)) {

                    family.get(0).setChildren(person.bornChild(masculie, feminine));
                    Families.add(i, family.get(0));
                    reNewedFamily.add(Families.get(i));
                    break;
                }
                break;
            }
        }
        return reNewedFamily;
    }

    @Override
    public List<Family> adoptChild(ArrayList<Family> family, Human human) {
        ArrayList<Family> reNewedFamily = new ArrayList<>();
        for (int i = 0; i < Families.size(); i++) {
            if (Families.get(i).getNameFamily().equals(family.get(0).getNameFamily())) {
                ArrayList<Human> humans = new ArrayList<>();
                humans.add(human);
                family.get(0).setChildren(humans);
                Families.add(i, family.get(0));
                reNewedFamily.add(Families.get(i));
                break;
            }
        }
        return reNewedFamily;
    }

    @Override
    public void deleteAllChildrenOlderThen(int i) {
        for (int j = 0; j < Families.size(); j++) {
            if (Families.get(j).getChildren().get(j).getYear() > i) {
                Families.remove(Families.get(j).getChildren().get(j));
                System.out.println(Families.get(j).getChildren().get(j));
            }
        }
    }

    @Override
    public int count() {
        return Families.size();
    }

    @Override
    public List<Family> getFamilyById(int id) {
        ArrayList<Family> getId = new ArrayList<>();
        for (int i = 0; i < Families.size(); i++) {
            if (i == id - 1) {
                getId.add(Families.get(i));
            }
        }
        return getId;
    }

    @Override
    public List<Pet> getPets(int index) {
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < Families.size(); i++) {
            if (i == index) {
                pets.add(Families.get(i).getPet());
            }
        }
        return pets;
    }

    @Override
    public void addPet(int index, Pet pet) {
        Family family = new Family();
        family.setPet(pet);
        for (int i = 0; i < Families.size(); i++) {
            if (i == index) {
                Families.add(i, family);
            }
        }
    }

    @Override
    public String toString() {
        return "FamilyService{" +
                "Families=" + Families +
                '}';
    }
}
