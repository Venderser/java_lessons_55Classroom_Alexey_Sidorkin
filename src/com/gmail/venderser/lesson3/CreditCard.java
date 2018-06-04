package com.gmail.venderser.lesson3;

public  class CreditCard {
    private long cardID;
    private int cardBalance;

    public CreditCard(long cardID, int cardBalance) {
        this.cardID = cardID;
        this.cardBalance = cardBalance;
    }

    public long getCardID() {
        return cardID;
    }

    public int getCardBalance() {
        return cardBalance;
    }


    public  int addMoney() {
       getCardBalance();
       cardBalance +=10;
        return cardBalance;
    }
    public int withdrownMoney() {
        getCardBalance();
        cardBalance -=5;
        return cardBalance;
    }
    public  void cardInfo() {
        System.out.println("CardID: " + getCardID() + " Balance: " + getCardBalance() + "$" + "\n");
    }

}
