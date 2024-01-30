package StudentDemo;

public class StudentService {
    public String validetStudent(StudentDetails studentDetails){
        String name="naidu";
        int marks=30;

        if(studentDetails.marks>35){
            return "Student pass";
        }
        else{
            return "Student fail";
        }
    }
}
