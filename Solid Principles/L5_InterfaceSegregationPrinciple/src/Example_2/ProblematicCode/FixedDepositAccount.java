package Example_2.ProblematicCode;

public class FixedDepositAccount implements Account{
    @Override
    public void withdraw(int amount) {
        System.out.println("Full Withdrawal in process");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Making a FD deposit");
    }

    @Override
    public void checkBalance(int accNo) {
        System.out.println("Checking FD balance");
    }

    @Override
    public void getMaturityPeriod() {
        System.out.println("3 years");
    }

    @Override
    public boolean isPartiallyWithdrawAble() {
        return false;
    }

    @Override
    public void payEMI() {
        //No EMI applicable so empty impl.
    }
}
