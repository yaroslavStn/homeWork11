package ua.ithilel.vvp.menu.Items;

import ua.ithilel.vvp.menu.base.Item;

public class ExitItem extends Item {
    public ExitItem() {
        super("Exit", true);
    }
    @Override
    public void exec() {
        System.out.println("Bye");
    }
}
