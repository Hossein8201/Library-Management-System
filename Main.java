//This part is the Main body of 'Library program'
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Hossein Library");
        Book book1 = new Book("11233","math","Euler");
        Book book2 = new Book("15255","physics","Stephen William Hawking");
        Book book3 = new Book("12885","Material Engineering","Calister");
        Book book4 = new Book("12345","Linear Algebra","Villiam");
        Book book5 = new Book("22233","Circuits","Albert Tun");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        Member member1 = new Member("222222", "Ali");
        Member member2 = new Member("333333", "Reza");
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        library.borrowBook(member1, book2);
        library.borrowBook(member1, book3);
        library.borrowBook(member1, book4);
        library.borrowBook(member2, book4);
        library.borrowBook(member2, book5);
        library.returnBook(member1, book1);
        library.returnBook(member2, book2);
        library.returnBook(member2, book5);
        library.printLibraryInfo();
        Book book = new Book("133","math","Golf");
        Member member3 = new Member("44444", "Reza");
        library.addMember(member3);
        library.addBook(book);
        library.printLibraryInfo();
    }
}
