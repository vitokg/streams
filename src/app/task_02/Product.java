package task_02;

public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero");
        }
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }
}
