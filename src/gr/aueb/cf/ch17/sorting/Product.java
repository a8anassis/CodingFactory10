package gr.aueb.cf.ch17.sorting;

public class Product implements Comparable<Product> {
    private String description;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
//        return String.format("%s: %f, %d", description, price, quantity);
        return description + ": " + price + ", " + quantity;
    }

    @Override
    public int compareTo(Product o) {
        return this.description.compareTo(o.description);   // natural ordering

//        if (this.quantity < o.quantity) {
//            return -1;
//        } else if (this.quantity > o.quantity) {
//            return 1;
//        } else {
//            return 0;
//        }
//        return this.quantity - o.quantity;

//        return Double.compare(this.price, o.price);
    }
}
