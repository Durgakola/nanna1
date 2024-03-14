package bookmyshow1;

import interfacelatestdemo.ErrorCodes;

public class Login {
    private String validUserName;
    private String valiPassword;

    public Login(String validUserName,String valiPassword){
        this.validUserName=validUserName;
        this.valiPassword=valiPassword;
    }
    public boolean login(String username,String password) throws InvalidCredintialsException{

        if(username.equals(validUserName)&&password.equals(valiPassword)){
            System.out.println("Login Successful");
        }
        else{
            throw new InvalidCredintialsException(Errorcodes.Login_Failed.getCode(),
                    Errorcodes.Login_Failed.getMessage());
        }return false;
    }
}
