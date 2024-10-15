//This class creates an object of Member
import java.awt.print.Book;
import java.util.*;

public class Member {
    //First we define the variables of this class
    private String memberId;
    private String name;
    private ArrayList<Book> borrowedBooks;
    //Now we create its constructor
    public Member(String memberId, String name) {
        if (memberId.length() != 6){
            System.out.println("memberId must be 6 digits long");
            System.out.println("#####the construct process failed for member with id: " + memberId);
        }
        else {
            this.memberId = memberId;
            this.name = name;
            this.borrowedBooks = new ArrayList<>();
        }
    }
    //getter methods
    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    //We don't need 'setter' because we don't want to change the private variables
    //Create borrowBook method and check the conditions
    public void borrowBook(ArrayList<Book> books) {
        for (Book book : books) {
            if (borrowedBooks.contains(book))       System.out.println("#####That book with id '" + book.getId() + "' is already borrowed");
            else if (borrowedBooks.size() >= 3)      System.out.println("#####Member with id '"+ this.getMemberId() +"' can't borrowed more than 3 books");
            else if (!book.getIsAvailable())        System.out.println("#####That book with id '" + book.getId() + "' is not available in the library");
            else {
                borrowedBooks.add(book);
                book.setIsAvailable(false);
                System.out.println("Book with id '" + book.getId() + "' Borrowed");
                //Track the number of borrowing book
                book.setTrackBorrowingTimes("Book with title '" + book.getTitle() + "' borrowed by Member with name '" + this.getName() + "' .");
            }
        }
    }
    //Create returnBook method
    public void returnBook(ArrayList<Book> books) {
        for (Book book : books) {
            if (!borrowedBooks.contains(book))   System.out.println("#####That book with id '" + book.getId() + "' is not borrowed");
            else {
                borrowedBooks.remove(book);
                book.setIsAvailable(true);
                System.out.println("Book with id '" + book.getId() + "' returned");
            }
        }
    }
    //Create printMemberInfo method
    public void printMemberInfo() {
        System.out.println("------Member ID: " + memberId);
        System.out.println("------Name: " + name);
        System.out.println("------The borrowed books: ");
        for (Book book : borrowedBooks) {
            System.out.println(">>>Borrowed book with id '" + book.getId() + "' and its Title : " + book.getTitle());
        }if (borrowedBooks.isEmpty())   System.out.println("The list of borrowed books is empty");
    }
}