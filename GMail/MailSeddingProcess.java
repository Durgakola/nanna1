package GMail;

public class MailSeddingProcess {
        String message="hi";
        public String sendingProcess(String toEmail,String typeMsg){
            ToAccountDetails tad=new ToAccountDetails();
            MailLogginProcess mlp=new MailLogginProcess();
            FromAccountDetails fad=new FromAccountDetails();

            boolean loginStatus = mlp.login(fad);
            if(loginStatus){
                message=typeMsg;
                tad.index=message;
                System.out.println("message Recived : " +tad.index);
            }
            return message;

        }
    }
