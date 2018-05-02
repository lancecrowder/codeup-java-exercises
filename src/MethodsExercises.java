public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition  =  " + addition(5, 2));
        System.out.println("Subtraction = "+ subtraction(5, 2));
        System.out.println("multiplication = " + multiplication(5, 2));
        System.out.println("division = " + division(5, 2));
        System.out.println("modulus = " + modulus(5, 2));
        System.out.println(("multiply recursive = " + multiplyRecursive(5, 2)));
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

    public static double division (double i, double j) { return i/j; }

    public static double modulus (double i, double j) {
        return i%j;
    }

//    public static int getInteger(int min, int max);

    public static double multiplyRecursive (double i, double j){
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

}