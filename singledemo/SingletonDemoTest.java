package singledemo;

public class SingletonDemoTest {
    public static void main(String[] args) {

        DBConnection dbConnection=DBConnection.getInstance();
        System.out.println(dbConnection.count);
        dbConnection.count=20;
        System.out.println(dbConnection.count);

        DBConnection dbConnection1=DBConnection.getInstance();
        System.out.println(dbConnection1.count);
        dbConnection1.count=50;
        System.out.println(dbConnection1.count);

        DBConnection dbConnection2=DBConnection.getInstance();
        System.out.println(dbConnection2.count);
        dbConnection2.count=70;
        System.out.println(dbConnection2.count);


        System.out.println(dbConnection.hashCode());

        System.out.println(dbConnection1.hashCode());

        System.out.println(dbConnection2.hashCode());

    }
}
