package ua.ithilel.vvp.menu.base;

import ua.ithilel.vvp.myException.HumanException;

import java.util.Scanner;

public class MenuConsole implements Menu {
    private Item[] items;
    private Scanner sc;


    public MenuConsole(Item[] items, Scanner sc) {
        this.items = items;
        this.sc = sc;
    }

    @Override
    public void run() {
        for (; ; ) {
            showMenu();
            System.out.println("Enter choice:");

            int choice = 0;
            boolean correct = true;
            while (correct) {
                String s = sc.nextLine();
                try {
                    choice = Integer.parseInt(s) - 1;
                    isChoiceValid(choice);
                    correct = false;
                } catch (HumanException e) {
                    System.out.println("Incorrect, try again!");
                } catch (Exception e) {
                    System.out.println("Incorrect, enter another");
                }
            }
            items[choice].exec();
            if (items[choice].isExit()) {
                break;
            }
        }

    }

    private void isChoiceValid(int choice) throws HumanException {
        if (choice < 0 || choice >= items.length) throw new HumanException();
    }


    private void showMenu() {
        System.out.println("--------Menu--------");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + " - " + items[i].getName());
        }
    }
}
