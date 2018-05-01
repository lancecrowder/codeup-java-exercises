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
            System.out.println("What number would you like to go up to? ");
            theirNumber = Double.parseDouble(scan.nextLine());
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed ");
            System.out.println("------ | ------  | ------ ");
            for (int i = 0; i <= theirNumber; i++) {
                if (i < 10) {
                    System.out.println(i + "      | " + (Math.pow(i, 2)) + "     | " + (Math.pow(i, 3)));
                } else if (i >= 10 && i < 100) {
                    System.out.println(i + "     | " + (Math.pow(i, 2)) + "    | " + (Math.pow(i, 3)));
                }
            }
            System.out.println("Would you like to enter a new number? Y or N");
            playAgain = letter.nextLine();
        } while (playAgain.equals(Y) || playAgain.equals(y));
    }
}
