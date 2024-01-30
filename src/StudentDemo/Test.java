package StudentDemo;

public class Test {
    public static void main(String[] args) {
        StudentService studentService=new StudentService();
        StudentDetails studentDetails=new StudentDetails();
//        studentDetails.name="durga";
//        studentDetails.marks=50;

        String msg= studentService.validetStudent(studentDetails);
        System.out.println(msg);
    }
}
