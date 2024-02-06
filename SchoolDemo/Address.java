package SchoolDemo;

public class Address {
    public String village;
    public int doorNo;
    public int pincode;
    public String city;
    public String colony;

    @Override
    public String toString() {
        return "Address{" +
                "village='" + village + '\'' +
                ", doorNo=" + doorNo +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", colony='" + colony + '\'' +
                '}';
    }
}
