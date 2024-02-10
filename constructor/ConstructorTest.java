package constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Address addre=new Address();

        Student1 student1=new Student1("kanakadurga","dileep","12345678","24/2/2000",addre);
        System.out.println("joining student " +student1);

        Student1 examStudet=new Student1("kanakadurga","dileep","12345678","24/2/2000");
        System.out.println("examStudet "+examStudet);

    }
}
