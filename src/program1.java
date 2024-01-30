public class program1 {
    public static void main(String[] args) {
//        try {
//            int a = 40 / 0;
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of the code");
//    }


        try {
            int[] a = new int[5];
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("it is a arrayindexoutofBound");
    }

}
