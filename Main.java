//
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Hossein library");
        Book book1 = new Book("12345","math","Nobel");
        Book book2 = new Book("15255","physics","Deitel");
        Book book3 = new Book("12345","computer","ajlajldfjaljflajldjlajlf");
        Book book4 = new Book("12345","algebra","lakdkslkkkkkdkfslaf");
        Book book5 = new Book("22233","mdffsdf","ajfljalsdf");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        Member member1 = new Member("222222", "Ali");
        Member member2 = new Member("333333", "Reza");
        library.addMember(member1);
        library.addMember(member2);

        library.printLibraryInfo();
    }
}
