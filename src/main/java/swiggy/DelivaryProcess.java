package swiggy;

import swiggy.model.Order;

public class DelivaryProcess extends SwiggyOrderProcess{
    public DelivaryProcess(SwiggyPaymentService swiggyPaymentService){
        super(swiggyPaymentService);
    }

    @Override
    public boolean delivary(Order order) {
        return false;
    }
}
