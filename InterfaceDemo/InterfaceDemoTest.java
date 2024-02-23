package InterfaceDemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankService hdfcBankService=new HDFCBankService();
        RBIBankService sbiBankService=new SBIBankService();

       String hdfcStatus= hdfcBankService.transfer("1234","333",10);
       String sbiStatus=sbiBankService.transfer("2222","4444",20);

        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);
    }
}
