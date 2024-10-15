//This part is the Main body of 'Library program'
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creating a new library
        Library library = new Library("Hossein Library");
        //Adding at least 5 books to the library
        Book book1 = new Book("00001","math","Euler");
        Book book2 = new Book("00002","physics","Stephen William Hawking");
        Book book3 = new Book("00003","Material Engineering","Calister");
        Book book4 = new Book("00004","Linear Algebra","Villiam");
        Book book5 = new Book("00005","Circuits","Albert Tun");
        //Adding books to the library's collection
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        //Adding at least 2 members to the library
        Member member1 = new Member("000001", "Ali");
        Member member2 = new Member("000002", "Reza");
        //Adding members to the library's member collection
        library.addMember(member1);
        library.addMember(member2);
        //Simulating borrowing books by members
        library.borrowBook(member1, book1);     //Ali borrows book1
        library.borrowBook(member1, book2, book3, book4);     //Ali borrows book2 and book3 and book4
        library.borrowBook(member2, book4);     //Reza attempts to borrow book4 (already borrowed)
        library.borrowBook(member2, book5);     //Reza borrows book5
        //Simulating returning books
        library.returnBook(member1, book1, book3);     //Ali returns book1 and book3
        library.returnBook(member2, book2);     //Reza attempts to return book2 (don't borrowed by him)
        library.returnBook(member2, book5);     //Reza returns book5
        //For two time:
        library.borrowBook(member2, book1, book3);
        library.borrowBook(member1, book5);
        library.returnBook(member1, book2, book4);
        //Printing library information (all books and members)
        library.printLibraryInfo();
        //Adding more books and members as needed to check the condition of book id and member id.
        Book book = new Book("133","math","Golf");      //the length of id must be exactly 5 character
        Member member3 = new Member("44444", "Mohammad");   //the length of id must be exactly 6 character
        //attempts to add this book and member to library (that can't)
        library.addMember(member3);
        library.addBook(book);
        //Print the updated library information after adding new member and book
        library.printLibraryInfo();
    }
}
