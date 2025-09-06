package Example_4.BetterCode;

public class Car implements Vehicle{
    private final String VehicleType = "Car";
    @Override
    public InsuranceQuote evaluateInsurance() {
        return new InsuranceQuote(this.VehicleType);
    }
}
