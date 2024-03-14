package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class FileException {
        public static void main (String[]args) throws InterruptedException {

            Calendar cal = Calendar.getInstance();
            Date currentTime = cal.getTime();



            cal.add(Calendar.MINUTE, 1);
            Date endTime = cal.getTime();


            while (currentTime.before(endTime)) {
                try {

                    FileInputStream fileInputStream = new FileInputStream("D:\\Advance\\durga\\hello.txt");

                    System.out.println("File found!");
                    break;
                } catch (FileNotFoundException e) {

                    System.out.println("File not found. Retrying...");
                }

                //Thread.sleep(1000);


                cal = Calendar.getInstance();
                currentTime = cal.getTime();
            }
        }
    }



//         FileInputStream fileInputStream=new FileInputStream();
//
//       int i = 0;
//       while (i < 11) {
//           i++;
//            System.out.println("from while loop i =" + i);
//      }


