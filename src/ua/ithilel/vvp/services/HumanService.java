package ua.ithilel.vvp.services;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;

public class HumanService {
    public boolean repeatHuman (HumanList humanList, Human human){
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.getHuman(i).equals(human)) return true;
        }
        return false;
    }
    public HumanList getListSurname(HumanList humanList, String surname) {
        HumanList result = new HumanList();
        for (int i = 0; i < humanList.size(); i++) {
            if (surname.hashCode() == humanList.getHuman(i).getSurname().hashCode()) {
                if (surname.equalsIgnoreCase(humanList.getHuman(i).getSurname())) {
                    result.addHuman(humanList.getHuman(i));
                }
            }
        }
        return result;
    }
    public HumanList getListName(HumanList humanList, String name) {
        HumanList result = new HumanList();
        for (int i = 0; i < humanList.size(); i++) {
           // if (name.hashCode() == humanList.getHuman(i).getName().hashCode()) {
                if (name.equalsIgnoreCase(humanList.getHuman(i).getName())) {
                    result.addHuman(humanList.getHuman(i));
                }
          //  }
        }
        return result;
    }
}
