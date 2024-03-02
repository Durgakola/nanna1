package interfacelatestdemo;

public class SBIBankLoginProcess implements  BankLoginService {

    SBIBankLoginService sbiBankLoginService;
    public SBIBankLoginProcess( ){
        this.sbiBankLoginService =new SBIBankLoginService();
    }

   // public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService){
      //this.sbiBankLoginService =sbiBankLoginService;
   // }


    @Override
    public boolean login(String username, String password) {
        if(sbiBankLoginService.login(username, password)){

            String otp=sbiBankLoginService.generateOTP(username);

               boolean validOtp=sbiBankLoginService.ValidateOTP(otp);

            if(validOtp){
                System.out.println("Valid Otp & Login Successful");
            }
            else{
                System.out.println("inValid Otp & Login is failed");
            }
            return validOtp;
        }else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
