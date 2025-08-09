package OOPS.SetterGetterMethod;

public class CarConstructor {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMileage(15);
        car1.setAutomaticCar(false);
        car1.setModel("Amaze");
        car1.setOwnerName("ownerName1");
        System.out.println(car1.getMileage());
        System.out.println(car1.getModel());
        System.out.println(car1.getOwnerName());
        System.out.println(car1.isAutomaticCar);

        Car car2 = new Car();
        car2.setMileage(12);
        car2.setAutomaticCar(true);
        car2.setModel("Mercedes");
        car2.setOwnerName("ownerName2");
        System.out.println(car2.getMileage());
        System.out.println(car2.getModel());
        System.out.println(car2.getOwnerName());
        System.out.println(car2.isAutomaticCar);

    }
}
