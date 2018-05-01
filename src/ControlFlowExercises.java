public class ControlFlowExercises {
    public static void main(String[] args) {
        for (double i = 2; i <= 1000000; i=Math.pow(i, 2)) {
            System.out.println(i);
        }
    }
}
