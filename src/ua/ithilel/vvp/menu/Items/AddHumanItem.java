package ua.ithilel.vvp.menu.Items;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.base.Item;

public class AddHumanItem extends Item {
    private HumanController humanController;

    public AddHumanItem(HumanController humanController) {
        super("Add human");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.addHuman();
    }
}
