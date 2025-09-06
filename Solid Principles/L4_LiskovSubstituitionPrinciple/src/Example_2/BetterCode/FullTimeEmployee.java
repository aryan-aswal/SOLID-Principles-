package Example_2.BetterCode;

public class FullTimeEmployee extends Employee implements SalariedEmployee{
    @Override
    public double getSalary() {
        return 5000;
    }
}
