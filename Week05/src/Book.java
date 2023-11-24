public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private int yearPublished;
    private String authorName;

    public Book(String title, int yearPublished, String authorName) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearPublished=" + yearPublished +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book b) {
        // compare here the book based on the year;
        return this.yearPublished - b.yearPublished;
    }
}