package com.gmail.venderser.lesson4.homeWork;

public class Task2 { public static void main(String[] args) {

    int year = 1232;
    if (year % 400 == 0) {
        System.out.println("Leap year");
    }else {
        if (year%4 ==0 & year%100 !=0){System.out.println("Leap year");
        }else {System.out.println("Not a leap year");
        }
    }
}
}