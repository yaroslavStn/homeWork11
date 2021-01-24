package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.myException.HumanException;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HumanConsoleUI implements HumanUI {
    private Scanner sc;


    public HumanConsoleUI(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public Human readHuman() {
        System.out.println("Enter surname name and patronymic");
        String surname = sc.next();
        String name = sc.next();
        String patronymic = sc.next();
        sc.nextLine();
        return new Human(name, surname, patronymic);
    }



    @Override
    public void printHumanList(Set<Human> humanList) {
        System.out.println("\n" +
                "-----Humans-----\n" +
                "");

        Iterator<Human> iterator = humanList.iterator();
        for (int i = 1; iterator.hasNext(); i++) {
            System.out.println(i + ") " + iterator.next());
        }
        System.out.println("-----=====----");
    }

    @Override
    public int readIndexForRemove() {
        System.out.println("Enter index ");
        int index = 0;
        boolean correct = true;
        while (correct) {
            String s = sc.nextLine();
            try {
                index = Integer.parseInt(s);
                correct=false;
            } catch (Exception e) {
                System.out.println("Incorrect, enter num!");
            }
        }
        return index;
    }


    @Override
    public String readNameForSearch() {
        System.out.println("Enter Name ");
        return sc.nextLine();
    }

    @Override
    public String readSurnameForSearch() {
        System.out.println("Enter Surname ");
        return sc.nextLine();
    }

    @Override
    public void showError(String message) {
        System.err.println (message);
    }
}
