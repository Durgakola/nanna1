public class B {
    public int getAge(int year){
        int cureentyear=2023;

        return cureentyear-year;
    }
    public static void main(String[]args){
        B b = new B();
        b.getAge(2000);
        System.out.println(b.getAge(2000));

    }
}
