package interfacelatestdemo;

public class SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService=new SBIBankLoginProcess();//null

        try {
            boolean loginStatus = loginService.login("1111", "1234" );
            if (loginStatus) {
                System.out.println("Login successful" );
            } else {
                System.out.println("Login failed" );
            }
        }catch (InvalidRuntimeOTPException e){
            System.out.println(e.getMessage()+"  "+e.getCode());
        }
    }
}
