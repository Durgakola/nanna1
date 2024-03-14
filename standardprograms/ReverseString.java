package standardprograms;

public class ReverseString {
    public static void main(String[] args) {
        String str="kanakadurga";
        String result=" ";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            result=ch+result;
        }
        System.out.println("Reverse String = "+result);

    }
}
