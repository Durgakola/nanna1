package org.example.restarent;

public class User {
    public String name;
    public String email;
    public String mobileNumber;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address=" + address +
                '}';
    }

    public Address address;
}
