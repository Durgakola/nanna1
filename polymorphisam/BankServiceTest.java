package polymorphisam;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService=new SBIBankService();
        double sbiBankInterset=sbiBankService.calculateInterset(1000,86);
        System.out.println("SBI Bank: "+sbiBankInterset);

        HDFCBankService hdfcBankService=new HDFCBankService();
        double hdfcBankInterset=hdfcBankService.calculateInterset(1000,88);
        System.out.println("HDFC Bank: "+hdfcBankInterset);




    }
}
