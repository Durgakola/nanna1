package org.example.restarent;

public class Address {
    public String houseNo;
    public String area;
    public String street;
    public String pincode;
    public String flatNo;

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                ", flatNo='" + flatNo + '\'' +
                '}';
    }
}
