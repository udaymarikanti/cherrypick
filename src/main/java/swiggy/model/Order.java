package swiggy.model;

import java.util.ArrayList;
import java.util.List;

public class Order {


    public List<OrderIteams> orderIteamsList = new ArrayList<>();

    private  double price;

    private  double serviceCharges;

    private int tipAmt;
    private  String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(double price, double serviceCharges, int tipAmt) {
        this.price = price;
        this.serviceCharges = serviceCharges;
        this.tipAmt = tipAmt;
    }
    public  void  addItem(OrderIteams items){
        orderIteamsList.add(items);
        price = price +items.getPrice();
    }
    public  void  removeItem(OrderIteams items){
        orderIteamsList.remove(items);
        price = price-items.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public int getTipAmt() {
        return tipAmt;
    }
    public void setOrderIteamsList(List<OrderIteams> orderIteamsList) {
        this.orderIteamsList = orderIteamsList;
    }

    public List<OrderIteams> getOrderIteamsList() {
        return orderIteamsList;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public void setTipAmt(int tipAmt) {
        this.tipAmt = tipAmt;
    }
}
