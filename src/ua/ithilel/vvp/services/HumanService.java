package ua.ithilel.vvp.services;

import ua.ithilel.vvp.entities.Human;


import java.util.List;

public interface HumanService {
    boolean repeatHuman (Human human);

    List<Human> getListSurname(String surname) ;
    List<Human> getListName(String name) ;
    void addHuman(Human human);

    void deleteHuman(int readIndexForRemove);

    List<Human> getHumanList();


}
