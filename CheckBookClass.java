//This code check the Book-class to be sure that works right:
import java.util.*;

public class CheckBookClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("book 1 :");
        String bookId = scanner.nextLine();
        String bookTitle = scanner.nextLine();
        String bookAuthors = scanner.nextLine();
        Book book1 = new Book(bookId, bookTitle, bookAuthors);
        System.out.println("the details of the book is: ");
        book1.printInformation();
        System.out.println("\nbookId change :");
        book1.setIsAvailable(false);
        bookId = scanner.nextLine();
        book1.setId(bookId);
        System.out.println("the details of the book is: ");
        book1.printInformation();
    }
}
