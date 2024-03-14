package bookmyshow1;

public class InvalidInputException extends Exception{
    private String code;
    public InvalidInputException(String code,String message){
        super(message);
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
