package ua.ithilel.vvp.services;

import ua.ithilel.vvp.entities.Human;


import java.util.Set;

public interface HumanService {
    boolean isRepeatHuman(Human human);

    Set<Human> getListSurname(String surname);

    Set<Human> getListName(String name);

    void addHuman(Human human);

    void deleteHuman(int readIndexForRemove);

    Set<Human> getHumanList();


}
