package Homework.HW9.Interface;

import Homework.HW9.Human.Human;

import java.util.ArrayList;

public interface HumanCreator {
    ArrayList<Human> bornChild(String father, String mother);
}
