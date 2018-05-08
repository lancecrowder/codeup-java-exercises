package company;

public class Subscription extends Product {

    public Subscription(double price, String name, int numberOfMonths){
        super(price, name, numberOfMonths);
        this.numberOfMonths = numberOfMonths;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public int numberOfMonths;
}