package com.gmail.venderser.lesson7.HomeWork;
//1. Ввести с консоли строку. Показать номера символов, совпадающих с последним символом строки.

public class Task1 {
    public static void main(String[] args) {
        Service sEqua = new Service();
        sEqua.equalMethod(sEqua.stringScanner());
    }
}
