//import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition  =  " + addition(5, 2));
        System.out.println("Subtraction = "+ subtraction(5, 2));
        System.out.println("multiplication = " + multiplication(5, 2));
        System.out.println("division = " + division(5, 2));
        System.out.println("modulus = " + modulus(5, 2));
        System.out.println(("multiply recursive = " + multiplyRecursive(5, 2)));
        System.out.println(getInteger(1, 10));
        do {
            System.out.println(getFactoral(getInteger(1, 10)));
        } while (wantsToContinue());

        do {
            System.out.println(getSides());
        } while (wantsToContinue());
    }
// ----------------------Rudimentary Calc-----------------------------
    public static double addition (double i, double j) {
        return i+j;
    }

    public static double subtraction (double i, double j) {
        return i-j;
    }

    public static double multiplication (double i, double j) {
        return i*j;
    }

    public static double division (double i, double j) { return i/j; }

    public static double modulus (double i, double j) {
        return i%j;
    }
//-----------------Multiply Recursive--------------------------------------
    public static int multiplyRecursive (int i, int j){
        if (i == 0 || j == 0){
            return 0;
        }
        if (i == 1){
            return j;
        }
        if (j == 1){
            return i;
        }
        return i + multiplyRecursive(i,j-1);
    }
// -------------------Get Int---------------------------------------
    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min +" and " + max + ": ");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int userInput = input.nextInt();
        if (userInput < min || userInput > max){
            return getInteger(min, max);
        }
        return userInput;
    }
//-----------------Factoral------------------------------------------
    public static int getFactoral ( int userInput) {
            if (userInput < 2) {
                return 1;
            }
            return userInput * getFactoral(userInput - 1);
    }
//--------------------------Wants to Continue-----------------------
    public static boolean wantsToContinue(){
        String playAgain;
        Scanner letter = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Press Y to continue");
        playAgain = letter.next();
        if(playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
// ----------------Dice Exercise----------------------------
    public static int getSides() {
        System.out.print("Enter a number of Die sides :");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int dieSides = input.nextInt();
        return diceRoll(dieSides);
    }

    public static int diceRoll (int dieSides){
        if (dieSides > 1){
            double dieOne = (int) (Math.random()*dieSides) + 1;
            System.out.println("First Dice:" + dieOne);
            double dieTwo = (int) (Math.random()*dieSides) + 1;
            System.out.println("Second Dice:" + dieTwo);
        }
        return (0);
    }
}