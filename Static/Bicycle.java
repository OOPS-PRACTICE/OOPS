public class Bicycle {

    static int count;
    int gear;


     //A class can have any number of static initialization blocks, and they can appear anywhere in the class body.
    // The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.
    static {
        count = 10;
        System.out.println("I am static block");
    }

    static {
        System.out.println("I am in another static block");
    }

    //For object variable initialization
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
