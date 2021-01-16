package ua.ithilel.vvp.services;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;

public interface HumanService {


    void addHuman(Human human);

    void deleteHuman(int readIndexForRemove);

    HumanList getHumanList();

    boolean repeatHuman(Human human);

    HumanList getListSurname(String readSurnameForSearch);

    HumanList getListName(String readNameForSearch);
}
