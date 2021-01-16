package ua.ithilel.vvp.services;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;

public class HumanServiceVar1 implements HumanService {

   private HumanList humanList=new HumanList();

    public boolean repeatHuman (Human human){
        for (int i = 0; i < humanList.size(); i++) {
            if (isHumanRepeats(human, i)) return true;
        }
        return false;
    }

    private boolean isHumanRepeats(Human human, int i) {
        return humanList.getHuman(i).equals(human);
    }

    public HumanList getListSurname(String surname) {
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
    public HumanList getListName(String name) {
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

    public void addHuman(Human human) {
        humanList.addHuman(human);
    }

    public void deleteHuman(int readIndexForRemove) {
        humanList.deleteHuman(readIndexForRemove);
    }

    public HumanList getHumanList() {
        return humanList;
    }
}
