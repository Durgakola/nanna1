package org.example.bydirection;

public class State {
    public String name;
    public String language;
    public Cuntry cuntry;

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", cuntry=" + cuntry +
                '}';
    }
}
