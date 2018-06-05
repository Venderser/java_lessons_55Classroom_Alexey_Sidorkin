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


    public  void addMoney(int amount) {
       getCardBalance();
       cardBalance +=amount;
    }
    public void withdrawnMoney(int amount) {
        getCardBalance();
        cardBalance -=amount;
    }
    public  void cardInfo() {
        System.out.println("CardID: " + getCardID() + " Balance: " + getCardBalance() + "$" + "\n");
    }

}
