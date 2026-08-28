package org.shauryabahl08.assignment.oops.assignment2;

public class Book {

   private int bookId;
   private String title;
   private String author;
   private double price;
   private boolean available;

   private static String libraryName = "City Central Library";

   public int getBookId() {
       return bookId;
    }

    public String getTitle(){
       return title;
    }

    public String getAuthor(){
       return author;
    }

    public double getPrice(){
       return price;
    }

    public boolean getAvailable(){
       return available;
    }

    public static String getLibraryName(){
       return libraryName;
    }

    public void setBookId(int value){
       if (value>0){
           bookId = value;
       }
    }

    public void setTitle(String newTitle){
       if (!(newTitle.isEmpty())){
           title = newTitle;
       }
    }

    public void setAuthor(String newAuthor){
       if(!(newAuthor.isEmpty())) {
           author = newAuthor;
        }
    }

    public void setPrice(double newPrice){
       if (newPrice>=0){
           price = newPrice;
       }
    }

    public void setAvailable(boolean newAvailable){
       available = newAvailable;
    }

    public void displayBookDetails(){
       System.out.println("Book ID: " + bookId);
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("Price: " + price);
       System.out.println("Availability: " + available);
       System.out.println("Library: " + libraryName);
    }

    public void borrowBook(){
       if (available){
           System.out.println("Book borrowed successfully.");
           available = false;
       }
       else{
           System.out.println("Book is already issued.");
       }
    }

    public void returnBook(){
       if (!available){
           System.out.println("Book returned successfully");
           available = true;
       }
       else{
           System.out.println("Book is still available");
       }
    }

    public void applyDiscount (double percentage){
       price = price - (price * (percentage/100));
    }

    public static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }

    public static void changeLibraryName(String newName){
       libraryName = newName;
    }


}
