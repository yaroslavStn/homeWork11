package ua.ithilel.vvp.menu.Items;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.base.Item;


    public class DeleteHumanItem extends Item {
private HumanController humanController;
        public DeleteHumanItem(HumanController humanController) {
            super("Delete human");
            this.humanController=humanController;
        }

        @Override
        public void exec() {
            humanController.deleteHuman();
        }
    }

