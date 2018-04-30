import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        int myInt;
//        Scanner sc= new Scanner(System.in);
//        System.out.println(("Please enter an integer :"));
//        myInt = sc.nextInt();
//        System.out.println(("You Entered " + myInt));
//
//        String stringOne;
//        String stringTwo;
//        String stringThree;
//
//        Scanner lc = new Scanner(System.in);
//        System.out.println(("Please enter three words"));
//        stringOne = lc.next();
//        stringTwo = lc.next();
//        stringThree = lc.nextLine();
//
//        System.out.println(("Your Primary word is: " + stringOne));
//        System.out.println(("Your Secondary word is: " + stringTwo));
//        System.out.println(("Your Tirtiary word is: " + stringThree));
//
//        String myString;
//        System.out.println(("Please enter a sentence: "));
//        Scanner jc = new Scanner(System.in);
//        myString = jc.nextLine();
//        System.out.println(myString);

        int length;
        int width;
        int area;
        System.out.println("Please, enter the Length of the room: ");
        Scanner tc = new Scanner(System.in);
        length = Integer.parseInt(tc.nextLine());
        System.out.println("Please, Enter the Width of the room: ");
        width = Integer.parseInt(tc.nextLine());
        area = length*width;
        System.out.println(("The area of the room is: " + area));
    }
}
