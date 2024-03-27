package trafficSignalSyncronizedMehod;

public class TrafficSignalWithDirection {

    boolean isRed = true;
    boolean northAllowed = false;
    boolean southAllowed = false;
    boolean eastAllowed = false;
    boolean westAllowed = false;

    public synchronized void directionEast(String vehicleNum) {

        if (!isRed && eastAllowed) {



            System.out.println("vechile is movieing east to west " + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("waithing for singal...... at East " + Thread.currentThread().getName());
        }


    }

    public synchronized void directionWest(String vehicleNum) {
        if (!isRed && westAllowed) {

            System.out.println("vechile is movieing west to east " + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("waithing for singal...... at west" + Thread.currentThread().getName());
        }


    }

    public synchronized void directionNorth(String vehicleNum) {
        if (!isRed && northAllowed) {


            System.out.println("vechile is north to south  " + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("waithing for singal......at north " + Thread.currentThread().getName());
        }


    }

    public synchronized void directionSouth(String vehicleNum) {
        if (!isRed && southAllowed) {

            System.out.println("vechile is moveing south to narth " + Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("waithing for singal......at south " + Thread.currentThread().getName());
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
//    }}


    public synchronized void changeSignal() throws InterruptedException {
        isRed = !isRed;
        if (isRed) {
            northAllowed = true;
            southAllowed = true;
            eastAllowed = false;
            westAllowed = false;
//
//            directionEast(Thread.currentThread().getName());
//            directionWest(Thread.currentThread().getName());
//            directionNorth(Thread.currentThread().getName());
//            directionSouth(Thread.currentThread().getName());
        } else {
            northAllowed = false;
            southAllowed = false;
            eastAllowed = true;
            westAllowed = true;
//            directionEast(Thread.currentThread().getName());
//            directionWest(Thread.currentThread().getName());
//            directionNorth(Thread.currentThread().getName());
//            directionSouth(Thread.currentThread().getName());
        }
        String signalColor = isRed ? "red" : "green";
        System.out.println("Signal changed to " + signalColor);
        notifyAll();

    }

}
