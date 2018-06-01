package com.gmail.venderser.lesson2;

public class task3 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;
        int sumNumbers = numbersSumm(number1, number2);
        int umnojenie = proizved(number1, number2);
        int sumMetods = numbersSumm(sumNumbers, umnojenie);
        String txt = "Java Forever";
        javaPrint(txt);
        System.out.println(sumNumbers);
        System.out.println(umnojenie);
        System.out.println(sumMetods);
    }

    static private void javaPrint(String text) {
        System.out.println(text);
    }


    static private int numbersSumm(int number1, int number2) {
        int a = number1 + number2;
        return a;
    }

    static private int proizved(int number1, int number2) {
        int a = number1 * number2;
        return a;
    }

}
