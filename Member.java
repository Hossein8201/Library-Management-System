//This class creates an object of Member
import java.util.*;

public class Member {
    //First we define the variables of this class
    private final String memberId;
    private final String Name;
    public ArrayList<Book> borrowedBooks;
    //Now we create its constructor
    public Member(String memberId, String Name) {
        this.memberId = memberId;
        this.Name = Name;
        this.borrowedBooks = new ArrayList<>();
    }
    //We don't need 'getter and setter' because we don't want to change the private variables
    //Create borrowBook method and check the conditions
    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book))       System.out.println("That book is already borrowed");
        else if (borrowedBooks.size() > 3)      System.out.println("Yuo can't more than 3 books");
        else if (book.getIsAvailable() == false) System.out.println("That book is not available");
        else {
            borrowedBooks.add(book);
            book.setIsAvailable(false);
            System.out.println("Book Borrowed");
        }
    }
    //Create returnBook method
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book))   System.out.println("That book is not borrowed");
        else {
            borrowedBooks.remove(book);
            book.setIsAvailable(true);
            System.out.println("Book returned");
        }
    }
    //Create printMemberInfo method
    public void printMemberInfo() {
        System.out.println("-----Member ID: " + memberId);
        System.out.println("-----Name: " + Name);
        System.out.println("-----The borrowed books: ");
        for (Book book : borrowedBooks) {
            System.out.println("----------" + book.toString());
        }
    }
}