package practice;

public class Student {

    public String name;
    public int rollNo;
    public String email;
    public String branch;

    public Student(String name, int rollNo, String email, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.branch = branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", email='" + email + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}