//This class creates an object of Member
import java.util.*;

public class Member {
    //First we define the variables of this class
    private String memberId;
    private String name;
    public ArrayList<Book> borrowedBooks;
    //Now we create its constructor
    public Member(String memberId, String name) {
        if (memberId.length() != 6){
            System.out.println("memberId must be 6 digits long");
            System.out.println("#####the construct process failed");
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
    //We don't need 'setter' because we don't want to change the private variables
    //Create borrowBook method and check the conditions
    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book))       System.out.println("#####That book is already borrowed");
        else if (borrowedBooks.size() >= 3)      System.out.println("#####You can't borrowed more than 3 books");
        else if (!book.getIsAvailable())        System.out.println("#####That book is not available");
        else {
            borrowedBooks.add(book);
            book.setIsAvailable(false);
            System.out.println("Book Borrowed");
        }
    }
    //Create returnBook method
    public void returnBook(Book book) {
        if (!borrowedBooks.contains(book))   System.out.println("#####That book is not borrowed");
        else {
            borrowedBooks.remove(book);
            book.setIsAvailable(true);
            System.out.println("Book returned");
        }
    }
    //Create printMemberInfo method
    public void printMemberInfo() {
        System.out.println("------Member ID: " + memberId);
        System.out.println("------Name: " + name);
        System.out.println("------The borrowed books: ");
        int borrowedBooksIndex = 1;
        for (Book book : borrowedBooks) {
            System.out.println(">>>Borrowed book number '" + borrowedBooksIndex++ + "' whit Title : " + book.getTitle());
        }if (borrowedBooks.isEmpty())   System.out.println("Borrowed books is empty");
    }
}