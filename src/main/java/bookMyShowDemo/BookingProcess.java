package bookMyShowDemo;

public class BookingProcess  {

    private int  totalSeats = 10;
    private int amount = 150;
    int selectedSeats;
    int avalbleSeats= 0;
    int totalAmount =0;

    public int getBookingAmount() {
        return bookingAmount;
    }

    private  int bookingAmount;

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAmount() {
        return amount;
    }


    public  String bookingProcess(int selectNoOfSeats, GenerateOtp generateOtp, String enterOtp) throws BookMyShowException {
        if(generateOtp.otp.equals(enterOtp)) {
            if(totalSeats>selectNoOfSeats) {
                totalAmount = amount * selectNoOfSeats;
                avalbleSeats = totalSeats - selectNoOfSeats;
                selectedSeats = selectNoOfSeats;
                System.out.println("your seats are booked " + selectNoOfSeats + "  you need to pay  amount  " + totalAmount);
            }else {
                System.out.println("select the seats below 10 ");
            }
        }else {
            System.out.println("seat allocation failed");
            throw new BookMyShowException(ErrorCode.BOOKING_PROCESS_FAILED.message,ErrorCode.BOOKING_PROCESS_FAILED.code);
        }
        return  "booking successfully ";

    }



}
