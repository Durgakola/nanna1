package interfacelatestdemo;

import java.util.UUID;

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

            boolean validOtp=false;
            try {
               validOtp= sbiBankLoginService.ValidateOTP(UUID.randomUUID().toString());
            }catch (InvalidOTPException invalidOTPException){
                System.out.println("Error Occurred "+invalidOTPException);
                throw new InvalidRuntimeOTPException(invalidOTPException.getCode(),invalidOTPException.getMessage());

            }catch (Exception e){

            }


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
