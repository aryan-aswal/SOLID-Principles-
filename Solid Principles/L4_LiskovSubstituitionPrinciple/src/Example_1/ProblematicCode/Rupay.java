package Example_1.ProblematicCode;

class Rupay extends CreditCard {
    void checkBalance() { System.out.println("Rupay: check balance"); }
    void tapAndPay() { System.out.println("Rupay: tap and pay"); }
    void onlineTransfer() { System.out.println("Rupay: online transfer"); }
    void swipeAndPay() { System.out.println("Rupay: swipe and pay"); }
    void mandatePayment() { System.out.println("Rupay: mandate payment"); }
    void internationalPayment() {
        // ❌ Rupay doesn't support international
        throw new UnsupportedOperationException("Rupay doesn't support International");
    }
    void upiPayment() { System.out.println("Rupay: UPI payment"); }
}
