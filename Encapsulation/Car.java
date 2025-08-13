package org.Encapsulation;

public class Car {


    private int mileage;
    private String model;
    private String ownerName;
    private boolean isAutomaticCar;
    private int ownerAge;

    public Car(){

    }

    public Car(int mileage, String model, String ownerName, boolean isAutomaticCar, int ownerAge) {
        this.mileage = mileage;
        this.model = model;
        this.ownerName = ownerName;
        this.isAutomaticCar = isAutomaticCar;
        this.ownerAge = ownerAge;
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

    public void setOwnerAge(int ownerAge) {
        if(ownerAge > 18){
            this.ownerAge = ownerAge;
        }

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
