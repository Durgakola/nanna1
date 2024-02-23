package Inheritance;


public class InheritanceTest {
    public static void main(String[] args) {
        RetailAccount Account= (RetailAccount)new Account("12345",2000,true);

        Account retailAccount=new RetailAccount("12345",2000,true,100,20);
    }
}
