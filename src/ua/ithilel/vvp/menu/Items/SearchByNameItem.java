package ua.ithilel.vvp.menu.Items;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.base.Item;

public class SearchByNameItem extends Item{

    private HumanController humanController;


    public SearchByNameItem(HumanController humanController) {
        super("search humans by name");
        this.humanController=humanController;
    }

    @Override
    public void exec() {
        humanController.searchByName();

    }
}
