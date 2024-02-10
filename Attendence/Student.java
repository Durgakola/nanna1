package Attendence;

public class Student {
    public String name;
    public String fatherName;
    public String mobileNo;
    public String dateOfBirth;
    public String schoolName;
    public Days days;
    public String result;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", days=" + days +
                ", result='" + result + '\'' +
                '}';
    }
}
