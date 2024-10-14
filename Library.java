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
        if (books.contains(book))   System.out.println("Book already exists!");
        else if (book.getId() == null)   System.out.println("Book does not exist!");
        else books.add(book);
    }
    public void addMember(Member member) {
        if (members.contains(member))   System.out.println("Member already exists!");
        else if (member.getMemberId() == null)   System.out.println("Member does not exist!");
        else members.add(member);
    }
    public void borrowBook(Member member, Book book) {
        if (!members.contains(member))
            System.out.println("#####Member don't added to the library");
        else if (!books.contains(book))
            System.out.println("#####Book don't added to the library");
        else    member.borrowBook(book);
    }
    public void returnBook(Member member, Book book) {
        if (!members.contains(member))
            System.out.println("#####Member don't added to the library");
        else if (!books.contains(book))
            System.out.println("#####Book don't added to the library");
        else    member.returnBook(book);
    }
    //Create printMemberInfo method
    public void printLibraryInfo() {
        System.out.println("----Name: " + name);
        System.out.println("----Books of the Library: ");
        int numberIndex = 1;
        for (Book book : books) {
            System.out.println(">>>Book: '" + numberIndex++ + "' :");
            book.printBookInfo();
        }if (books.isEmpty()) System.out.println("No books in the library");
        System.out.println("----Members of the Library: ");
        numberIndex = 1;
        for (Member member : members) {
            System.out.println(">>>Member: '" + numberIndex++ + "' :");
            member.printMemberInfo();
        }if (members.isEmpty()) System.out.println("No members in the library");
    }
}
