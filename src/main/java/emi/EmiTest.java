package emi;

public class EmiTest {
    public static void main(String[] args) {
        MonthlyEMI monthlyEMI = new MonthlyEMI();
       double creadetedAmount  = monthlyEMI.processAmount(100000,12,5);
        System.out.println(creadetedAmount);
    }
}
