package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;

import java.util.Scanner;

public interface HumanUI {
    Human readHuman() ;
    void error ();
    void printHumanList(HumanList humanList);
    int readIndexForRemove ();
    String readNameForSearch ();
    String readSurnameForSearch ();
}
