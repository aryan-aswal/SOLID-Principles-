package Example_3.BetterCode;

public class Clothes implements Product{
    String type;
    double price;

    public Clothes(String type, double price) {
        this.price = price;
        this.type = type;
    }

    @Override
    public double getDiscount() {
        return price * 0.2;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
