package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    //-----constructor------
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        String input;
        System.out.println("Please enter a string");
        input = this.scanner.nextLine();
        return input;
    }

    boolean yesNo(){
        String input;
        System.out.println("Yes or No?");
        input = this.scanner.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max){
        int input;
        do{
        System.out.println("Please, enter an integer between " + min + " and " + max + ".");
        input = this.scanner.nextInt();}
        while (input < min || input > max);
        return input;
    }

    int getInt(){
        System.out.println("Please, enter an integer");
        return this.scanner.nextInt();
    }

    double getDouble(double min, double max){
        double input;
        do{
            System.out.println("Please, enter a Double between " + min + " and " + max + ".");
            input = this.scanner.nextDouble();}
        while (input < min || input > max);
        return input;
    }
    public double getDouble() {
        System.out.println("Please, enter a Double");
        return this.scanner.nextDouble();
    }
}
