package standardprograms;

public class Palindrome {
        public static void main(String[] args) {
            int n = 202;
            int temp = n;
            int rem;
            int rev = 0;

            while(n>0)
            {
                rem = n % 10;
                rev = rev*10+rem;
                n = n / 10;
            }
            if (rev == temp) {
                System.out.println("given num is palindrom");
            } else {
                System.out.println("not a palindrom");
            }
        }
}
