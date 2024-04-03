package org.example.restarent;

public class TestDemo {
    public static void main(String[] args) {

        Address add=new Address();
        add.houseNo="ABC";
        add.area="Hitech-city";
        add.flatNo="408";
        add.pincode="522409";
        add.street="kphb 6th phase";


        User user=new User();
        user.name="durga";
        user.email="ram@gamil.com";
        user.mobileNumber="1234567890";
        user.address=add;

        Restarent restarent=new Restarent();
        restarent.name="pista house";
        restarent.address=add;

        System.out.println("user address "+user.address.pincode);
        System.out.println("Restarent address "+restarent.address.pincode);

        //object1

        Address add1=new Address();
        add1.houseNo="ABCdex";
        add1.area="miyapur";
        add1.flatNo="409";
        add1.pincode="522409";
        add1.street="kphb 6th phase";


        User user1=new User();
        user1.name="ramya";
        user1.email="ramya@gamil.com";
        user1.mobileNumber="1234567890";
        user1.address=add1;

        Restarent restarent1=new Restarent();
        restarent1.name="mehile";
        restarent1.address=add1;


        System.out.println(restarent1.name);







    }
}
