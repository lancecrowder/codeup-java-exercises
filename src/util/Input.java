package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    //-----constructor------
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt){
        String input;
        System.out.println(prompt);
        input = this.scanner.nextLine();
        return input;
    }

    public boolean yesNo(String prompt){
        String input;
        System.out.println(prompt);
        input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        int input;
        do{
        System.out.println("Please, enter an integer between " + min + " and " + max + ".");
        input = this.scanner.nextInt();}
        while (input < min || input > max);
        return input;
    }

    public int getInt(){
        System.out.println("Please, enter an integer");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double input;
        do{
            System.out.println("Please, enter any number between " + min + " and " + max + ".");
            input = this.scanner.nextDouble();}
        while (input < min || input > max);
        return input;
    }
    public double getDouble() {
        System.out.println("Please, enter any number");
        return this.scanner.nextDouble();
    }
}
