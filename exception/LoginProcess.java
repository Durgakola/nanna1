package exception;

public class LoginProcess implements Payment {

    @Override
    public boolean login() {
        String localname="kusuma";
        int localid=101;
        if(localname.equals(name)&&localid==id){
            System.out.println("login successful");
        }else{
            System.out.println("login failed");
        }
        return false;
    }

    public static void main(String[] args) {
        LoginProcess loginProcess=new LoginProcess();
        loginProcess.login();
    }
}
