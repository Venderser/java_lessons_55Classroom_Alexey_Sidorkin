package by.academy.it.classes;

public class NewBook {
    public static void main(String[] args) {
        Book[] booksMassive = {
                new Book("The book about nothing", "The nobody", 200),
                new Book("The book about something", "The somebody", 150),
                new Book("The book about two stupid authors", "Third noname", 100)
        };
        Book.printAllBooks(booksMassive);
    }

//Я очень надеюсь, что мы еще разберем в группе геттеры и сеттеры, так как я вообще не понял как это работает, но работает, да.
}
