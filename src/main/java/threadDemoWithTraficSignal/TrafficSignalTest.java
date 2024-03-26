package threadDemoWithTraficSignal;



public class TrafficSignalTest {
    public static void main(String[] args) {

        TraficSignal traficSignal = new TraficSignal();


        Thread vehicle1 = new Vehicle("red",traficSignal);
        Thread vehicle2= new Vehicle("green",traficSignal);
        Thread vehicle3= new Vehicle("red",traficSignal);
        Thread vehicle4= new Vehicle("green",traficSignal);
        Thread vehicle5= new Vehicle("red",traficSignal);
        Thread vehicle6= new Vehicle("green",traficSignal);


        vehicle1.setName("west");
        vehicle3.setName("west");
        vehicle5.setName("west");

        vehicle2.setName("east");
        vehicle4.setName("east");
        vehicle6.setName("east");



        vehicle1.start();
        vehicle2.start();
        vehicle3.start();
        vehicle4.start();
        vehicle5.start();
        vehicle6.start();

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
