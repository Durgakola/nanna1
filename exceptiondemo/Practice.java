package exceptiondemo;


public class Practice {
    public String name;

    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
//            array[5] = 30 / 0;
            int a = 40 / 0;
        } catch (ArithmeticException e) {
            System.out.println("from ArthemeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("from ArrayIndexOutOfBoundException");
        } catch (Exception e) {
            System.out.println("from Exception");
        }
    }
}

