package trafficSignalSyncronizedMehod;

public class TrafficSignalWithDirection {

    boolean  isRed = true;

    public synchronized void directionEast(String vehicleNum) {

        if (isRed){
            System.out.println("waithing for singal......" + vehicleNum);
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println("vechile is movieing east to west" + vehicleNum);
        }



    }
    public synchronized void directionWest(String vehicleNum) {
        if (isRed){
            System.out.println("waithing for singal......" + vehicleNum);
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println("vechile is movieing west to east " +vehicleNum);
        }


    }
    public synchronized void directionNorth(String vehicleNum)  {
        if (!isRed){
            System.out.println("vechile is north to south  " +vehicleNum);
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println("waithing for singal......" + vehicleNum);

        }


    }
    public synchronized void directionSouth(String vehicleNum) {
        if (!isRed){

            System.out.println("vechile is moveing south to narth " +vehicleNum);

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println("waithing for singal......" + vehicleNum);
        }

    }
//    public void  changeSignal() throws InterruptedException {
//        isRed=!isRed;
//        String signalColor;
//
//        if (isRed) {
//            signalColor = "red";
//        } else {
//            signalColor = "green";
//        }
//        notifyAll();
//
//    }

    public synchronized void changeSignal() throws InterruptedException {
        isRed = !isRed;
        String signalColor = isRed ? "red" : "green";
        System.out.println("Signal changed to " + signalColor);
        notifyAll();
    }

}
