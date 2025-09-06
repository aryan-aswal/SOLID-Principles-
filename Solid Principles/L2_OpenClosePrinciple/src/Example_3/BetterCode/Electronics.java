package Example_3.BetterCode;

public class Electronics implements Product{
    String type;
    double price;

    public Electronics(String type, double price) {
        this.price = price;
        this.type = type;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;
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
