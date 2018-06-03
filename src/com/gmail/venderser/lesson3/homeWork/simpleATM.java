package com.gmail.venderser.lesson3.homeWork;

public class simpleATM {
    public static void main(String[] args) {
        new CreditCard(9374555583726666L, 30);
        CreditCard.cardInfo();
        CreditCard.operation();
        new CreditCard(9374555583736666L, 399);
        CreditCard.cardInfo();
        CreditCard.operation();
        new CreditCard(9374555583746666L, 3);
        CreditCard.cardInfo();
        CreditCard.operation();
    }
}
