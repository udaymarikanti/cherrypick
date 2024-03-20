package threadDemoWithTraficSignal;

import threadDemoWithPetrolStation.Vehicle;

public class TraficSignal {
    boolean  isRed = true;


    public synchronized void redLight(String vehicleNum){
        System.out.println("vehicle stop " + vehicleNum);

        while (isRed){
        try {
            wait();
           // Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


            System.out.println("vehicle is moving " + vehicleNum);
        }
    }
    public synchronized void greanLight(String vehicleNum){
        System.out.println("Signal is green");

        while (!isRed){
            try {
                wait();
              //  Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }


        }
        System.out.println("vehicle is moving " + vehicleNum);

    }
    public synchronized void changeSignal(){
        isRed= !isRed;
       notifyAll();
        //notify();
    }
}
