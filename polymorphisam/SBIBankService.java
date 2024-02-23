package polymorphisam;

public class SBIBankService extends RBIBankService{
    public double calculateInterset(int principalAmt) {
        double totalAmt=0;
        double intersetAmt=super.calculateInterset(principalAmt);
        totalAmt=intersetAmt+principalAmt;
        return totalAmt;
    }

    public double calculateInterset(int principalAmt,int days) {
        double totalAmt = 0;
        if(days>85){
            return this.calculateInterset(principalAmt);
        }
        return totalAmt+principalAmt;

    }

}
