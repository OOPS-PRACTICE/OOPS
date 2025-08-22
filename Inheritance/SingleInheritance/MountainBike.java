public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    public MountainBike(){
        //super();
        System.out.println("In a Mountain Bike class default constructor");
    }

    public void checkBicycleMethod(){

        //super.checkBicycleMethod();
        System.out.println("In a Mountain Bike Check Method");
        //System.out.println("Step 5 : Adjust and Check the seat height");


    }


    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        //super(startCadence, startSpeed, startGear);
        System.out.println("In a Mountain Bike class argument constructor");
        seatHeight = startHeight;
    }
/*
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }*/



}
