public class EBook extends Book
{
    private double fileSize;


    public EBook()
    {
        super();
        this.fileSize = 0.0;
    }

    public EBook(String title, String author, int pages, String status, double fileSize)
    {
        super(title, author, pages, status);
        this.fileSize = fileSize;
    }

    public double getFileSize()
    {
        return fileSize;
    }


    public void setFileSize(double fileSize)
    {
        this.fileSize = fileSize;
    }

    public String toString()
    {
        return super.toString() + ", File Size: " + fileSize + " MB";
    }
}



