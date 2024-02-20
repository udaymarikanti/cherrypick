package car;

public class UpgradeCar extends Accessories{
    public UpgradeCar(String wheels, String backCamera, String seatCovers) {
        super(wheels, backCamera, seatCovers);
    }

    public  Accessories newAccessories(Accessories accessories){
        System.out.println(" new car : "+accessories.wheels+"  "+accessories.backCamera+"  "+accessories.seatCovers);
        return accessories;
    }
}
