package com.gmail.venderser.lesson6;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int max=0;
        Scanner number = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the mass length");
        int n = number.nextInt();
        int[] array = new int[n];
        for(int i =0;i<n;i++){
            array[i]=random.nextInt(50);
            System.out.println(array[i]);
        }
        System.out.println("---------------------------------");
        for (int i = 1; i <n ; i++) {
          max=Math.max(array[i],array[i-1]);
        }
        System.out.println("max: "+max);
        System.out.println("----------------------------------");

        finder(array);
    }
    static void finder(int[] array){
        for (int anArray : array) {
    if (anArray*10<200){
        System.out.println(anArray);
    }

        }
    }
}
