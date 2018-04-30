/**
 * Class name needs to match file name!
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        String myString = "Stringy";
        System.out.println(myString);

        double myNumber;
        myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        class class = unexpected token and identifier expected

        int x = 4;
        x += 5;

        x = 3;
        int y = 4;
        y *= x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;
    }
}


//psvm = public static void main(String[] args) {}
//sout = System.out.println("");