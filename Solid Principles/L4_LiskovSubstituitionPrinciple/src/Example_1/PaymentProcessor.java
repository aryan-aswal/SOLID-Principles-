package Example_1;

import Example_1.BetterCode.InternationalCompatibleCreditCard;
import Example_1.BetterCode.MasterCard;

public class PaymentProcessor {
    public static void processPayment() {
        InternationalCompatibleCreditCard creditCard = new MasterCard();
        creditCard.internationPayment();
    }
}
