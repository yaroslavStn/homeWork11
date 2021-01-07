package ua.ithilel.vvp.UI;

import ua.ithilel.vvp.entities.Human;
import ua.ithilel.vvp.util.HumanList;

import java.util.Scanner;

public class HumanUI {
    Scanner sc;

    public HumanUI(Scanner sc) {
        this.sc = sc;
    }
    public Human readHuman() {
        System.out.println("Enter surname name and patronymic");
        String surname = sc.next();
        String name = sc.next();
        String patronymic = sc.next();
        return new Human(name, surname, patronymic);
    }
    public void error (){
        System.out.println("this person has been added");
    }

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
    public int readIndexForRemove (){
        System.out.println("Enter index ");
        int index =sc.nextInt();
        sc.nextLine();
        return index;
    }
    public String readNameForSearch (){
        System.out.println("Enter Name ");
        String name = sc.nextLine();
        return name;
    }
    public String readSurnameForSearch (){
        System.out.println("Enter Surname ");
        String name = sc.nextLine();
        return name;
    }
}