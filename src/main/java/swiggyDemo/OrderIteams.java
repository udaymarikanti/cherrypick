package swiggyDemo;

public class OrderIteams {
    public String biryani = "chickenBiryani";
    public int biryaniCost = 500;
    public String starters = "chicken65";
    public int startersCost = 250;
    public String restaurantName = "Mehfil";
    public  int biryanitotalAmount;
    public int startersTotalAmount;
    int noOfOrders;

    public OrderIteams(int noOfOrders,String biryani,String starters) {

        this.noOfOrders = noOfOrders;
        this.biryani  =  biryani;
        this.starters = starters;
    }

}

