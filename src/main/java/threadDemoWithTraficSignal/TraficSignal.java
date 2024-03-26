package threadDemoWithTraficSignal;

import threadDemoWithPetrolStation.Vehicle;

public class TraficSignal {
    boolean  isRed = true;



    public synchronized void redLight(String vehicleNum){
        System.out.println("vehicle stop " + vehicleNum);

        while (!isRed){
        try {
            wait();
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
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("vehicle is moving " + vehicleNum);

    }
    public  void changeSignal(){
        if(Thread.currentThread().equals("east")){
            isRed= !isRed;
            notify();
        }else {
            isRed=isRed;
            System.out.println("signal is still red ");
        }
        if(Thread.currentThread().equals("west")) {
            isRed = !isRed;
            notify();
        } else {
            isRed=isRed;
            System.out.println("signal is still red ");
        }
    }
}
