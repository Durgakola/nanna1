package standardprograms;

public class ReverseNumber {
//    public static void main(String[] args) {
//        int number=12456;
//        int remainder;
//        int reverseNum=0;
//
//        while (number>0) {
//            remainder = number % 10;
//            number = number / 10;
//            reverseNum = (reverseNum * 10) + remainder;
//        }
//        System.out.println("Reverse number = "+reverseNum);
//    }

    public static void main(String []args){
        int number=5432;
        int remain;
        int reverse=0;

        while(number>0){
            remain=number%10;
            number=number/10;
            reverse=(reverse*10)+remain;
        }
        System.out.println("Reverse number " +reverse);
    }
}

