package Bank;

public class CreditService {
    public int balance;
    public int credit(String account,int amount){
        int localbalance=0;
        String localaccountNo="12345";

        if(localaccountNo.equals(account)){
            balance=balance+amount;
        }
        localbalance=balance;
        return balance;
    }
}
