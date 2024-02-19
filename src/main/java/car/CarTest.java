package car;

public class CarTest {
    public static void main(String[] args) {


        Accessories accessories = new Accessories("allywheeels","TataCamera","leatherBelt");
        OldCarRemodiling oldCarRemodiling = new OldCarRemodiling("allywheeels","TataCamera","leatherBelt");
        oldCarRemodiling.newAccessories(accessories);

    }
}
