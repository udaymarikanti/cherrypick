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
        calendar.add(Calendar.MINUTE,1);
        Date endTime = calendar.getTime();

            while (currentTime.before(endTime)) {


                try {
                    FileInputStream fileInputStream = new FileInputStream("D:\\WhileLoopDemoFile\\hello.txt");
                    System.out.println("File found ");
                    break;
                } catch (FileNotFoundException e) {
                    System.out.println("file not found ");
                    //throw new RuntimeException(e);
                }
                calendar = Calendar.getInstance();
                currentTime = calendar.getTime();

            }

        }

    }
