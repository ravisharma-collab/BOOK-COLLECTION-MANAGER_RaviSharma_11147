import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookCollectionManager {

    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        System.out.println("====================================");
        System.out.println("   BOOK COLLECTION MANAGER");
        System.out.println("====================================");

        while (choice != 5) {

            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Sort Books by Title");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    sortBooksByTitle();
                    break;

                case 4:
                    searchBookByTitle();
                    break;

                case 5:
                    System.out.println("Thank you! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }

    // Add Book
    public static void addBook() {

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine().trim();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine().trim();

        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine().trim();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
            System.out.println("All fields are required!");
            return;
        }

        // Check duplicate ISBN
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Book with this ISBN already exists!");
                return;
            }
        }

        books.add(new Book(title, author, isbn));

        System.out.println("Book added successfully!");
    }

    // Display Books
    public static void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- BOOK COLLECTION ---");

        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    // Sort Books
    public static void sortBooksByTitle() {

        if (books.isEmpty()) {
            System.out.println("No books available to sort.");
            return;
        }

        books.sort(
            Comparator.comparing(
                Book::getTitle,
                String.CASE_INSENSITIVE_ORDER
            )
        );

        System.out.println("Books sorted successfully!");

        displayBooks();
    }

    // Linear Search
    public static void searchBookByTitle() {

        if (books.isEmpty()) {
            System.out.println("No books available to search.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String searchTitle = scanner.nextLine().trim();

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(searchTitle)) {

                System.out.println("\nBook Found!");
                System.out.println(book);

                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }
}
 BookCollectionManager {
    
}
