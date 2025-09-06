package Example_3.ProblematicCode;

public class DiscountCalculator {
    public double calculateDiscount(Product product) {
        if(product.getType() == ProductType.ELECTRONICS) {
            return product.getPrice() * 0.1;
        } else if(product.type == ProductType.CLOTHING) {
            return product.getPrice() * 0.2;
        }
        return 0.0;
    }
}
