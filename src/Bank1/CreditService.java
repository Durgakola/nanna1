package Bank1;

public class CreditService {
    int balnce;
    public int credit(String accountNo,int amount){
        int localbalance=0;
        String localaccountNo="12345";

        if(localaccountNo.equals(accountNo)){

            balnce=balnce+amount;
        }
        localbalance=balnce;
        return balnce;
    }

}
