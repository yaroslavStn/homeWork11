package ua.ithilel.vvp.contoller;


import ua.ithilel.vvp.UI.HumanUI;
import ua.ithilel.vvp.myException.HumanException;
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
        try {
            if(humanService.contains(human)) throw new HumanException();
        }catch (HumanException e) {
            ui.showError("Human already exist");
        }
        humanService.addHuman(human);
    }

    public void printList() {
        ui.printHumanList(humanService.getHumanList());
    }

    public void deleteHuman() {
        int index = ui.readIndexForRemove();
        try {
            humanService.searchExistenceIndex(index);
            humanService.deleteHuman(index);
        }catch (HumanException e) {
            ui.showError("Index is not found");
        }
    }

    public void searchBySurname() {

        String surname = ui.readSurnameForSearch();
        try {
            Set<Human> humansWithRepeat = createSetOfRepeat(surname, true);
            humanService.searchExistence(humansWithRepeat);
            ui.printHumanList(humansWithRepeat);
        }catch (HumanException e){
            ui.showError("value not found");
        }
    }


    public void searchByName() {
        String name = ui.readNameForSearch();
        try {
            Set<Human> humansWithRepeat = createSetOfRepeat(name, false);
            humanService.searchExistence(humansWithRepeat);
            ui.printHumanList(humansWithRepeat);

        }catch (HumanException e){
            ui.showError("value not found");
        }
    }

    private Set<Human> createSetOfRepeat(String attribute, boolean surname) {

        Set<Human> humanListRepeatAttribute;
        if (surname) humanListRepeatAttribute = humanService.getListSurname(attribute);
        else humanListRepeatAttribute = humanService.getListName(attribute);
        return humanListRepeatAttribute;
    }
}
