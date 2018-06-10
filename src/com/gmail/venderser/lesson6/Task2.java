package com.gmail.venderser.lesson6;
/* Ввести с консоли n целых чисел и поместить их в массивю Вывести массив и отдельно вывести на экран числа, которые делятся на 5 и на 7.*/
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double summ = 0;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the mass length");
        int n = number.nextInt();
        int[] array = new int[n];
        for (int i=0; i<array.length;i++){
            System.out.println("Enter new number");
            array[i]=number.nextInt();
        }
        for (int anArray : array) {
            System.out.println(anArray);

        }
        for (int arrayN:array){
            if (arrayN%5==0 & arrayN%7==0){
              System.out.println(arrayN);
            }
        }

    }
}
