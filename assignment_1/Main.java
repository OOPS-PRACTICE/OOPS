
public class Main {

    public static void main(String[] args){

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.setYear(2012);
        car1.setElectric(false);

        Car car2 = new Car(2023, "Model S","Tesla",true);
        Car car3 = new Car("Mustang","Ford");


        car1.start();
        car1.accelerate(10);
        car1.accelerate(20.5f);
        car1.stop();

        //car2.displayInfo();
        car2.start();
        //car2.demonstrateOperators();
        car2.stop();

        //car3.displayInfo();
        car3.start();
        car3.stop();


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car1;
        vehicles[1] = car2;
        vehicles[2] = car3;

        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getYear());
        }

        System.out.println(Vehicle.carCount);
    }
}
