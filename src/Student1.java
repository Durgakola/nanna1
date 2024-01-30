public class Student1 {
    private String name;
    private int rollNo;

    public Student1(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public static void main(String[] args){
        Student1 s1=new Student1("naidu",104);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
}
