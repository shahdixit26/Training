package training;

class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalSold;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (quantity > this.quantity) {
            System.out.println("Insufficient quantity available.");
        } else {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold successfully.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("iPhone", 999.99, 10);
        Product product2 = new Product("Headphones", 49.99, 20);
        Product product3 = new Product("Keyboard", 79.99, 15);

        product1.sell(3);
        product2.sell(10);
        product3.sell(5);

        System.out.println("Total products sold: " + Product.getTotalSold());
    }
}
