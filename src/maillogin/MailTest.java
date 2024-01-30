package maillogin;

public class MailTest {
    public static void main(String[] args) {
        MailLoginProcess mlp = new MailLoginProcess();
        MailSendingProcess msp = new MailSendingProcess();
        FromAccountDetails fad = new FromAccountDetails();

        boolean LoginStatus = mlp.login(fad);
        if (LoginStatus){
            String message=msp.sendingProcess("kanakadurga59@gmail.com","hi kusuma how are you");
            System.out.println(message);
        }
    }
}
