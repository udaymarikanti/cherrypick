package bookMyShowDemo;

public class BookMyShowTest {
    public static void main(String[] args)  {

        try {
            BookMyShowLogin bookMyShowLogin = new BookMyShowLogin("uday","1234");
            GenerateOtp generateOtp = new GenerateOtp();
            generateOtp.generateOtp(bookMyShowLogin,"uday");
            BookingProcess bookingProcess = new BookingProcess();
            bookingProcess.bookingProcess(30,generateOtp,"98765");
            PayMentProcess payMentProcess = new PayMentProcess();
            payMentProcess.bookingPaymentProcess(bookingProcess,"success");
        } catch (BookMyShowException e) {
            System.out.println(e.getMessage()+ " "+ e.errorCode);
        }

    }
}
