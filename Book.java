//This method creates an object of Book:
import java.util.*;

public class Book {
    //First we define the variables of this class
    private StringBuilder id;
    private StringBuilder title;
    private StringBuilder author;
    private boolean isAvailable;
    //To show the number of borrowing a book and track that, Create an array list.
    private ArrayList<String> trackBorrowingTimes;
    //Now we create its constructor
    public Book(String id,String title, String author) {
        //The length of id must be exactly 5 characters
        if (id.length() != 5){
            System.out.println("book id must be exactly 5 characters long");
            System.out.println("#####the construct process failed for book with id " + id);
        }
        else {
            this.id = new StringBuilder(id);
            this.title = new StringBuilder(title);
            this.author = new StringBuilder(author);
            this.isAvailable = true;        //Default is available
            this.trackBorrowingTimes = new ArrayList<>();
        }
    }
    //Next we need to use getter and setter to apply the changes for private variables
    //getter methods
    public StringBuilder getId() {
        return id;
    }
    public StringBuilder getTitle() {
        return title;
    }
    public StringBuilder getAuthor() {
        return author;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public ArrayList<String> getTrackBorrowingTimes() { return trackBorrowingTimes; }
    //setter methods
    public void setId(String id) {
        if(id.length() == 5)    this.id = new StringBuilder(id);         //The length of id must be exactly 5 characters
        else {
            System.out.println("book id must be exactly 5 characters long");
            System.out.println("#####the change id process failed for book with id " + id);
        }
    }
    public void setTitle(String title) {
        this.title = new StringBuilder(title);
    }
    public void setAuthor(String author) {
        this.author = new StringBuilder(author);
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setTrackBorrowingTimes(String trackBorrowingTimes) {
        this.trackBorrowingTimes.add(trackBorrowingTimes);
    }
    //Print information method for show all details of a book
    public void printBookInfo() {
        System.out.println("------Book ID: " + id.toString());
        System.out.println("------Book Title: " + title.toString());
        System.out.println("------Book Author: " + author.toString());
        System.out.println("------Is book available in library: " + isAvailable);
        System.out.println(">>>The number of borrowing Times is " + trackBorrowingTimes.size() + " and it tracked path's are :");
        for (String i: trackBorrowingTimes) {
            System.out.println("------" + i);
        }
    }
}