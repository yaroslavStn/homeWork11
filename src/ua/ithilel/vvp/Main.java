package ua.ithilel.vvp;

import ua.ithilel.vvp.UI.HumanUI;
import ua.ithilel.vvp.contoller.HumanController;
import ua.ithilel.vvp.services.HumanService;
import ua.ithilel.vvp.util.HumanList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HumanUI humanUI = new HumanUI(sc);
        HumanList humanList= new HumanList();
        HumanService humanService = new HumanService();

        HumanController humanController= new HumanController(humanUI,humanList, humanService);

        for (;;) {
            System.out.println("--------Menu--------\n" +
                    "1- Add human;\n" +
                    "2- print list;\n" +
                    "3- delete human;\n" +
                    "4- search humans by surname;\n" +
                    "5- search human by name;\n" +
                    "6- Exit\n" +
                    "\n" +
                    "Enter your choice:");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch==1)  humanController.addHuman();
            else if (ch==2) humanController.printList();
            else if (ch==3) humanController.deleteHuman();
            else if (ch==4) humanController.searchBySurname();
            else if (ch==5) humanController.searchByName();
            else  if (ch==6) break;
        }
    }


}
