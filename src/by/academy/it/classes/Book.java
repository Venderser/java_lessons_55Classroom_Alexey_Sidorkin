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

    public String getAuthor() {
        return Author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

   /* public static void printAllBooks(Book[] Books) {
        for (Book booksMassive : Books) {
            System.out.println("Name of book: " + booksMassive.getNameOfBook() + " \nAuthor: " + booksMassive.getAuthor() + " \nNumber of pages: " + booksMassive.getNumberOfPages() + "\n");

            Massive method of book creating!


            */
   public static void printAllBooks(Book Book) {

           System.out.println("Name of book: " + Book.getNameOfBook() + " \nAuthor: " + Book.getAuthor() + " \nNumber of pages: " + Book.getNumberOfPages() + "\n");
            /* Method for solo book*/
        }
    }

