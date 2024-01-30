public class Constructor {

    public Constructor(Student s1,Address a1){

        System.out.println("from constructor");
    }

    public static void main(String[]args){

        Student ss=new Student();
        Address aa=new Address();
        Constructor cc=new Constructor(ss,aa);
    }
}

