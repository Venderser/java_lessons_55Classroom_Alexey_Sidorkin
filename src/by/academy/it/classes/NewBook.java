package by.academy.it.classes;
/*
1. Создайте пакет by.academy.it.classes

2. Создать класс Book c полями название, автор, количество страниц
соответствующего типа.

3. Создайте методы для доступа к полям.

4. Напишите программу, которая создает книгу и выводит на экран
информацию о книге. */

public class NewBook {
    public static void main(String[] args) {
        Book[] booksMassive = {
                new Book("The book about nothing", "The nobody", 200),
                new Book("The book about something", "The somebody", 150),
                new Book("The book about two stupid authors", "Third no name human", 100)
        };
        Book.printAllBooks(booksMassive);
    }

//Я очень надеюсь, что мы еще разберем в группе геттеры и сеттеры, так как я вообще не понял как это работает, но работает, да.
}
