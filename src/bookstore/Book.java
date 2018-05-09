package bookstore;

public class Book extends Product {
    public Book(String title, double price) {
        super(title, price);
    }

    public String Author;

    public Book(String title, double price, String author) {
        super(title, price);
        Author = author;
    }
}
