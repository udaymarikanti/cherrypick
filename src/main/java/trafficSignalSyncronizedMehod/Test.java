package trafficSignalSyncronizedMehod;

public class Test {
    public static void main(String[] args) {


        TrafficSignalWithDirection trafficDirection = new TrafficSignalWithDirection();

      //  for (int i = 0; i < 5; i++) {

            Thread vehicle1 = new Vehicle("South", trafficDirection);
            vehicle1.setName("car");
            Thread vehicle2 = new Vehicle("North", trafficDirection);
        vehicle2.setName("bike");
            Thread vehicle3 = new Vehicle("East", trafficDirection);
        vehicle3.setName("auto");
            Thread vehicle4 = new Vehicle("West", trafficDirection);
        vehicle4.setName("truck");
//            Thread vehicle5 = new Vehicle("South", trafficDirection);
//        vehicle5.setName("South");
//            Thread vehicle6 = new Vehicle("North", trafficDirection);
//        vehicle6.setName("North");


            vehicle1.start();
            vehicle2.start();
            vehicle3.start();
            vehicle4.start();
//            vehicle5.start();
//            vehicle6.start();

            //  Simulating signal change after some time
            try {
                trafficDirection.changeSignal();
                Thread.sleep(10000);
                trafficDirection.changeSignal();
                Thread.sleep(10000);
                trafficDirection.changeSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 //   }

}
