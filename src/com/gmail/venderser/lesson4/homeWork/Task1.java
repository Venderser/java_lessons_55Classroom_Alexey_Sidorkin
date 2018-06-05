package com.gmail.venderser.lesson4.homeWork;

public class Task1 {
    public static void main(String[] args) {

        int[] pubMass = new int[8];
        int[] firstMass = {1, 2, 3, 4};
        int[] secondMass = {5, 6, 7, 8};
        int i = 0;
        while (i < 8) {
            if (i < 4) {
                pubMass[i] = firstMass[i];
            } else {
                pubMass[i] = secondMass[i - 4];
            }
            i++;
        }
        i = 0;
        while (i < 8) {
            System.out.println(pubMass[i]);
            i++;
        }
    }
}