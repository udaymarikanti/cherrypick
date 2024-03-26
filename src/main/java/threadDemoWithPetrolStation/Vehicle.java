package threadDemoWithPetrolStation;

public class Vehicle extends Thread{

    int liters;
    String status;
    String type;

    PetrolStation petrolStation;
    public Vehicle(int liters,String status,String type,PetrolStation petrolStation){
        this.liters = liters;
        this.status = status;
        this.type = type;
        this.petrolStation = petrolStation;
    }
    public void run(){
        if(type.equals("petrol")){
            System.out.println("vechile number " + Thread.currentThread().getName());
            petrolStation.petrol(Thread.currentThread().getName(), this.liters);
        }else {
            petrolStation.diesel(Thread.currentThread().getName(), this.liters);
        }
    }
//    public void run(){
//        if(type.equals("petrol")){
//            System.out.println("vechile number " + Thread.currentThread().getName());
//            petrolStation.petrollsynchronizedblock(Thread.currentThread().getName(), this.liters);
//        }else {
//            petrolStation.dieselsynchronizedblock(Thread.currentThread().getName(), this.liters);
//        }
//    }
}
