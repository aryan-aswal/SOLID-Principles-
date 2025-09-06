package Example_3.ProblematicCode;

public class Product {
    ProductType type;
    double price;
    public Product(ProductType type, double price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType() {
        return this.type;
    }
    public double getPrice() {
        return this.price;
    }
}
