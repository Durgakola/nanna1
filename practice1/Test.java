package practice1;

    public class Test {

        public static void main(String[] args) {
            // double principal = 100000;

            SBI sbi = new SBI(100000,1);
            HDFC hdfc = new HDFC(150000,2);

            System.out.println("SBI Details:");
            sbi.displayDetails();

            System.out.println(" HDFC Details:");
            hdfc.displayDetails();
        }

}
