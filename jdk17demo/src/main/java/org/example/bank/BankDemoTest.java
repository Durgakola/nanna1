package org.example.bank;

import java.util.Date;

public class BankDemoTest {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.accountNumber=123456;
        acc.balance=2000;
        acc.ifscCode="SBIN0003456";
        acc.password="1234";
        acc.username="User143";


        Card car=new Card();
        car.account=acc;
        car.cardnumber="1234 5467 4567";
        car.cvv="111";
        car.expiry=new Date();


        ATMmechine atm=new ATMmechine();
        atm.atmId="888888";
        atm.balance=4000;
        atm.location="Kukattpally";


        Transetion transetion=new Transetion();
        transetion.atMmechine=atm;
        transetion.card=car;
        transetion.withdrawamount=2000;
        transetion.transactionId="1111111111";



    }
}
