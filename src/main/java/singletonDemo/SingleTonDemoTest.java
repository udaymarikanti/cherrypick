package singletonDemo;

public class SingleTonDemoTest {
    public static void main(String[] args) {

      DBConnection dbConnection =  DBConnection.getDbconnection();
        System.out.println(dbConnection.count);
        dbConnection.count = 20;
        System.out.println(dbConnection.count);

        DBConnection dbConnection1 =  DBConnection.getDbconnection();
        System.out.println(dbConnection1.count);
        dbConnection1.count = 50;
        System.out.println(dbConnection1.count);

        DBConnection dbConnection2 =  DBConnection.getDbconnection();
        System.out.println(dbConnection2.count);
        dbConnection2.count = 70;
        System.out.println(dbConnection2.count);

    }
}
