package ua.ithilel.vvp;

import ua.ithilel.vvp.UI.HumanConsoleUI;
import ua.ithilel.vvp.UI.HumanUI;
import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.menu.Items.*;
import ua.ithilel.vvp.menu.base.Item;
import ua.ithilel.vvp.menu.base.Menu;
import ua.ithilel.vvp.menu.base.MenuConsole;
import ua.ithilel.vvp.services.HumanService;
import ua.ithilel.vvp.services.HumanServiceVar1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HumanUI humanUI = new HumanConsoleUI(sc);
        HumanService humanService = new HumanServiceVar1();
        HumanController humanController = new HumanController(humanUI, humanService);

        Item[] items={
                new AddHumanItem(humanController),
                new PrintListItem(humanController),
                new DeleteHumanItem(humanController),
                new SearchBySurnameItem(humanController),
                new SearchByNameItem(humanController),
                new ExitItem()
        };

        Menu menu = new MenuConsole(items,sc);
        menu.run();

    }
}
