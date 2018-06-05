package com.gmail.venderser.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int i=0;
        int x=2;
int [] [] massNew = new int [5][5];
        while (i<5){

            massNew[i][0]=x;
            massNew[0][i]=x;
            x=x+2;
            System.out.print(massNew[i][0]+" ");
            i++;
        }
        System.out.println();
        i=1;
        while (i<5){
            System.out.println(massNew[0][i]+" ");
            i++;

        }
    }
}
