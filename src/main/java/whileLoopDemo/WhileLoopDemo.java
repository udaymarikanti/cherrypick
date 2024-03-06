package whileLoopDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class WhileLoopDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();
        calendar.add(Calendar.MINUTE,2);

            while (true) {


                try {
                    FileInputStream fileInputStream = new FileInputStream("D:\\WhileLoopDemoFile\\hello.txt");
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }

    }
