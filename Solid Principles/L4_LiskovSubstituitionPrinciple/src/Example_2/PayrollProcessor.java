package Example_2;

import Example_2.BetterCode.SalariedEmployee;

import java.util.List;

public class PayrollProcessor {
    public void processPayment(List<SalariedEmployee> employees){
        for (SalariedEmployee employee: employees) {
            String output = String.format("payment processed with amount: %.2f", employee.getSalary());
            System.out.println(output);
        }
    }
}
