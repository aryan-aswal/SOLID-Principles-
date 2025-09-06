package Example_1.BetterCode;

public class Visa extends CreditCard implements InternationalCompatibleCreditCard {
    @Override
    public void checkBalance() {
        System.out.println("Calling API for Checking Balance");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Calling API for checking Tap And Pay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Calling API for online transfer");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Calling API for Swipe And Pay");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Calling API for mandate payments");
    }

    @Override
    public void internationPayment() {
        System.out.println("Calling API for international payment");
    }
}
    
