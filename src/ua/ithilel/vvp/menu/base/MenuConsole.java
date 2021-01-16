package ua.ithilel.vvp.menu.base;

import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.*;

import java.util.Scanner;

public class MenuConsole implements Menu {
    private Item [] items;
    private Scanner sc;


    public MenuConsole(Item[] items, Scanner sc) {
        this.items = items;
        this.sc = sc;
    }

    @Override
    public void run(){
        for (;;){
            showMenu();
            System.out.println("Enter choice:");
            int choice = getChoice();
            sc.nextLine();
            if (isChoiceValid(choice)){
                System.out.println("Enter another menu item");
                continue;
            }
            items[choice].exec();
            if (items[choice].isExit()) {
                break;
            }
        }

    }

    private boolean isChoiceValid(int choice) {
        return choice <0 || choice>= items.length;
    }

    private int getChoice() {
        return sc.nextInt() -1;
    }

    private void showMenu() {
        System.out.println("--------Menu--------");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1)+" - "+items[i].getName());
        }
    }
}
