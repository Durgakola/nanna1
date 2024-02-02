package Amazon;

public class AmzonLoginService {
    public String loginService(UserLoginDetails userLoginDetails){
        String localUserId="durga123";
        String localPassword="123456";
        if(localPassword.equals(userLoginDetails.password)&&localUserId.equals(userLoginDetails.userId)){
            return "Login Successful";
        }
        else{
            return "Login fail";
        }
    }
}
