package staticDemo;

public class Test extends OnLineBanking{

    public static String onLineLogin(){
        System.out.println("from overload");
        return "login expert one argument";

    }
    public static void main(String[] args) {
        OnLineBanking onLineBanking = new OnLineBanking();

        System.out.println( onLineBanking.onLineLogin());

        NetBanking netBanking = new OnLineBanking();
        System.out.println( netBanking.onLineLogin());
        // if we done up casting then  super class methods  are execute  in static method




    }
}
