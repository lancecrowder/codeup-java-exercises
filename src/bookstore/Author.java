package bookstore;

public class Author extends Person {
    public Author(String name) {
        super(name);
    }

    public int numberOfBooksWritten;


    public Author(String name, int numberOfBooksWritten) {
        super(name);
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

}
