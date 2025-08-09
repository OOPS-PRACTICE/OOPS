package OOPS.SetterGetterMethod;

public class Car {


    public int mileage;
    public String model;
    public String ownerName;
    public boolean isAutomaticCar;

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

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAutomaticCar(boolean automaticCar) {
        isAutomaticCar = automaticCar;
    }
}
