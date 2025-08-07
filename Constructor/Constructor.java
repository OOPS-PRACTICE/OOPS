package Constructor;

public class Constructor {

    public static void main(String[] args){
        Car car1 = new Car();
        car1.isAutomaticCar = false;
        car1.mileage = 100;

        Car car2 = new Car();
        car2.isAutomaticCar = true;
        car1.mileage = 150;
        //car1.ownerName("Owner Name");
        /*System.out.println(car.isAutomaticCar);
        System.out.println(car.model);
        System.out.println(car.NATIONALITY);
        System.out.println(car.mileage);*/
    }
}

