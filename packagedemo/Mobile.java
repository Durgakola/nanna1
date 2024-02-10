package packagedemo;

public class Mobile {
    protected String name;
    protected String model;
    protected double price;

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
