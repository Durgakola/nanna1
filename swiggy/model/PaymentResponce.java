package swiggy.model;

import java.util.Date;

public class PaymentResponce {
    private String corelationId;
    private String status;
    private Date responceDate;

    public PaymentResponce(String corelationId, String status, Date responceDate) {
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
