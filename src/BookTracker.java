import java.util.ArrayList;
import java.util.Scanner;

public class BookTracker
{
    private ArrayList<Book[]> bookShelves;


    public BookTracker()
    {
        bookShelves = new ArrayList<>();
    }


    public void addBook(Book book, int shelfIndex)
    {
        while (shelfIndex >= bookShelves.size())
        {
            bookShelves.add(new Book[10]); // Each shelf can hold up to 10 books
        }


        Book[] shelf = bookShelves.get(shelfIndex);
        for (int i = 0; i < shelf.length; i++)
        {
            if (shelf[i] == null)
            {
                shelf[i] = book;
                System.out.println("Book added successfully to shelf " + shelfIndex);
                return;
            }
        }


        System.out.println("Shelf " + shelfIndex + " is full. Book not added.");
    }


    public void listBooks()
    {
        if (bookShelves.isEmpty())
        {
            System.out.println("No books in the collection.");
        }
        else
        {
            for (int shelfIndex = 0; shelfIndex < bookShelves.size(); shelfIndex++)
            {
                Book[] shelf = bookShelves.get(shelfIndex);
                System.out.println("Shelf " + shelfIndex + ":");
                for (int i = 0; i < shelf.length; i++)
                {
                    if (shelf[i] != null)
                    {
                        System.out.println("  " + i + ": " + shelf[i].toString());
                    }
                }
            }
        }
    }


    public void updateBook(int shelfIndex, int bookIndex)
    {
        if (shelfIndex < bookShelves.size() && bookIndex < bookShelves.get(shelfIndex).length)
        {
            Book book = bookShelves.get(shelfIndex)[bookIndex];
            if (book != null) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Enter new title (leave blank to keep current): ");
                String title = scanner.nextLine();
                if (!title.isEmpty())
                {
                    book.setTitle(title);
                }


                System.out.print("Enter new author (leave blank to keep current): ");
                String author = scanner.nextLine();
                if (!author.isEmpty()) {
                    book.setAuthor(author);
                }


                System.out.print("Enter new number of pages (leave blank to keep current): ");
                String pagesInput = scanner.nextLine();
                if (!pagesInput.isEmpty())
                {
                    int pages = Integer.parseInt(pagesInput);
                    book.setPages(pages);
                }


                System.out.print("Enter new status (Read/Unread, leave blank to keep current): ");
                String status = scanner.nextLine();
                if (!status.isEmpty())
                {
                    book.setStatus(status);
                }


                if (book instanceof EBook)
                {
                    System.out.print("Enter new file size in MB (leave blank to keep current): ");
                    String fileSizeInput = scanner.nextLine();
                    if (!fileSizeInput.isEmpty())
                    {
                        double fileSize = Double.parseDouble(fileSizeInput);
                        ((EBook) book).setFileSize(fileSize);
                    }
                }


                System.out.println("Book updated successfully.");
            }
            else
            {
                System.out.println("No book found at the specified index.");
            }
        }
        else
        {
            System.out.println("Invalid shelf or book index.");
        }
    }


    public void deleteBook(int shelfIndex, int bookIndex)
    {
        if (shelfIndex < bookShelves.size() && bookIndex < bookShelves.get(shelfIndex).length)
        {
            bookShelves.get(shelfIndex)[bookIndex] = null;
            System.out.println("Book deleted successfully.");
        }
        else
        {
            System.out.println("Invalid shelf or book index.");
        }
    }
}



