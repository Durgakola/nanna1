package packagedemo;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name="unkown";
        this.age=0;
    }
    public Person(String name){
        this.name=name;
        this.age=0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void greeting(){
        System.out.println("Hello, my name is : "+name);
    }
    public void greeting(String name){
        System.out.println("my name is : "+name+ ".");
    }
    public void greeting(String greeting,String Custommessage){
        System.out.println(greeting+","+Custommessage+ ". my name is : "+name+".");
    }

    public static void main(String[] args) {
        Person person=new Person();
        Person person1=new Person("rama");
        Person person2=new Person("durga",23);
        person.greeting();
        person1.greeting();
        person2.greeting();
        person1.setName("vinay");
        person1.setAge(25);
        System.out.println("name : "+person1.getName()+" Age : "+person1.getAge());




    }
}
