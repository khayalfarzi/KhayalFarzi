package Homework.HW5;

import java.util.ArrayList;
import java.util.Objects;

public class Family {

    private Human father;
    private Human mother;
    private ArrayList<Human> children;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        ArrayList<Human> Children = new ArrayList<>();

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

    public String addChild(ArrayList<Human> child) {
        setChildren(child);
        return "Conguratulations ! you have " + getChildren().size()
                + " children your child is born now, Information: " + getChildren().toString();
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < getChildren().size()) {
            getChildren().remove(index);
            return true;
        } else {
            return false;
        }

    }

    public String countFamily(Family familyCount) {
        return " The count of family members: " + (familyCount.getChildren().size() + 2);
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", "
                + "children=" + children.toString() + ", pet=" + pet + '}';
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
