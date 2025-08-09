package OOPS.Constructor;

public class Constructor {

    public static void main(String[] args){
        
        Car car1 = new Car(15, "Amaze", "ownerName1", false);
        System.out.println(car1.getMileage());
        System.out.println(car1.getModel());
        System.out.println(car1.getOwnerName());
        System.out.println(car1.isAutomaticCar);

        Car car2 = new Car(12, "Mercedes", "ownerName2", true);
        System.out.println(car2.getMileage());
        System.out.println(car2.getModel());
        System.out.println(car2.getOwnerName());
        System.out.println(car2.isAutomaticCar);
    }
}

