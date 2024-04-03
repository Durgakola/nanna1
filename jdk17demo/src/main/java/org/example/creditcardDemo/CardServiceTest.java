package org.example.creditcardDemo;

public class CardServiceTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.area = "kphb";
        address.steetNo = "6th";
        address.flatNo = "5-678";
        address.pincode = "522409";

        User user = new User();
        user.name = "durga";
        user.dob = "24/2/2000";
        user.mobileNo = "9096418141";
        user.adhar = "0989946824564";
        user.pan = "SBIN0007867";
        user.address = address;

        CreditCardService cardservice = new CreditCardService();
        System.out.println(cardservice.card(user));

    }
}
