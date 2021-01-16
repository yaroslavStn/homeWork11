package ua.ithilel.vvp.menu.Items;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.base.Item;


public class SearchBySurnameItem extends Item{

    private HumanController humanController;


    public SearchBySurnameItem(HumanController humanController) {
        super("search humans by surname");
        this.humanController=humanController;
    }

    @Override
    public void exec() {
        humanController.searchBySurname();

    }
}
