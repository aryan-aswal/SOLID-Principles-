package Example_2.ProblematicCode;

public interface Account {
    public void withdraw(int amount);

    public void deposit(int amount);

    public void checkBalance(int accNo);

    public void getMaturityPeriod();

    public boolean isPartiallyWithdrawAble();

    public void payEMI();
}