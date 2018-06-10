package com.gmail.venderser.lesson6;
/* Вывести с консоли 10 целых чисел. Найти среднее арифметическое всех этих числе*/
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double summ = 0;
        Scanner number = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<array.length;i++){
            System.out.println("Enter new number");
            array[i]=number.nextInt();
            summ += array[i];
        }

        summ /= array.length;
        System.out.println(summ);
    }
}

