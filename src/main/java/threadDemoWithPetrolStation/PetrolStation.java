package threadDemoWithPetrolStation;

public class PetrolStation {

    Object petrol = new Object();
    Object diesel = new Object();
        public  synchronized void petrol(String VehicleNum,int numberOfLiters){
            for (int i =0;i<=numberOfLiters;i++){

                System.out.println("vechile number : " +VehicleNum +" filled  petrol with liters ==  " + i);
            }

        }
        public synchronized void  diesel(String VehicleNum,int numberOfLiters){
            for (int i =0;i<=numberOfLiters;i++){
                System.out.println("vechile number : " + VehicleNum +" filled  diesel with liters ==  " + i);
            }

        }
    public  void  dieselsynchronizedblock(String VehicleNum,int numberOfLiters){
        System.out.println("from dieselsynchronizedblock vechile number : " + VehicleNum );
            synchronized (diesel) {

                for (int i = 0; i <= numberOfLiters; i++) {
                    System.out.println("vechile number : " + VehicleNum + " filled  diesel with liters ==  " + i);
                }
            }

    }
    public  void  petrollsynchronizedblock(String VehicleNum,int numberOfLiters){
        System.out.println("from petrollsynchronizedblock vechile number : " + VehicleNum );
        synchronized (petrol) {

            for (int i = 0; i <= numberOfLiters; i++) {
                System.out.println("vechile number : " + VehicleNum + " filled  petrol with liters ==  " + i);
            }
        }

    }

}
