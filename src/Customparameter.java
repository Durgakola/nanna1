public class Customparameter {

    public Student getStudent(Address address) {
        Student student = new Student();
        student.rollNo = 102;
        student.name = "Durga";
        student.email = "durga@gmail.com";
        student.branch = "CSC";
        student.contectno = 1234567890;
        student.address = address;

        return student;
    }

    public static void main(String[]args) {
        Customparameter C = new Customparameter();
        Address address = new Address();
        address.pincode = 544409;
        address.city = "Guntur";
        address.doornum = 00 - 00;
        address.village = "Taduvoy";

      //  Country country1 = new Country();
       // country1.name = "india";

        System.out.println(C.getStudent(address).name);
        System.out.println(C.getStudent(address).address.city);
    }
}



