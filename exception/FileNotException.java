package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class FileNotException {

    public static void main(String[] args) {

        LocalDateTime currentTime=LocalDateTime.now();
        LocalDateTime expTime = LocalDateTime.of(LocalDateTime.now().toLocalDate(),java.time.LocalTime.of(15,17));
        while(currentTime.isBefore(expTime)){
            try{
                FileInputStream fileInputStream=new FileInputStream("D:\\Advance\\durga\\java.txt");
                System.out.println("File Found");
                break;
            }catch (FileNotFoundException e){
                currentTime=LocalDateTime.now();
                System.out.println("File Not Found"+ e.getMessage());
            }
        }
    }
}
