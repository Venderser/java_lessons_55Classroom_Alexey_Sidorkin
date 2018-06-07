package com.gmail.venderser.lesson5;

public class Services {
    public void oddNumbers(int[] n) {
        int i = 0;
        int summ = 0;
        while (i < 9) {
            if (i % 2 == 1) {
                summ = summ + n[i];
                System.out.println(n[i]);
            }
            i++;
        }
        System.out.println(summ);
    }

    public void evenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "!");
            } else {
                System.out.println(i);
            }
        }

    }

    public void numbers(int start) {
        do {
            start += 1;
        } while (start < 100);
        System.out.println(start);
    }

    public void massNumbers(int n, int x) {
        int[] mass = new int[n];


        int i = 0;
        int summ = 0;
        while (i < n) {
            mass[i] = i + 1;
            i++;
        }
        if (x <= n) {
            if (mass[x] == x) {

                for (int ii = 0; ii < n; ii++) {
                    System.out.println(ii);
                    summ += mass[ii];
                }
            }
            System.out.println(summ);
        }
    }
}


