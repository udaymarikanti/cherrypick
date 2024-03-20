package threadDemoWithTraficSignal;



public class TrafficSignalTest {
    public static void main(String[] args) {
        TraficSignal traficSignal = new TraficSignal();
        Thread vehicle = new Vehicle("red",traficSignal);
        Thread vehicle1 = new Vehicle("red",traficSignal);
        Thread vehicle2= new Vehicle("red",traficSignal);
        vehicle.start();
        vehicle1.start();
        vehicle2.start();
       //  Simulating signal change after some time
        try {
            Thread.sleep(10000);
            traficSignal.changeSignal();
            Thread.sleep(10000);
            traficSignal.changeSignal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
