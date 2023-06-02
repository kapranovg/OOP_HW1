package HW1;

public abstract class Product {
    private String name;
    private double price;
    protected int volume;

    public Product(String name, int volume, double price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " руб.";
    }
}
