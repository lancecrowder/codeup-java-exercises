import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randoNum = randoNum();
        int userGuess;
        do {
            userGuess = userNum();
//          All user inputs are validated
//           isValid(userGuess);
            if(userGuess<randoNum){
                System.out.println("HIGHER");
            }else if (userGuess>randoNum){
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!!!");
            }
        } while (userGuess != randoNum);
    }

    public static int randoNum(){
        return (int) (Math.random()*100) + 1;
    }

    public static int userNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number-Guess: ");
        return input.nextInt();
    }

//    public static int isValid(userGuess)
}