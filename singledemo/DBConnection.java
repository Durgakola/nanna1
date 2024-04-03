package singledemo;

public class DBConnection {

    private  static final  DBConnection dbConnection=new DBConnection();
    public int count=0;
    private DBConnection(){

        System.out.println("From Private Constructor");
    }

    public static DBConnection getInstance() {

        return dbConnection;
    }
}
