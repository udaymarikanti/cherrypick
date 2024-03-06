package bookMyShowDemo;

public class PayMentProcess extends BookingProcess{

    int localBankBalance = 1000;
    String localStatus = "success";


    public BookingProcess bookingPaymentProcess(BookingProcess bookingProcess,String status) {

        if (bookingProcess.getTotalSeats() > bookingProcess.selectedSeats
                && bookingProcess.totalAmount < localBankBalance) {
            if ( localStatus.equals(status)) {
                localBankBalance = localBankBalance - bookingProcess.totalAmount;
                int seats = bookingProcess.getTotalSeats() - bookingProcess.selectedSeats;
                System.out.println("amount payed :  " + bookingProcess.totalAmount + " remain amount is : " + localBankBalance);
                System.out.println("avalable seats are " + seats);
            } else {
                System.out.println("you have insuficient balance   ");
                int seats = bookingProcess.selectedSeats + bookingProcess.avalbleSeats;
                System.out.println("avalable seats are " + seats);
                System.out.println("your booking is cancel ");
                throw new BookingRuntimeException(ErrorCode.PAYMENT_FAILD.message);
            }

        }else {
            System.out.println(" selected seats more then 10 ");
        }
         return bookingProcess;

        }
    }