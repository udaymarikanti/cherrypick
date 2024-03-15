package swiggyDemo;

public class OrderProcess  extends  OrderIteams{
  //  LoginProcess loginProcess;


    public OrderProcess(int noOfOrders, String biryani, String starters) {
        super(noOfOrders, biryani, starters);


    }

    int totalAmount = 0;
    public String processOrderTest(LoginProcess loginProcess) throws SwiggyException {

        if (loginProcess.login()) {
            if (biryani != null) {
                biryanitotalAmount = biryaniCost * noOfOrders;

            }
            if (starters != null) {
                startersTotalAmount = startersCost * noOfOrders;
            }

            totalAmount = biryanitotalAmount + startersTotalAmount;

            System.out.println("Total Biryani Amount : " + biryanitotalAmount);
            System.out.println("Starters Amount : " + startersTotalAmount);
            System.out.println("Total Amount  :  " + totalAmount);
            return " Your Order is Processed. Total Amount : " + totalAmount;

        } else {
            return "  enter valid credentials. ";
        }
    }
}
