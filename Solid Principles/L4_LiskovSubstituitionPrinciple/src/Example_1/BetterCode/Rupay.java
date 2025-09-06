package Example_1.BetterCode;

public class Rupay extends CreditCard implements UpiCompatibleCreditCard {
    @Override
    public void checkBalance() {
        System.out.println("Calling API for Check Balance");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Calling API for Tap And Pay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Calling API for Online Transfer");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Calling API for Swipe And Pay");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Calling API for Mandate Payment");
    }

    @Override
    public void upiPayment() {
        System.out.println("Calling API for Upi Payment");
    }
}

