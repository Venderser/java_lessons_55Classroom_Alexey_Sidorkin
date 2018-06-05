package com.gmail.venderser.lesson4;

public class Task4 {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                System.out.println("No planes");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("Again no planes");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("Ye, again no planes");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("And again no planes, yes, i`m a very lazy ass");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("Preparation to the saturday");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Sleeping");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("Sleeping, cause i didn`t sleep at Saturday");
                break;
            default:
                System.out.println("No-no-no, only 7 days in a week");
        }
    }
}
