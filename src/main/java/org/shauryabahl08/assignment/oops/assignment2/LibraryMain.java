package org.shauryabahl08.assignment.oops.assignment2;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookId(101);
        book1.setTitle("Java Programming");
        book1.setAuthor("James Gosling");
        book1.setPrice(650);
        book1.setAvailable(true);

        Book book2 = new Book();
        book2.setBookId(102);
        book2.setTitle("Python Basics");
        book2.setAuthor("Guido van Rossum");
        book2.setPrice(500);
        book2.setAvailable(true);

        Book book3 = new Book();
        book3.setBookId(103);
        book3.setTitle("Data Structures");
        book3.setAuthor("Robert Lafore");
        book3.setPrice(800);
        book3.setAvailable(true);


        // question 7 for books

        book1.borrowBook();
        book1.displayBookDetails();

        book2.applyDiscount(15);
        book2.displayBookDetails();

        book3.borrowBook();
        book3.returnBook();
        book3.displayBookDetails();

        Book.displayLibraryName();
        Book.changeLibraryName("ABC Public Library!");
        Book.displayLibraryName();
    }
}
