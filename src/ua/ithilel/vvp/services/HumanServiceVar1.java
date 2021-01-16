package ua.ithilel.vvp.services;

import ua.ithilel.vvp.entities.Human;


import java.util.ArrayList;
import java.util.List;

public class HumanServiceVar1 implements HumanService {

   private List <Human> humanList= new ArrayList<>();

    public boolean repeatHuman (Human human) {
        for (Human elem : humanList) {
            if (elem.equals(human)) return true;
        }
        return false;
    }

    public List<Human> getListSurname(String surname) {
        List <Human> result = new ArrayList<>();
        for (Human human : humanList) {
            if (surname.hashCode() == human.getSurname().hashCode()) {
                if (surname.equalsIgnoreCase(human.getSurname())) {
                    result.add(human);
                }
            }
        }
        return result;
    }
    public List<Human> getListName(String name) {
        List <Human> result = new ArrayList<>();
        for (Human human : humanList) {
            // if (name.hashCode() == humanList.getHuman(i).getName().hashCode()) {
            if (name.equalsIgnoreCase(human.getName())) {
                result.add(human);
            }
            //  }
        }
        return result;
    }

    public void addHuman(Human human) {
        humanList.add(human);
    }

    public void deleteHuman(int readIndexForRemove) {
        humanList.remove(readIndexForRemove);
    }

    public List<Human> getHumanList() {
        return humanList;
    }
}
