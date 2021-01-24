package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;

import java.util.Set;

public interface HumanUI {
    Human readHuman();

    void printHumanList(Set<Human> humanList);

    void showError(String message);

    int readIndexForRemove();

    String readNameForSearch();

    String readSurnameForSearch();
}
