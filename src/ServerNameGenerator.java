public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Mammoth", "Spotty", "Boundless", "Thoughtful", "Barbarous", "Languid", "Chunky", "Dizzy", "Unsightly", "Fallacious"};
        String[] nouns = {"Afterthought", "Observation", "Beginner", "Snail", "Coffee", "Wind", "Airport", "Insurance", "Morning", "Arithmetic"};
        System.out.println("Here is your server name:\n" + adjectives[roll()] + "-" + nouns[roll()] + "!");
    }
    private static int roll() {
        return ((int) (Math.random() * 10));
    }
}