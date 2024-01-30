public class MathUtils {
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static void main(String[] args){
          int sum=MathUtils.add(5,6);
          int difference=MathUtils.subtract(5,9);

         System.out.println("Sum:"+sum);
         System.out.println("Difference:"+difference);
    }
}
