package Inheritance;

public class RetailAccount extends Account{
    private int minimumBalance=100;
    private int limit=20;

    public RetailAccount(String accountNumber, int balance, boolean status, int minimumBalance, int limit) {
        super(accountNumber, balance, status);
        this.limit = limit;
        this.minimumBalance = minimumBalance;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public int getLimit() {
        return limit;
    }
}
