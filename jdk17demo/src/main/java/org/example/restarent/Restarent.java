package org.example.restarent;

public class Restarent {
    public String name;

    public Address address;

    @Override
    public String toString() {
        return "Restarent{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
