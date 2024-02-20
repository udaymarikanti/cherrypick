package emi;

public class EmiTest {
    public static void main(String[] args) {
        MonthlyEMI monthlyEMI = new MonthlyEMI();
       double creadetedAmount  = monthlyEMI.processAmount(10000,2,12);
        System.out.println(creadetedAmount);
    }
}
