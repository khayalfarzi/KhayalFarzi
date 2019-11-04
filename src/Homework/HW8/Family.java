
package Homework.HW8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public final class Family {

    private Human father;
    private Human mother;
    private ArrayList<Human> children;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;

    }

    public Family(Human father, Human mother, ArrayList<Human> children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
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

    public void addChild(Human child) {
        ArrayList<Human> childArrList = new ArrayList<>();
        childArrList.add(child);
        setChildren(childArrList);
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

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Family Garbage Collector is running...");
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", "
                + "children=" + children + ", pet=" + pet + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.father);
        hash = 97 * hash + Objects.hashCode(this.mother);
        hash = 97 * hash + Objects.hashCode(this.children);
        hash = 97 * hash + Objects.hashCode(this.pet);
        return hash;
    }

    public boolean equals(Family obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Family other = (Family) obj;
        if (!Objects.equals(this.father, other.father)) {
            return false;
        }
        if (!Objects.equals(this.mother, other.mother)) {
            return false;
        }
        if (!Objects.equals(this.children, other.children)) {
            return false;
        }
        if (!Objects.equals(this.pet, other.pet)) {
            return false;
        }
        return true;
    }

}
