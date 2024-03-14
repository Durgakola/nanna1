package exception;

public abstract class Abstarct {
    public String username;
    public String password;

    public Abstarct(String username, String password){
        this.username=username;
        this.password=password;
    }

    public void play(){

        System.out.println("students are playing");
    }

    public abstract boolean playing();
    }

