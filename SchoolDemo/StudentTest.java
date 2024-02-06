package SchoolDemo;

public class StudentTest {

    public Student getSchoolname(Student student) {
        System.out.println("getschoolname hashCode"+student.hashCode());

        student.schoolName="k.g.b.v school";
        return student;
    }

   public String getRollNo(Student student){
        System.out.println("getRollNo hashcode"+student.hashCode());
        return " ";
    }
    public static void main(String[] args) {
        StudentTest studentTest=new StudentTest();

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



        studentTest.getRollNo(kiranStudent);
        System.out.println("kiranStudent hashcode"+kiranStudent.hashCode());
        studentTest.getRollNo(sivaStudent);
        System.out.println("sivaStudent hashcode"+sivaStudent.hashCode());

        System.out.println("_____________________________________________________");

        studentTest.getSchoolname(kiranStudent);
        System.out.println("kiranStudent hashcode"+kiranStudent.hashCode());
        studentTest.getSchoolname(sivaStudent);
        System.out.println("sivaStudent hashcode"+sivaStudent.hashCode());



    }
}
