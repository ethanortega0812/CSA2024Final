import java.util.Scanner;

public class BookTrackerApp
{
    public static void main(String[] args)
    {
        BookTracker bookTracker = new BookTracker();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        while (running)
        {
            System.out.println("Book Tracker Menu:");
            System.out.println("1. View all books");
            System.out.println("2. Add a new book");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice)
            {
                case 1:
                    bookTracker.listBooks();
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter number of pages: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter status (Read/Unread): ");
                    String status = scanner.nextLine();
                    System.out.print("Enter shelf index: ");
                    int shelfIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Is this an eBook (yes/no): ");
                    String isEBook = scanner.nextLine();


                    if (isEBook.equalsIgnoreCase("yes"))
                    {
                        System.out.print("Enter file size in MB: ");
                        double fileSize = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        EBook newEBook = new EBook(title, author, pages, status, fileSize);
                        bookTracker.addBook(newEBook, shelfIndex);
                    }
                    else
                    {
                        Book newBook = new Book(title, author, pages, status);
                        bookTracker.addBook(newBook, shelfIndex);
                    }
                    break;
                case 3:
                    System.out.print("Enter the shelf index of the book to update: ");
                    int updateShelfIndex = scanner.nextInt();
                    System.out.print("Enter the book index on the shelf to update: ");
                    int updateBookIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    bookTracker.updateBook(updateShelfIndex, updateBookIndex);
                    break;
                case 4:
                    System.out.print("Enter the shelf index of the book to delete: ");
                    int deleteShelfIndex = scanner.nextInt();
                    System.out.print("Enter the book index on the shelf to delete: ");
                    int deleteBookIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    bookTracker.deleteBook(deleteShelfIndex, deleteBookIndex);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}