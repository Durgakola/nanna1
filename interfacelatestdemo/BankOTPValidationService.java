package interfacelatestdemo;

public interface BankOTPValidationService extends BankLoginService {

    String generateOTP(String accountNumber);

    boolean ValidateOTP(String otp) throws Exception;
}
