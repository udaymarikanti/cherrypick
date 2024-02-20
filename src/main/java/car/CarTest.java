package car;

public class CarTest {
    public static void main(String[] args) {


        Accessories accessories = new Accessories("allywheeels","TataCamera","leatherBelt");
        CarRemodiling oldCarRemodiling = new CarRemodiling("allywheeels","TataCamera","leatherBelt");
        oldCarRemodiling.newAccessories(accessories);

    }
}
