//This part is the Main body of 'Library program'
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creating a new library
        Library library = new Library("Hossein Library");
        //Adding at least 5 books to the library
        Book book1 = new Book("11233","math","Euler");
        Book book2 = new Book("15255","physics","Stephen William Hawking");
        Book book3 = new Book("12885","Material Engineering","Calister");
        Book book4 = new Book("12345","Linear Algebra","Villiam");
        Book book5 = new Book("22233","Circuits","Albert Tun");
        //Adding books to the library's collection
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        //Adding at least 2 members to the library
        Member member1 = new Member("222222", "Ali");
        Member member2 = new Member("333333", "Reza");
        //Adding members to the library's member collection
        library.addMember(member1);
        library.addMember(member2);
        //Simulating borrowing books by members
        library.borrowBook(member1, book1);     //Ali borrows book1
        library.borrowBook(member1, book2);     //Ali borrows book2
        library.borrowBook(member1, book3);     //Ali borrows book3
        library.borrowBook(member1, book4);     //Ali borrows book4
        library.borrowBook(member2, book4);     //Reza attempts to borrow book4 (already borrowed)
        library.borrowBook(member2, book5);     //Reza borrows book5
        //Simulating returning books
        library.returnBook(member1, book1);     //Ali returns book1
        library.returnBook(member2, book2);     //Reza attempts to return book2 (don't borrowed by him)
        library.returnBook(member2, book5);     //Reza returns book5
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
