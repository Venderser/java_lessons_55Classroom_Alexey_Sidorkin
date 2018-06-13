package com.gmail.venderser.lesson7.HomeWork;
/*
Ввести n строк с консоли.Вывести на консоль те строки,в которых встречается слово cat или dog.
Подсчитать длину этих строк.Вывести на экран количество строк,которые не соответствуют критерию.*/


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Service stringLines = new Service();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();

        int x=0;
        for (int i = 0; i < n; i++) {

            if (stringLines.stringLines(stringLines.stringScanner()).equals("yes")){}else {
                x++;
            }
        }
System.out.println(x);
    }
}
