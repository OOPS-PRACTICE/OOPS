package OOPS.Constructor;

public class Car {

    public int mileage;
    public String model;
    public String ownerName;
    public boolean isAutomaticCar;

    public Car(int mileage1, String model1, String ownerName1, boolean isAutomaticCar1){
        mileage = mileage1;
        model = model1;
        ownerName = ownerName1;
        isAutomaticCar = isAutomaticCar1;
    }

    public Car(){

    }

    public int getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isAutomaticCar() {
        return isAutomaticCar;
    }
}
