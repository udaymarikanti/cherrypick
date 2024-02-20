package car;

public class CarRemodiling extends UpgradeCar {
    public CarRemodiling(String wheels, String backCamera, String seatCovers) {
        super(wheels, backCamera, seatCovers);
    }

    public  Accessories newAccessories(Accessories accessories){
        System.out.println(" old car remodeloing  : ");
        return super.newAccessories(accessories);
    }
}
