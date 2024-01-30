public class A1 {
    public Address getAddress(){
        Address address = new Address();
        address.pincode = 522409;
        address.city = "atchampet";
        address.doornum = 00-00;
        address.village = "Taduvoy";
        return address;


    }
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println(a.getAddress().pincode);
        System.out.println(a.getAddress().city);
        System.out.println(a.getAddress().doornum);
        System.out.println(a.getAddress().village);

    }


}



