package standardprograms;

public class Student {
    private  String name;

    private  String fatherName;

    private  int id;

    private double phNo;


    public String getName(){
        return name;
    }
    public String getFatherName(){
        return fatherName;

    }
    public int getId(){
        return id;
    }
    public double getPhNo() {
        return phNo;

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFatherName(String fatherName){
        this.fatherName = fatherName;
    }
    public void setId(int id){
        this.id= id;
    }
    public void setPhNo(double phNo){
        this.phNo = phNo;
    }
    public static void main(String[] args){

        Student student = new Student();

        student.setName("durga");
        student.setFatherName("dileep");
        student.setId(212);
        student.setPhNo(123456678);

        System.out.println("name ="+student.getName());
        System.out.println("FatherName :"+student.getFatherName());
        System.out.println("id = "+student.getId());
        System.out.println("phoneNum ="+student.getPhNo());
    }
}
