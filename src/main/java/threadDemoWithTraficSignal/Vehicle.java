package threadDemoWithTraficSignal;

public class Vehicle extends Thread{

    String signalStatus;
    TraficSignal traficSignal;

    public Vehicle(String signalStatus,TraficSignal traficSignal){
        this.signalStatus = signalStatus;
        this.traficSignal = traficSignal;

    }

    public void run(){
            if (signalStatus.equals("red")) {
                traficSignal.redLight(Thread.currentThread().getName());
            }else if(signalStatus.equals("green")){
                    traficSignal.greanLight(Thread.currentThread().getName());
                }
            }

}
