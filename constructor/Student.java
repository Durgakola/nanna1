package constructor;

public class Student {
    int id;
    String name;
    String email;
    public Student(){

    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Student(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public void display(){
        System.out.println(id+ " "+name+" "+email);
    }

    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student(101,"durga");
        Student s2=new Student(102,"sravya","sravya@gmail.com");
        s.display();
        s1.display();
        s2.display();
    }
}
