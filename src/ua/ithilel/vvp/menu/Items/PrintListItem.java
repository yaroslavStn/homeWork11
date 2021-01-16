package ua.ithilel.vvp.menu.Items;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.base.Item;

public class PrintListItem extends Item {
    private HumanController humanController;

    public PrintListItem(HumanController humanController) {
        super("Print list");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.printList();

    }
}
