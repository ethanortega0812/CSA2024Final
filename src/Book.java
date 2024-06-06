public class Book
{
    private String title;
    private String author;
    private int pages;
    private String status;


    // Default constructor
    public Book()
    {
        this.title = "";
        this.author = "";
        this.pages = 0;
        this.status = "";
    }


    // Parameterized constructor
    public Book(String title, String author, int pages, String status) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.status = status;
    }


    // Getters and Setters
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPages() {
        return pages;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status)
    {
        this.status = status;
    }


    // toString method
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Status: " + status;
    }
}



