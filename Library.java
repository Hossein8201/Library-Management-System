//This class creates an object of Library:
import java.util.*;

public class Library {
    //First we define the variables of this class
    private final String name;
    private Collection<Book> books;
    private Collection<Member> members;
    //Now we create its constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    //getter methods
    public String getName() {
        return name;
    }
    public Collection<Book> getBooks() {
        return books;
    }
    public Collection<Member> getMembers() {
        return members;
    }
    //We don't need 'setter' because we don't want to change the private variable
    //Method to add a book to the library
    public void addBook(Book book) {
        if (books.contains(book))   System.out.println("Book with id '" + book.getId() + "' is already exists!");
        else if (book.getId() == null)   System.out.println("Book with id '" + book.getId() + "' does not exist!");
        else books.add(book);
    }
    //Method to add a member to the library
    public void addMember(Member member) {
        if (members.contains(member))   System.out.println("Member with id '" + member.getMemberId() + "' is already exists!");
        else if (member.getMemberId() == null)   System.out.println("Member with id '" + member.getMemberId() + "' does not exist!");
        else members.add(member);
    }
    //Method to borrow many books for a member
    public void borrowBook(Member member, Book... bookList) {
        if (!members.contains(member))
            System.out.println("#####Member with id '" + member.getMemberId() + "' don't added to the library");
        for (Book book : bookList) {
            if (!books.contains(book))
                System.out.println("#####Book with id '" + book.getId() + "' don't added to the library");
            else    member.borrowBook(book);
        }
    }
    //Method to return many books for a member
    public void returnBook(Member member, Book... bookList) {
        if (!members.contains(member))
            System.out.println("#####Member with id '" + member.getMemberId() + "' don't added to the library");
        for (Book book : bookList) {
            if (!books.contains(book))
                System.out.println("#####Book with id '" + book.getId() + "' don't added to the library");
            else    member.returnBook(book);
        }
    }
    //Create printMemberInfo method
    public void printLibraryInfo() {
        System.out.println("----Name: " + name);
        System.out.println("----Books of the Library: ");
        int numberIndex = 1;
        for (Book book : books) {
            System.out.println(">>>Book: '" + numberIndex++ + "' :");
            book.printBookInfo();
        }if (books.isEmpty()) System.out.println("Don't exist any books in the library");
        System.out.println("----Members of the Library: ");
        numberIndex = 1;
        for (Member member : members) {
            System.out.println(">>>Member: '" + numberIndex++ + "' :");
            member.printMemberInfo();
        }if (members.isEmpty()) System.out.println("Don't exist any members in the library");
    }
}
