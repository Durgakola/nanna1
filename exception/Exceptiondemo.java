package exception;

public class Exceptiondemo {
    public static void main(String[] args) {

        String name = null;
        String company = "Neoteric";

        System.out.println(name);
        System.out.println(company);

        try {
            System.out.println(name.toUpperCase());
        } catch(Exception e) {

            System.out.println("Exception occured " + e.getMessage());
//            throw  new RuntimeException();
        }finally {
            System.out.println("from finally block");
        }
        System.out.println(company.toUpperCase());
    }
}
