package com.gmail.venderser.lesson6.homeWork;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Service even = new Service();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the band range m..p");
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println("Mass length:");
        even.even(even.massGenerator(even.scanner(), m, n));

    }
}