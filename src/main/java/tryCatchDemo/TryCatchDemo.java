package tryCatchDemo;

public class TryCatchDemo {

    public static void main(String[] args) {
        String name = null;
        String companay = "neoteric";
        System.out.println(name);
        System.out.println(companay);
        try {
            System.out.println(name.toUpperCase());

        } catch (Exception e) {

            System.out.println( " exception occure in " + e.getMessage());
        }finally {
            System.out.println(" it execite from fillany block ");
        }
        System.out.println(companay.toUpperCase());

    }

}
