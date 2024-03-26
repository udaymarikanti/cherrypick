package trafficSignalSyncronizedMehod;

public class Test {
    public static void main(String[] args) {


        TrafficSignalWithDirection trafficDirection = new TrafficSignalWithDirection();

        for (int i = 0; i < 5; i++) {

            Thread vehicle1 = new Vehicle("green", trafficDirection);
            Thread vehicle2 = new Vehicle("green", trafficDirection);
            Thread vehicle3 = new Vehicle("green", trafficDirection);
            Thread vehicle4 = new Vehicle("green", trafficDirection);
            Thread vehicle5 = new Vehicle("green", trafficDirection);
            Thread vehicle6 = new Vehicle("green", trafficDirection);


            vehicle1.start();
            vehicle2.start();
            vehicle3.start();
            vehicle4.start();
            vehicle5.start();
            vehicle6.start();

            //  Simulating signal change after some time
            try {
                Thread.sleep(10000);
                trafficDirection.changeSignal();
                Thread.sleep(10000);
                trafficDirection.changeSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
