package threadDemoWithPetrolStation;

public class PetrolStation {
        public  synchronized void petrol(String VehicleNum,int numberOfLiters){
            for (int i =0;i<=numberOfLiters;i++){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e.getMessage());
//                }
                System.out.println("vechile number : " +VehicleNum +" filled  petrol with liters ==  " + i);
            }

        }
        public synchronized void  diesel(String VehicleNum,int numberOfLiters){
            for (int i =0;i<=numberOfLiters;i++){
                System.out.println("vechile number : " + VehicleNum +" filled  diesel with liters ==  " + i);
            }

        }
}
