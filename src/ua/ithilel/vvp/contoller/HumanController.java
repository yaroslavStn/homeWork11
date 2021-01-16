package ua.ithilel.vvp.contoller;

import ua.ithilel.vvp.UI.HumanUI;
import ua.ithilel.vvp.services.HumanService;
import ua.ithilel.vvp.entities.Human;

import java.util.List;


public class HumanController {
    private HumanUI ui;
    private HumanService humanService;

    public HumanController(HumanUI ui, HumanService humanService) {
        this.ui = ui;
        this.humanService = humanService;
    }

    public void addHuman() {
        Human human = ui.readHuman();
        if (humanService.repeatHuman(human)) ui.error();
        else humanService.addHuman(human);

    }

    public void printList() {
        ui.printHumanList(humanService.getHumanList());
    }

    public void deleteHuman() {
        humanService.deleteHuman(ui.readIndexForRemove());
        //ui.printHumanList(humanList);
    }

    public void searchBySurname() {
        List<Human> humanListRepeatSurname;
        humanListRepeatSurname = humanService.getListSurname(ui.readSurnameForSearch());
        ui.printHumanList(humanListRepeatSurname);

    }

    public void searchByName() {
        List<Human> humanListRepeatName;
        humanListRepeatName = humanService.getListName(ui.readNameForSearch());
        ui.printHumanList(humanListRepeatName);
    }
}
