package ua.ithilel.vvp.services;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.myException.HumanException;

import java.util.LinkedHashSet;
import java.util.Set;

public class HumanServiceVar1 implements HumanService {

    private Set<Human> humanList = new LinkedHashSet<>();

    public Set<Human> getListSurname(String surname) {
        Set<Human> result = new LinkedHashSet<>();
        for (Human human : humanList) {
            if (surname.hashCode() == human.getSurname().hashCode()) {
                if (surname.equalsIgnoreCase(human.getSurname())) {
                    result.add(human);
                }
            }
        }
        return result;
    }

    public Set<Human> getListName(String name) {
        Set<Human> result = new LinkedHashSet<>();
        for (Human human : humanList) {
            // if (name.hashCode() == humanList.getHuman(i).getName().hashCode()) {
            if (name.equalsIgnoreCase(human.getName())) {
                result.add(human);
            }
            //  }
        }
        return result;
    }

    public void addHuman(Human human)  {

        humanList.add(human);
    }

    public void deleteHuman(int readIndexForRemove) {
        int i = 1;
        for (Human human : humanList) {
            if (readIndexForRemove == i) {
                humanList.remove(human);
                break;
            } else i++;
        }
    }

    public Set<Human> getHumanList() {
        return humanList;
    }

    @Override
    public boolean contains (Human human){
        return humanList.contains(human);
    }

}
