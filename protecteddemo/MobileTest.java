package protecteddemo;


import packagedemo.Mobile;

public class MobileTest extends Mobile{
    public static void main(String[] args) {
        MobileTest mobileTest=new MobileTest();
        mobileTest.name="vivo";
        mobileTest.model="Y15";
        mobileTest.price=14000;
        System.out.println(mobileTest.toString());
    }
}
