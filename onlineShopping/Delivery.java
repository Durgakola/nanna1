package onlineShopping;

public class Delivery {
    public String deliveryBoyName;
    public DeliveryService deliveryService;
    public OrderItem orderItem;
    public KichenService kichenService;

    public String getDeliveryBoyName() {

        return deliveryBoyName;
    }

    public DeliveryService getDeliveryService() {

        return deliveryService;
    }

    public OrderItem getOrderItem() {

        return orderItem;
    }

    public KichenService getKichenService() {

        return kichenService;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {

        this.deliveryBoyName = deliveryBoyName;
    }

    public void setDeliveryService(DeliveryService deliveryService) {

        this.deliveryService = deliveryService;
    }

    public void setOrderItem(OrderItem orderItem) {

        this.orderItem = orderItem;
    }

    public void setKichenService(KichenService kichenService) {

        this.kichenService = kichenService;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryBoyName='" + deliveryBoyName + '\'' +
                ", deliveryService=" + deliveryService +
                ", orderItem=" + orderItem +
                ", kichenService=" + kichenService +
                '}';
    }
}