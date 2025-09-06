package Example_4.ProblematicCode;

public class VehicleInsuranceEvaluator {
    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        if(vehicle instanceof Car) {
            return new InsuranceQuote("Car insurance is issued");
        } else if (vehicle instanceof Truck) {
            return new InsuranceQuote("Truck insurance is issued");
        }
        throw new IllegalArgumentException("Unsupported vehicle type");
    }
}
