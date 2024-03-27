package trafficSignalSyncronizedMehod;



public class Vehicle extends Thread{

    String vehileDirection;
    TrafficSignalWithDirection traficDirection;

    public Vehicle(String vehileDirection,TrafficSignalWithDirection traficDirection){
        this.vehileDirection = vehileDirection;
        this.traficDirection = traficDirection;

    }

    public void run()  {
        if (vehileDirection.equals("North")) {
            traficDirection.directionNorth(Thread.currentThread().getName());
        }else if (vehileDirection.equals("South")) {
            traficDirection.directionSouth(Thread.currentThread().getName());
        }else if (vehileDirection.equals("East")){
            traficDirection.directionEast(Thread.currentThread().getName());
        } else if (vehileDirection.equals("West")){
            traficDirection.directionWest(Thread.currentThread().getName());
        }
    }


}
