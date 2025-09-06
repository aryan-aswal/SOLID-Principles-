package Example_1.ProblematicCode;

public class Admin implements User {
    @Override
    public boolean canBuyProducts() {
        return true;
    }

    @Override
    public boolean canModifyProducts() {
        return true;
    }

    @Override
    public boolean canAddProducts() {
        return true;
    }

    @Override
    public boolean canApproveProducts() {
        return true;
    }

    @Override
    public void approveProduct() {

    }
}