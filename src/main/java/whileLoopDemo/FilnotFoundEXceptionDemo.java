package whileLoopDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class FilnotFoundEXceptionDemo {

    public static void main(String[] args) {


        try {
            Date currentDate = new Date();
            System.out.println("");

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MINUTE, 2);
            Date futureDate = cal.getTime();

            boolean  continueWhile = true;

            while (continueWhile) {

                try {
                    FileInputStream fileInputStream = new FileInputStream("D:\\WhileLoopDemoFile\\hello.txt");
                    System.out.println("FILE found");
                    Calendar future = Calendar.getInstance();
                    cal.add(Calendar.MINUTE, 1);
                     currentDate = cal.getTime();
                     continueWhile = false;
                } catch (FileNotFoundException e) {
                    currentDate = new Date();
                    if (currentDate.before(futureDate)){
                        continueWhile = true;

                    }else{
                        continueWhile = false;
                    }
                    System.out.println("Exception occures message " + e.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
