package GMail;

public class MailLogginProcess {
        public boolean login(FromAccountDetails fromAccountDetails){
            String fromGmailId="kanakadurga59@gmail.com";
            String fromPassword="123456";

            if(fromGmailId==fromAccountDetails.emailId && fromPassword==fromAccountDetails.password){
                return true;
            }
            else{
                return false;
            }
        }

    }
