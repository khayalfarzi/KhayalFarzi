
package Homework.HW5;

import java.util.Arrays;
import java.util.Objects;


public final class Family {

    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;

    }

    public Family(Human father, Human mother, Human[] children, Pet pet) {
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human[] child) {
        children = new Human[child.length];
        System.arraycopy(child, 0, children, 0, child.length);
    }

    public boolean deleteChild(int index) {
        Human[] newChildren = new Human[getChildren().length - 1];
        if (index >= 0 && index < getChildren().length - 1) {
            for (int i = 0; i < newChildren.length; i++) {
                if (i != index) {
                    newChildren[i] = getChildren()[i];

                } else if (i == index) {
                    System.out.println(getChildren()[i] + " deleted ");
                }
            }
            setChildren(Arrays.copyOf(newChildren, newChildren.length));
            return true;
        } else {
            return false;
        }

    }

    public String countFamily(Family familyCount) {
        return " The count of family members: " + (familyCount.getChildren().length + 2);
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", "
                + "children=" + Arrays.toString(children) + ", pet=" + pet + '}';
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

