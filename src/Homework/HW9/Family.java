
package Homework.HW9;

import java.util.ArrayList;
import java.util.Objects;


public final class Family {

    private int ID;
    private String nameFamily;
    private Human father;
    private Human mother;
    private ArrayList<Human> children;
    private Pet pet;

    public Family() {
    }

    public Family(int ID, String nameFamily, Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.nameFamily = nameFamily;
        this.ID = ID;
    }

    public Family(Human father, Human mother, ArrayList<Human> children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }

    public Family(int ID, String nameFamily, Human father, Human mother, ArrayList<Human> children, Pet pet) {
        this.ID = ID;
        this.nameFamily = nameFamily;
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameFamily() {
        return nameFamily;
    }

    public void setNameFamily(String nameFamily) {
        this.nameFamily = nameFamily;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(ArrayList<Human> child) {
        ArrayList<Human> child1 = new ArrayList<>();
        for (int i = 0; i < child.size(); i++) {
            child1.add(child.get(i));
        }
        setChildren(child1);
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < getChildren().size() - 1) {
            children.remove(index);
            System.out.println(children.get(index) + ": deleted.");
            return true;
        } else {
            return false;
        }
    }

    public boolean deletechild(Human child) {
        boolean checked = false;
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getName().equals(child.getName())) {
                children.remove(i);
                checked = true;
            } else {
                checked = false;
            }
        }
        return checked;
    }

    public String countFamily(Family familyCount) {
        return " The count of family members: " + (familyCount.getChildren().size() + 2);
    }

    public int count() {
        return 0;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Family Garbage Collector is running...");
    }

    @Override
    public String toString() {
        return "Family{" +
                "ID=" + ID +
                ", nameFamily='" + nameFamily + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return ID == family.ID &&
                nameFamily.equals(family.nameFamily) &&
                father.equals(family.father) &&
                mother.equals(family.mother) &&
                children.equals(family.children) &&
                pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nameFamily, father, mother, children, pet);
    }
}
