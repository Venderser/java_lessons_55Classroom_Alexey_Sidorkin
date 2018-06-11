package com.gmail.venderser.lesson6.homeWork;

import java.util.Random;
import java.util.Scanner;

public class Service {
    int scanner() {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }

    int[] massGenerator(int n, int m, int p) {
        int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(p);
            if (mass[i] < m) {
                mass[i] += m;
            }
        }
        return mass;
    }

    void minusGen(int n){
        Random random = new Random();
        int i=0;
      //  while(i<100){
int result=random.nextInt(n*2+1)-n;
sysOut(result);
     //   i++;}
    }

    void even(int[] mass) {
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            //sysOut(mass[i]); //BugFix
            if (mass[i] % 2 == 0) {
                summ++;
            }
        }
        System.out.println("even:");
        sysOut(summ);
    }

    void amount(int n) {
        int amountN = 0;
        int summ = 0;
        while (n != 0) {
            int x = n % 10;
            n = n / 10;
            amountN++;
            summ += x;
        }
        System.out.println(amountN + " " + summ);
    }

    void sysOut(int x) {
        System.out.println(x);
    }
}
