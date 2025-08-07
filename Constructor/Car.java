package OOPS.Constructor;

public class Car {

    static int count = 0;
    public int mileage;
    public String model;
    public String ownerName;
    public String number;
    public boolean isAutomaticCar;

    public String NATIONALITY = "INDIAN";

    public Car(int mileage, String model, String ownerName, String number, boolean isAutomaticCar){
        count++;
        System.out.println("I am in constructor " + count);

    }

    public Car(){

    }

}
