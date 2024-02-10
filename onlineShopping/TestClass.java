package onlineShopping;

import constructor.Student1;

public class TestClass {

    public static void main(String[] args) {
        KichenService kicheanService=new KichenService();
        kicheanService.setTypeOfOil("Freedom");
        kicheanService.setTypeOfRice("Basmathi Rice");

        DeliveryService deliveryService=new DeliveryService();
        deliveryService.setTypeOfService("Online");

        Biryani biryani=new Biryani();
        biryani.setType("Chicken Biryani");

        OrderItem orderItem=new OrderItem();
        orderItem.setBiryani(biryani);

        Delivery delivery=new Delivery();
        delivery.setDeliveryService(deliveryService);
        delivery.setOrderItem(orderItem);
        delivery.setKichenService(kicheanService);
        delivery.setDeliveryBoyName("ramana");

        System.out.println(delivery);
    }
}
