package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;

import java.util.Set;

public interface HumanUI {
    Human readHuman() ;
    void error ();
    void printHumanList (Set<Human> humanList);
    int readIndexForRemove ();
    String readNameForSearch ();
    String readSurnameForSearch ();
}
