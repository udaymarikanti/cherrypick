package swiggy.model;

import java.util.Date;

public class PaymentResponse {
    private String corelationId;
    private  String status;
    private Date responceDate;

    public void setCorelationId(String corelationId) {
        this.corelationId = corelationId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResponceDate(Date responceDate) {
        this.responceDate = responceDate;
    }

    public PaymentResponse(String corelationId, String status, Date responceDate) {
        this.corelationId = corelationId;
        this.status = status;
        this.responceDate = responceDate;
    }

    public String getCorelationId() {
        return corelationId;
    }

    public String getStatus() {
        return status;
    }

    public Date getResponceDate() {
        return responceDate;
    }
}
