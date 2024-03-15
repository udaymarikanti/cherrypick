package swiggyDemo;

public class Coupons {
    public int amount;
    public  double discount;
    double finalAmount;

    public String couponsprocess(OrderProcess orderProcess){


        //  amount = orderProcess.totalAmount;

        if(orderProcess.totalAmount>500 && orderProcess.totalAmount<=1000){

            discount = orderProcess.totalAmount* 0.2;
        }
        else if(orderProcess.totalAmount>1000) {

            discount = orderProcess.totalAmount * 0.3;
        }

        else{
            discount = 0;
            System.out.println("below 500 no discount ");
        }

        //  amount= (int) (amount-discount);

        finalAmount  = orderProcess.totalAmount - discount;

        if (discount > 0) {
            System.out.println("Your discount amount: " + discount );
            // System.out.println(" from total amount: " + orderProcess.totalAmount);
            System.out.println( " Your final amount to pay: " + finalAmount);

        }


        return "select your order ";
    }
}
