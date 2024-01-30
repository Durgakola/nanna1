package practice;

public class Test {
    public Student getStudent(){
        Student s=new Student("durga",101,"durga@gmail.com","ECE");
        return s;
    }

    public static void main(String[] args) {
        Test test=new Test();
       System.out.println(test.getStudent().toString());
    }
}
