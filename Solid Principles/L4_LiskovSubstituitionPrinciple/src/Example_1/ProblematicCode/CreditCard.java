package Example_1.ProblematicCode;

public abstract class CreditCard {
    abstract void checkBalance();
    abstract void tapAndPay();
    abstract void onlineTransfer();
    abstract void swipeAndPay();
    abstract void mandatePayment();
    abstract void internationalPayment();  // ❌ not valid for all cards
    abstract void upiPayment();            // ❌ not valid for all cards
}
