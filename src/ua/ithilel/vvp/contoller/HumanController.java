package ua.ithilel.vvp.contoller;

import ua.ithilel.vvp.services.HumanService;
import ua.ithilel.vvp.UI.HumanUI;
import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;


public class HumanController {
    HumanUI ui;
    HumanList humanList;
    HumanService humanService;

    public HumanController(HumanUI ui, HumanList humanList, HumanService humanService) {
        this.ui = ui;
        this.humanList = humanList;
        this.humanService = humanService;
    }

    public void addHuman() {
        Human human = ui.readHuman();
        if (humanService.repeatHuman(humanList,human)) ui.error();
        else humanList.addHuman(human);
        //ui.printHumanList(humanList);
    }

    public void printList() {
        ui.printHumanList(humanList);
    }

    public void deleteHuman() {
        humanList.deliteHuman(ui.readIndexForRemove());
        //ui.printHumanList(humanList);
    }
    public void searchBySurname() {
        HumanList humanList1 = new HumanList();
        humanList1 = humanService.getListSurname(humanList, ui.readSurnameForSearch());
        ui.printHumanList(humanList1);

    }
    public void searchByName() {
        HumanList humanList1 = new HumanList();
        humanList1 = humanService.getListName(humanList, ui.readNameForSearch());
        ui.printHumanList(humanList1);
    }
}
