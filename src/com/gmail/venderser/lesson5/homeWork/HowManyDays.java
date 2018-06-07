package com.gmail.venderser.lesson5.homeWork;
/*1. Определить количество дней в годах от 2000 до 2010 и вывести их на экран.
        В високосном годе - 366 дней, тогда как в обычном 365.
        Високосными годами являются все года делящиеся нацело на 4 за исключением столетий, которые не делятся нацело на 400.*/
public class HowManyDays {
    public static void main(String[] args) {


    Services summOfDays = new Services();
    summOfDays.year(2000,2010);
}
}