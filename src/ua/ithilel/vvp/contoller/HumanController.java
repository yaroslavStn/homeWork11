package ua.ithilel.vvp.contoller;

import ua.ithilel.vvp.UI.HumanUI;
import ua.ithilel.vvp.services.HumanService;
import ua.ithilel.vvp.entities.Human;

import java.util.Set;


public class HumanController {
    private HumanUI ui;
    private HumanService humanService;

    public HumanController(HumanUI ui, HumanService humanService) {
        this.ui = ui;
        this.humanService = humanService;
    }

    public void addHuman() {
        Human human = ui.readHuman();
        if (humanService.isRepeatHuman(human)) ui.error();
        humanService.addHuman(human);

    }

    public void printList() {
        ui.printHumanList(humanService.getHumanList());
    }

    public void isRepeatHuman() {
        humanService.deleteHuman(ui.readIndexForRemove());
        //ui.printHumanList(humanList);
    }

    public void searchBySurname() {
        Set<Human> humanListRepeatSurname;
        humanListRepeatSurname = humanService.getListSurname(ui.readSurnameForSearch());
        ui.printHumanList(humanListRepeatSurname);

    }

    public void searchByName() {
        Set<Human> humanListRepeatName;
        humanListRepeatName = humanService.getListName(ui.readNameForSearch());
        ui.printHumanList(humanListRepeatName);
    }
}
