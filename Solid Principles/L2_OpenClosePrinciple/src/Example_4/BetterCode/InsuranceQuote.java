package Example_4.BetterCode;

public class InsuranceQuote {
    private final String quoteMessage;

    public InsuranceQuote(String str) {
        this.quoteMessage = str + " insurance is issued";
    }

    public String getQuoteMessage() {
        return quoteMessage;
    }
}
