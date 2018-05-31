package by.academy.it.classes;

public class Book {
    private String nameOfBook;
    private String Author;
    private int numberOfPages;

    public Book(String nameOfBook, String Author, int numberOfPages) {
        this.nameOfBook = nameOfBook;
        this.Author = Author;
        this.numberOfPages = numberOfPages;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static void printAllBooks(Book[] Books) {
        for (Book booksMassive : Books) {
            System.out.println("Name of book: " + booksMassive.getNameOfBook() + " \nAuthor: " + booksMassive.getAuthor() + " \nNumber of pages: " + booksMassive.getNumberOfPages() + "\n");

        }
    }
}
