package com.gmail.venderser.lesson3;

public class SimpleATM {
    public static void main(String[] args) {
        cardMaker();

    }

    public static void cardMaker() {
        CreditCard firstCard = new CreditCard(9374555583726666L, 30);
        CreditCard secondCard = new CreditCard(9374555583736666L, 399);
        CreditCard thirdCard = new CreditCard(9374555583746666L, 3);
        firstCard.addMoney();
        secondCard.addMoney();
        thirdCard.withdrownMoney();
        firstCard.cardInfo();
        secondCard.cardInfo();
        thirdCard.cardInfo();
    }
}
