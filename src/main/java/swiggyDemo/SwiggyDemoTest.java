package swiggyDemo;

public class SwiggyDemoTest {
    public static void main(String[] args)  {


        LoginProcess loginProcess = new LoginProcess("vipteam", "vip");

        OrderProcess orderProcess = new OrderProcess(5, null, "Chicken65");

        try {
            
            orderProcess.processOrderTest(loginProcess);
        } catch (SwiggyException e) {
            System.out.println("" + e.code+ e.getMessage());
        }


        Coupons coupons = new Coupons();

        coupons.couponsprocess(orderProcess);

        PhonePay phonePay = new PhonePay();

        try {
            phonePay.swiggypayment(coupons, "confirm"); // if you want to cancel type cancel
        } catch (SwiggyException e) {
            System.out.println(" " + e.getMessage() + e.code);
        }
        OtpValidation otpValidation = new OtpValidation();

        Delivary delivery = new Delivary(coupons,otpValidation);

        delivery.delivaryStatus("delivered", phonePay);
    }
}

