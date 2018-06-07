package com.gmail.venderser.lesson5.homeWork.addTasks;

import java.util.Scanner;

public class FindThisNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = number.nextInt();
        Services finder = new Services();
        finder.numberHunter(finder.massGenerator(10), 10, x);
    }
}
