package singletonDemo;

public class DBConnection {
    private static  final DBConnection dbconnection = new DBConnection();

    public  int count = 0;

    private  DBConnection(){
        System.out.println(" From private constructor ");
    }

    public  static DBConnection getDbconnection(){
         return dbconnection;
    }

}
