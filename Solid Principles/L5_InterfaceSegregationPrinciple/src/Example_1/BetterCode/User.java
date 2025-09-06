package Example_1.BetterCode;

public class User implements ICanBuy {

    @Override
    public void buy() {
        System.out.println("Product ordered successfully");
    }
}
