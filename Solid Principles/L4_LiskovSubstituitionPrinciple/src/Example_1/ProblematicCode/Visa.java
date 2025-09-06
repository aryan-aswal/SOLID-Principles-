package Example_1.ProblematicCode;

class Visa extends CreditCard {
    void checkBalance() { System.out.println("Visa: check balance"); }
    void tapAndPay() { System.out.println("Visa: tap and pay"); }
    void onlineTransfer() { System.out.println("Visa: online transfer"); }
    void swipeAndPay() { System.out.println("Visa: swipe and pay"); }
    void mandatePayment() { System.out.println("Visa: mandate payment"); }
    void internationalPayment() { System.out.println("Visa: intl payment"); }
    void upiPayment() {
        // ❌ Visa doesn't support UPI
        throw new UnsupportedOperationException("Visa doesn't support UPI");
    }
}
