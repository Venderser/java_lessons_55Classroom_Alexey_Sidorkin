package com.gmail.venderser.lesson7.HomeWork;
/*Ввести с консоли строку в программу:
"На вопрос "Откуда?" - От верблюда! На вопрос "Зачем?" - Затем! На вопрос "Что?"- Цирк Шапито! На вопрос "Как?"- На тебя напал столбняк!"
Во введенной строке удалить пробелы между вторым и третьим вопросительным знаком.
*/
public class Task3 {
    public static void main(String[] args) {
        Service del = new Service();
        del.del(del.stringScanner());
    }
}
