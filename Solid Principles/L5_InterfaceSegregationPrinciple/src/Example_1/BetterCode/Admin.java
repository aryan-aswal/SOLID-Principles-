package Example_1.BetterCode;

public class Admin implements ICanApprove {
    @Override
    public void approve() {
        System.out.println("Product approved successfully");
    }

    @Override
    public void addProduct() {
        System.out.println("Product added successfully");
    }

    @Override
    public void modifyProduct() {
        System.out.println("Product modified successfully");
    }

    @Override
    public void buy() {
        System.out.println("Product is ordered successfully");
    }
}
