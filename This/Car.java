package OOPS.This;

public class Car {

    public int mileage;
    public String model;
    public String ownerName;
    public boolean isAutomaticCar;

    public Car(int mileage, String model, String ownerName, boolean isAutomaticCar){
        this.mileage = mileage;
        this.model = model;
        this.ownerName = ownerName;
        this.isAutomaticCar = isAutomaticCar;
    }

    public Car(){

    }

    public int getMileage() {
        return this.mileage;
    }

    public String getModel() {
        return this.model;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public boolean isAutomaticCar() {
        return this.isAutomaticCar;
    }
}
