package company;

import util.Input;

public class InventoryApplication {

    Product[] products = new Product[4];

    public static void main(String[] args) {
        System.out.println("welcome to the store");
        System.out.println("add four new products");

        Product toothbrush = new Product(3, "Toothbrush", .3);
    }
}
