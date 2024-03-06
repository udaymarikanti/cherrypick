package bookMyShowDemo;

public class PayMentProcess extends BookingProcess{

    int localBankBalance = 1000;
    String localStatus = "success";


    public BookingProcess bookingPaymentProcess(BookingProcess bookingProcess,String status){

        if(localStatus.equals(status)) {
            if( bookingProcess.getTotalSeats()< bookingProcess.selectedSeats) {
                if (bookingProcess.totalAmount < localBankBalance) {
                    localBankBalance = localBankBalance - bookingProcess.totalAmount;
                    int seats = bookingProcess.getTotalSeats() - bookingProcess.selectedSeats;

                    System.out.println("amount payed :  " + bookingProcess.totalAmount + " remain amount is : " + localBankBalance);
                    System.out.println("avalable seats are " + seats);
                } else {
                    System.out.println("you have insuficient balance ");
                    int seats = bookingProcess.selectedSeats + bookingProcess.avalbleSeats;
                    System.out.println("avalable seats are " + seats);
                    //throw new BookingRuntimeException(ErrorCode.PAYMENT_FAILD.message);
                }
            }

        }else {
            System.out.println("your booking is cancel ");
        }

        return bookingProcess;
    }
}