
public abstract class Vehicle {

    private int year;
    String model;
    protected String brand;
    public static int carCount;

    static {
        carCount = 0;
        System.out.println("I am in Vehicle class static block");
    }

    {
      carCount++;
      System.out.println("I am in Object initialization block");
    }

    protected Vehicle(){

        this.year = 2000;
        this.model = "default model";
        this.brand = "default brand";


    }

    protected Vehicle(int year, String model, String brand){
        //this();
        this.year = year;
        this.model = model;
        this.brand = brand;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void honk(){
        System.out.println("In a honking method");
    }

    public void displayMethod(){
        System.out.println("In a Vehicle display method");
    }

    abstract void start();
    abstract void stop();
}
