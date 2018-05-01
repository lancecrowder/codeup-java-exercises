import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        String Y = "Y";
        String y = "y";
        String playAgain;
        Scanner letter = new Scanner(System.in);
        do {
            double theirNumber;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your Number Grade: ");
            theirNumber = Double.parseDouble(scan.nextLine());
            System.out.println("Here is your Letter Grade!");
            System.out.println();
                if (theirNumber >= 88) {
                    System.out.println("A - Great Job!");
                } else if (theirNumber <= 87 && theirNumber >= 80) {
                    System.out.println("B - Not Bad!");
                } else if (theirNumber <= 79 && theirNumber >= 67){
                    System.out.println("C - C's get degrees!");
                } else if (theirNumber <= 66 && theirNumber >= 60){
                    System.out.println("D - Squeaking by!");
                } else {
                    System.out.println("F - You Suck...");
                }
                    System.out.println("Would you like to enter a new Grade? Y or N");
            playAgain = letter.nextLine();
        } while (playAgain.equals(Y) || playAgain.equals(y));
    }
}
