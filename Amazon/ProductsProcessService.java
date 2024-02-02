package Amazon;

public class ProductsProcessService {
    public int orderItems;
    public int kurthis=2000;
    public int totalPrice;
    public int getItems(Products products){
        if(orderItems<products.kurthis){
            orderItems=orderItems+products.kurthis;
            totalPrice=orderItems*kurthis;
            System.out.println("Total price:"+" "+totalPrice);
        }
        else{
            System.out.println("Add items");
        }
        return orderItems;
    }
}
