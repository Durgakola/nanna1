package polymorphisam;

public class RBIBankService {
    public double calculateInterset(int principalAmt){
        int duration=3;
        double interset=principalAmt*duration*0.25*0.024;
        return interset;
    }
}
