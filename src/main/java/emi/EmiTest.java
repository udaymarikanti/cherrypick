package emi;

public class EmiTest {
    public static void main(String[] args) {
        MonthlyEMI monthlyEMI = new MonthlyEMI();
       double creadetedAmount  = monthlyEMI.processAmount(100000,12,5);
        System.out.println(creadetedAmount);
//        for(int i =1;i<100; i +9){
//            System.out.println(i);

    }
}
