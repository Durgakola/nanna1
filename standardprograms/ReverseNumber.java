package standardprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=1234;
        int remainder;
        int reverseNum=0;

        while (number>0){
            remainder = number % 10;
            number= number / 10;
            reverseNum =( reverseNum*10) + remainder;
        }
        System.out.println("Reverse number = "+reverseNum);
    }
}
