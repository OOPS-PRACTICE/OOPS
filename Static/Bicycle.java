public class Bicycle {

    static int count;
    int gear;


    static {
        count = 10;
        System.out.println("I am static block");
    }

    {
        gear = 11;
        System.out.println("I am another block");
    }

    Bicycle(){
       count++;
       System.out.println("In a constructor");
    }

    public static int getCount() {
        return count;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
