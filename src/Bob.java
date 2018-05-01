import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Have you met Bob?!");
        String userInput = input.nextLine();

        boolean isQuestion = userInput.endsWith("?");
        boolean isYelling = userInput.equals(userInput.toUpperCase());
        boolean isEmpty = userInput.trim().equals("");


        if (isQuestion) {
            System.out.println("Sure");
        } else if (isYelling){
            System.out.println("Whoa, chill out!");
        } else if (isEmpty){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}