public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Mammoth", "Spotty", "Boundless", "Thoughtful", "Barbarous", "Languid", "Chunky", "Dizzy", "Unsightly", "Fallacious"};
        String[] nouns = {"Afterthought", "Observation", "Beginner", "Snail", "Coffee", "Wind", "Airport", "Insurance", "Morning", "Arithmetic"};
        do {
            System.out.println("Here is your server name:\n" + adjectives[rando()] + "-" + nouns[rando()] + "!");
        } while (MethodsExercises.wantsToContinue());
        }
    private static int rando() {
        return ((int) (Math.random() * 10));
    }
}