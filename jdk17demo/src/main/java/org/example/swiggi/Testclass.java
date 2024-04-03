package org.example.swiggi;

public class Testclass {
    public static void main(String[] args) {
        Address ad=new Address();
        ad.area="hitech-city";
        ad.flatNo="408";
        ad.streetName="kphb 5th phase";
        ad.pincode="522409";
        ad.houseName="SVR";


        Products prod=new Products();
        prod.productName="Biryani";
        prod.productPrice=300.20;


        OrderItem ordItem=new OrderItem();
        ordItem.price=401;
        ordItem.quntity=2;
        ordItem.products=prod;


        Order order=new Order();
        order.orderId="123456789";
        order.orderItem=ordItem;
        order.address=ad;

        System.out.println(order.orderItem.products.productName);
        System.out.println(order);

    }
}
