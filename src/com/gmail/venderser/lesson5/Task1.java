package com.gmail.venderser.lesson5;

public class Task1 {
    public static void main(String[] args) {

        Services service = new Services();
        int[] mass = new int[9];


        int i = 0;
        while (i < 9) {
            mass[i]=i;
            i++;
        }
        service.oddNumbers(mass);
    }
}