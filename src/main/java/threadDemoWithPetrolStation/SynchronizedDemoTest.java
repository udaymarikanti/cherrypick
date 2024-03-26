package threadDemoWithPetrolStation;

public class SynchronizedDemoTest {
    public static void main(String[] args) {

        PetrolStation petrolStation = new PetrolStation();

        Thread ts03en4941 = new Vehicle(3,"Emity", "petrol",petrolStation);
        ts03en4941.setName("ts03en4941");
        Thread ap248199 = new Vehicle(5,"Emity", "petrol",petrolStation);
        ap248199.setName("ap248199");
        Thread ap074301 = new Vehicle(4,"Emity", "petrol",petrolStation);
        ap074301.setName("ap074301");



        Thread ap12345 = new Vehicle(5,"Emity", "diesel",petrolStation);
        ap12345.setName("ap12345");
        Thread tg1122 = new Vehicle(4,"Emity", "diesel",petrolStation);
        tg1122.setName("tg1122");


        ts03en4941.start();
        ap248199.start();
        ap074301.start();
        ap12345.start();
        tg1122.start();



    }
}
