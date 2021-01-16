package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;

import java.util.Scanner;

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
        return new Human(name, surname, patronymic);
    }
    @Override
    public void error (){
        System.out.println("this person has been added");
    }

    @Override
    public void printHumanList(HumanList humanList) {
        System.out.println("\n" +
                "-----Humans-----\n" +
                "");
        for (int i = 0; i < humanList.size(); i++) {
            System.out.print(i+1+") ");
            System.out.println(humanList.getHuman(i));
        }
        System.out.println("-----=====----");
    }
    @Override
    public int readIndexForRemove (){
        System.out.println("Enter index ");
        int index =sc.nextInt();
        sc.nextLine();
        return index;
    }
    @Override
    public String readNameForSearch (){
        System.out.println("Enter Name ");
        return sc.nextLine();
    }
    @Override
    public String readSurnameForSearch (){
        System.out.println("Enter Surname ");
        return sc.nextLine();
    }
}