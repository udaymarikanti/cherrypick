package polymorphasim;

public class RBIBankService {

    public  double calculateInterest(int principleAmount){
        int duration = 3;
        double interest =( principleAmount *0.25) *( 2.4 / 100);
        System.out.println("RBI intrest  :" +interest);
        return interest;

    }

}
