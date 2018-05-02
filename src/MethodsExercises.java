public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition  =  " + addition(5, 2));
        System.out.println("Subtraction = "+ subtraction(5, 2));
        System.out.println("multiplication = " + multiplication(5, 2));
        System.out.println("division = " + division(5, 0));
        System.out.println("modulus = " + modulus(5, 2));
    }

    public static double addition (double i, double j) {
        return i+j;
    }

    public static double subtraction (double i, double j) {
        return i-j;
    }

    public static double multiplication (double i, double j) {
        return i*j;
    }

    public static double division (double i, double j) {
        return i/j;
    }

    public static double modulus (double i, double j) {
        return i%j;
    }
}
