import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        int myInt;
//        Scanner sc= new Scanner(System.in);
//        System.out.println(("Please enter and integer :"));
//        myInt = sc.nextInt();
//        System.out.println(("You Entered " + myInt));

        String stringOne;
        String stringTwo;
        String stringThree;

        Scanner lc = new Scanner(System.in);
        System.out.println(("Please enter three words"));
        stringOne = lc.next();
        stringTwo = lc.next();
        stringThree = lc.nextLine();

        System.out.println(("Your Primary word is: " + stringOne));
        System.out.println(("Your Secondary word is: " + stringTwo));
        System.out.println(("Your Tirtiary word is: " + stringThree));
    }
}
