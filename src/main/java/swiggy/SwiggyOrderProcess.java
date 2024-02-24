package swiggy;

import swiggy.model.Order;
import swiggy.model.OrderIteams;
import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public abstract class SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;
    public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService){
        this.swiggyPaymentService = swiggyPaymentService;
    }

    public Order getFinalOrder(Order order){
        double tax = 0;
        if(order.getPrice() > 1000){
             tax = order.getPrice() *20/100;

        }
        double finalAmount = order.getPrice() + tax + 20;
        Order finalOrder = new Order(finalAmount,tax,20);
       finalOrder.setOrderIteamsList(order.getOrderIteamsList());

//        for (int i =0;i<order.getOrderIteamsList().size();i++){
//            finalOrder.addItem(order.getOrderIteamsList().get(i));
//        }

        return finalOrder;
    }
    public  Order createOrder(Order order){
        Order finalOrder = getFinalOrder(order);

                PaymentRequest paymentInitstionRequest =
                  new PaymentRequest("SWIGGY " + UUID.randomUUID().toString(),
                        finalOrder.getPrice(),new Date(),"5555",false);
        PaymentResponse  response = swiggyPaymentService.payment(paymentInitstionRequest);

        if(response != null){
            finalOrder.setStatus("sucess");
            System.out.println(response.getCorelationId());
        }
        delivary(finalOrder);
        return finalOrder;
    }
    public abstract  boolean delivary(Order order);
}
