public class Address1 {
    private int pin;
    private String city;
    private String village;
    private int doorno;
    private long contactno;

    @Override
    public String toString() {
        return "Address1{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                ", village='" + village + '\'' +
                ", doorno=" + doorno +
                ", contactno=" + contactno +
                '}';
    }

    public static void main(String[] args) {
        Address1 a1 = new Address1();
        a1.pin = 522409;
        a1.city = "kphb";
        a1.village = "hydarbad";
        a1.doorno = 00 - 00;
        a1.contactno = 1234567890;

     System.out.println(a1.toString());
    }
}





