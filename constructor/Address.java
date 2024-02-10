package constructor;

public class Address {
    public String city;
    public String state;
    public String country;
    public int pincode;

    public Address(){
        city="hyd";
        state="telangana";
        country="india";
        pincode=522409;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
