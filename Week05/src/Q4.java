import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Q4 {
    public static void insertBooks(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book name: ");
        String bookName = scanner.next();

        System.out.print("Enter the book price: ");
        double bookPrice = scanner.nextDouble();

        System.out.print("Enter the published year: ");
        int bookYear = scanner.nextInt();

        System.out.print("Enter the author's name: ");
        String bookAuthor = scanner.next();

        Book book = new Book(bookName, bookYear, bookAuthor);
        book.setPrice(bookPrice);
        books.add(book);
    }

    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<Book>();

        Scanner scanner = new Scanner(System.in);
        String response = "yes";

        while (Objects.equals(response, "yes")) {
            insertBooks(bookCollection);

            System.out.print("Would you like to add another book: ");
            response = scanner.next();
        }

        System.out.println(bookCollection);

    }
}
