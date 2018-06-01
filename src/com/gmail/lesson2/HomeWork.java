package com.gmail.lesson2;

/*1. Создайте три переменные, которые содержат любые целые числа. Создайте метод, который вычисляет среднее арифметическое трех целых чисел.
 Выведите результат вычисления на экран в основном теле программы.
2. Создайте метод, который выводит на экран фразу "I can do it!". Выведите результат на экран в основном теле программы.
3. Создайте две, которые содержат любые целые числа. Создайте метод, который вычисляет выражение вида x*y+x+y с использованием операторов с присваиванием.
Выведите результат вычисления на экран в основном теле программы.

*/
public class HomeWork {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;
        int number3 = 7;
        int averageNumbers = average(number1, number2, number3);
        int square = squareRoot(number1, number2);
        javaPrint();
        System.out.println(averageNumbers);
        System.out.println(square);
    }

    static private void javaPrint() {
        System.out.println("I can do it!");
    }

    static private int average(int number1, int number2, int number3) {
        int a = (number1 + number2 + number3) / 3;
        return a;
    }

    static private int squareRoot(int number1, int number2) {
        int a = (number1 * number2);
        int b= (number1 + number2);
        int c =0;
        c +=a+b;
        return c;
    }
}
