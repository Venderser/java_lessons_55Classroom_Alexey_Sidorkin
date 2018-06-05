package com.gmail.venderser.lesson4;

public class Task3 {
    public static void main(String[] args) {
        int n = 7;
        int m = 1;
        if (n % 2 == 0) {
            System.out.println("True");
        }
        int xn=n-10;
        int xm=m-10;
        if (xn<0){xn*=-1;};
        if (xm<0){xm*=-1;};
        if (xn > xm) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }
        if(m>5 & m<100){
            System.out.println("5..m..100");
        }
    }
}

