package org.example.bydirection;

public class Cuntry {
    public String name;
    public String language;
    public int phonenumCode;

    public State state;

    @Override
    public String toString() {
        return "Cuntry{" +
                "name='" + name + '\'' +
                ", phonenumCode=" + phonenumCode +
                '}';
    }
}
