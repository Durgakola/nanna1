package bookmyshow1;

public class InvalidCredintialsException extends Exception {
    private String code;
     public InvalidCredintialsException(String code,String message){
         super(message);
         this.code=code;
     }

    public String getCode() {
        return code;
    }
}
