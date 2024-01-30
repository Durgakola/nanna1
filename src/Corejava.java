public class Corejava {

    public Student getStudent(Address a1,Country c1) {


        Student kd = new Student();
        kd.rollNo = 105;
        kd.name = "dileep";
        kd.email = "dileep@gamil.com";
        kd.branch = "ece";

        kd.address = a1;
        kd.address.country = c1;
        return kd;
    }
    public static void main(String[]args) {
        Corejava java = new Corejava();
        Address add = new Address();
        add.city = "vizag";
        add.village = "ameerpet";
        add.doornum = 00 - 00;
        add.pincode = 500305;

        Country count = new Country();
        count.name = "Japan";

        System.out.println(java.getStudent(add,count).address.city);
        System.out.println(java.getStudent(add,count).address.country.name);


    }

    }