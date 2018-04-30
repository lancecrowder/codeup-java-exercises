import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        INTEGER EXERCISE
        int myInt;
        Scanner sc= new Scanner(System.in);
        System.out.println(("Please enter an integer :"));
        myInt = sc.nextInt();
        System.out.println(("You Entered " + myInt));
//          THREE WORDS EXERCISE
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
//          SENTENCE EXERCISE
        String myString;
        System.out.println(("Please enter a sentence: "));
        Scanner jc = new Scanner(System.in).useDelimiter("\n");
        myString = jc.nextLine();
        System.out.println(myString);
//          Area and Perimeter Exercise
        double width;
        double length;
        double height;
        double area;
        double perimeter;
        double volume;
        System.out.println("Please, enter the Length of the room: ");
        Scanner tc = new Scanner(System.in);
        length = Integer.parseInt(tc.nextLine());
        System.out.println("Please, Enter the Width of the room: ");
        width = Integer.parseInt(tc.nextLine());
        System.out.println("Please, Enter the Height of the room: ");
        height = Integer.parseInt(tc.nextLine());
        area = length*width;
        perimeter = (2*length)+(2*width);
        volume = height*width*length;
        System.out.println(("The Area of the room is: " + area));
        System.out.println(("The Perimeter of the room is: " + perimeter));
        System.out.println(("The Volumn of the room is: " + volume));
    }
}
