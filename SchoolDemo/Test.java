package SchoolDemo;

public class Test {

    public Student getSchoolname(Student student) {

        student.schoolName="ABC";
        return student;
    }
    public Student getSchoolnameDeepClone(Student student){
        Student clonedStudent=new Student();
        clonedStudent.name=student.name;
        clonedStudent.fatherName=student.fatherName;
        clonedStudent.mobileNo=student.mobileNo;
        clonedStudent.dateOfBirth=student.dateOfBirth;
        clonedStudent.schoolName=student.schoolName;
        return clonedStudent;
    }


    public Student getStudentAddress(Student student){
        Student localStudent=new Student();
        localStudent.name=student.name;
        localStudent.fatherName=student.fatherName;
        localStudent.dateOfBirth=student.dateOfBirth;
        localStudent.schoolName=student.schoolName;
        localStudent.mobileNo=student.mobileNo;

        Address loaclAddress=new Address();
        loaclAddress.city="Guntur";
        loaclAddress.village="taduvai";
        loaclAddress.pincode=522409;
        loaclAddress.colony="cousalya colony";
        loaclAddress.doorNo=204;

        localStudent.address=loaclAddress;

        return localStudent;
    }

    public static void main(String[] args) {
        Test test=new Test();
        Student student=new Student();
        student.name="kiran";
        student.fatherName="Dhinesh";
        student.mobileNo="123456789";
        student.dateOfBirth="01/01/1998";

//        1st method
        Student studentLatest=test.getSchoolname(student);
        System.out.println("studentLatest schoolname : "+studentLatest.hashCode());

//        2nd method
        Student prasent=test.getSchoolnameDeepClone(student);
        System.out.println("prasent schoolname : "+prasent.hashCode());

//        3rd method
       Student stuaddress= test.getStudentAddress(student);
        System.out.println("address : "+stuaddress.hashCode());
//        System.out.println(stuaddress.address.city);
        System.out.println(stuaddress.address.toString());

//
    }
}
