package GMail;

public class MailTest {
        public static void main(String[] args) {
            MailLogginProcess mlp = new MailLogginProcess();
            MailSeddingProcess msp = new MailSeddingProcess();
            FromAccountDetails fad = new FromAccountDetails();

            boolean LoginStatus = mlp.login(fad);
            if (LoginStatus){
                String message=msp.sendingProcess("kanakadurga59@gmail.com","hi kusuma how are you");
                System.out.println(message);
            }
        }
    }

