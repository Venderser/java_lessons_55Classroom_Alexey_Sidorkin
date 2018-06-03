package com.gmail.venderser.lesson3.homeWork;

import jdk.nashorn.api.tree.GotoTree;

import java.util.Scanner;

public class CreditCard {
    public static Scanner operations = new Scanner(System.in);
    private static long cardID;
    private static int cardBalance;

    public CreditCard(long cardID, int cardBalance) {
        this.cardID = cardID;
        this.cardBalance = cardBalance;
    }

    public static long getCardID() {
        return CreditCard.cardID;
    }

    public static int getCardBalance() {
        return cardBalance;
    }

    public static void addMoney(int sum) {
        cardBalance += sum;
        System.out.println("New card balance: " + cardBalance + "$" + "\n---------------------------------------------------------------------\n\n");
    }

    public static void withdrowMoney(int sum) {
        if (cardBalance >= sum) {
            cardBalance -= sum;
            System.out.println("New card balance: " + cardBalance + "$" + "\n---------------------------------------------------------------------\n\n");
        } else
            System.out.println("Sorry, there is not enough money to make an operation\n Card will be thrown out" + "\n---------------------------------------------------------------------\n\n");
    }

    public static void operation() {
        System.out.println("Choose '1' for Add money\nChoose '2' for get money  ");
        while (0 < 1) {
            int operationID = operations.nextInt();
            if (operationID == 1) {
                System.out.println("Select amount");
                int amount = operations.nextInt();
                addMoney(amount);
                break;
            } else if (operationID == 2) {
                System.out.println("Select amount");
                int amount = operations.nextInt();
                withdrowMoney(amount);
                break;
            } else
                System.out.println("Incorrect operation number, please try again!");
        }


    }

    public static void cardInfo() {
        System.out.println("CardID: " + CreditCard.getCardID() + " Balance: " + CreditCard.getCardBalance() + "$" + "\n");
    }
}
