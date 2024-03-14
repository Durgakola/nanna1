package interfacelatestdemo;

import marks.Student;

import java.util.Calendar;

public enum ErrorCodes {
    NEOTERIC_INVALID_OTP_1000("NEOTECH_IV_1000","Invalid OTP"),
    NEOTERIC_EXPIRY_OTP_1001("NEOTECH_EX_1001","Expired OTP");

    //All many as parameters we can pass the constructor.
    String code;
    String message;
    ErrorCodes(String errorCode,String message) {
        this.code = errorCode;
        this.message=message;
    }

    public String getCode(){
        return code;
    }

    public String getMessage() {
        return message;
    }
}
