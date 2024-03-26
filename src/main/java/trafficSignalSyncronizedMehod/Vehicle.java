package trafficSignalSyncronizedMehod;



public class Vehicle extends Thread{

    String signalStatus;
    TrafficSignalWithDirection traficDirection;

    public Vehicle(String signalStatus,TrafficSignalWithDirection traficDirection){
        this.signalStatus = signalStatus;
        this.traficDirection = traficDirection;

    }

    public void run()  {
        if (signalStatus.equals("red")) {
                traficDirection.directionNorth(Thread.currentThread().getName());
                traficDirection.directionSouth(Thread.currentThread().getName());


            //traficDirection.(Thread.currentThread().getName());
        }else
        {
                traficDirection.directionEast(Thread.currentThread().getName());
                traficDirection.directionWest(Thread.currentThread().getName());

        }
    }


}
