//This class creates an object of Library:
import java.util.*;

public class Library {
    //First we define the variables of this class
    private final String name;
    public Collection<Book> books;
    public Collection<Member> members;
    //Now we create its constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    //We don't need 'getter and setter' because we don't want to change the private variable
    //Create methods of this class:
    public void addBook(Book book) {
        if (!books.contains(book))      books.add(book);
    }
    public void addMember(Member member) {
        if (!members.contains(member))      members.add(member);
    }
    public void borrowBook(Member member, Book book) {
        if (members.contains(member)) {
            member.borrowBook(book);
            books.remove(book);
        }
        else    System.out.println("#####Member is not in the library");
    }
    public void returnBook(Member member, Book book) {
        if (members.contains(member)) {
            member.returnBook(book);
            books.add(book);
        }
        else    System.out.println("#####Member is not in the library");
    }
    //Create printMemberInfo method
    public void printLibraryInfo() {
        System.out.println("-----Name: " + name);
        System.out.println("-----Books of the Library: ");
        int numberIndex = 1;
        for (Book book : books) {
            System.out.println(">>>Book: '" + numberIndex++ + "' :");
            book.printBookInfo();
        }
        System.out.println("-----Members of the Library: ");
        numberIndex = 1;
        for (Member member : members) {
            System.out.println(">>>Member: '" + numberIndex++ + "' :");
            member.printMemberInfo();
        }
    }
}
