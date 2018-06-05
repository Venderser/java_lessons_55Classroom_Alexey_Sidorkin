package com.gmail.venderser.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int [] massive = new int[10];
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i = 1;
        massive[9] =22;
        System.out.println(massive[9]);
        while (i <= 10) {
            if (i%2==0){
            System.out.println(mass[i-1]);}
            i++;
        }
    }

}

