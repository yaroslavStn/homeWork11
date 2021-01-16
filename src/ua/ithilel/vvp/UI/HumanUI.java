package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;

import java.util.List;

public interface HumanUI {
    Human readHuman() ;
    void error ();
    void printHumanList (List<Human> humanList);
    int readIndexForRemove ();
    String readNameForSearch ();
    String readSurnameForSearch ();
}
