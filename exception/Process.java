package exception;

public class Process extends Abstarct{
    public Process(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean playing() {
        String localname="sivani";
        String localPassword="12345";

        if(localname.equals(username) && localPassword.equals(password)){
            System.out.println("login successful");
        }else{
            System.out.println("login failed");
        }
        return false;
    }

    public static void main(String[] args) {
        Process process=new Process("sivani","12345");
        process.play();
        process.playing();
    }
}
