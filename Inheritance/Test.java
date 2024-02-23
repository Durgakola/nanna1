package Inheritance;

public class Test {
    public static void main(String[] args) {
        Super s=new Super();
        s.play();

        Super ss=new Sub();
        ss.play();

        Sub sss=new Sub();
        sss.child();

    }
}
