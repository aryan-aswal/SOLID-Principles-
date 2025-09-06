package Example_4.BetterCode;

public class Truck implements Vehicle {
    private final String VehicleType = "Truck";
    @Override
    public InsuranceQuote evaluateInsurance() {
        return new InsuranceQuote(this.VehicleType);
    }
}
