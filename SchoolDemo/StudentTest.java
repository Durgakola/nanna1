package SchoolDemo;

public class StudentTest {


    String getRollNo(Student student){
        System.out.println("getRollNo hashcode"+student.hashCode());
        return "";
    }
    public static void main(String[] args) {
        Student kiranStudent=new Student();
        kiranStudent.name="kiran";
        kiranStudent.fatherName="Dhinesh";
        kiranStudent.mobileNo="123456789";
        kiranStudent.dateOfBirth="01/01/1998";

        Student sivaStudent=new Student();
        sivaStudent.name="siva";
        sivaStudent.fatherName="sarath";
        sivaStudent.mobileNo="123456784";
        sivaStudent.dateOfBirth="01/01/1997";

        StudentTest studentTest=new StudentTest();

        studentTest.getRollNo(kiranStudent);
        System.out.println("kiranStudent hashcode"+kiranStudent.hashCode());

        studentTest.getRollNo(sivaStudent);
        System.out.println("sivaStudent hashcode"+sivaStudent.hashCode());

    }
}
