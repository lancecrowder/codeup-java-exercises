package bookstore;

public class BookStore {
    public static void main(String[] args) {
        Author stevieKing = new Author("StevenKing", 2);
        Author maggieAtwood = new Author("MargaretAtwood", 1);
        Author dylanTommy = new Author("DylanThomas", 2);

        Book carrie = new Book("Carrie", 17.95, "stevieKing");
        Book rhatsr = new Book("Rita Hayworth and the Shawshank Redemption", 53.99, "stevieKing");
        Book hadnmaidsTail = new Book("The Handmaid's Tail", 2.99, "maggieAtwood");
        Book doNotGoGentle = new Book("Do Not Go Gentle into that Good Night", 12.99, "dylanThomas");
        Book portrait = new Book("Portrait of the Artist as a Young Dog", 15.99, "dylanThomas");

        String[] customers = {"Bashful", "Doc", "Dopey", "Happy", "Sleepy", "Sneezy", "Grumpy", "Swift"};

        for (int i=0; i < customers.length; i++){
            System.out.println(customers[i]);
        }
    }
}