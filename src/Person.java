public class Person {
   public int getAdharno(){
       return Adharno;

    }
    private int Adharno;

    public Person(int Adharno){

        this.Adharno=Adharno;
    }

    public static void main(String[]args){
        Person s=new Person(100);
        Person ss=new Person(101);
        System.out.println(s.Adharno);
        System.out.println(ss.Adharno);
    }

}
