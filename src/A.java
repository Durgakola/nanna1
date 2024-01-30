public class A {
    public Student getStudent() {

        Student student = new Student();
        student.rollNo = 101;
        student.name = "kanakadurga";
        student.email = "durga@gmail.com";
        student.branch = "ECE";
        student.contectno = 123456789;

        Address address = new Address();
        address.pincode = 522409;
        address.city = "atchampet";
        address.doornum = 00-00;
        address.village = "Taduvoy";

        student.address=address;

        Country country = new Country();
        country.name = "India";
        address.country=country;



        return student;
    }
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.getStudent().branch);
        System.out.println(a.getStudent().email);
        System.out.println(a.getStudent().name);
        System.out.println(a.getStudent().rollNo);
        System.out.println(a.getStudent().contectno);
        System.out.println(a.getStudent().address.pincode);
        System.out.println(a.getStudent().address.doornum);
        System.out.println(a.getStudent().address.city);
        System.out.println(a.getStudent().address.village);
        System.out.println(a.getStudent().address.country.name);




    }
}
