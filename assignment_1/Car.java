public class Car extends Vehicle{

    private boolean isElectric;

    @Override
    void start() {
        System.out.println("I am in a car start method");
         super.honk();
    }

    @Override
    void stop() {
        System.out.println("I am in a car stop method");
    }

    Car(int year, String model, String brand){
        super(year,model,brand);
        this.isElectric = false;
        System.out.println("I am in a Car constructor");
    }

    Car(int year, String model, String brand, boolean isElectric){
        super(year,model,brand);
        this.isElectric = isElectric;
        System.out.println("I am in a Car constructor");
    }


    Car(){
        super();
        this.isElectric = false;
        System.out.println("I am in a default Car constructor");
    }


    public void accelerate(int increment) {
           System.out.println("Accelerate : " + increment);
    }

    public void accelerate(float increment){
        System.out.println("Accelerate : " + increment);
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Car (String model, String brand) {
        super(2025,model, brand);
        this.isElectric = false;
    }


    public void demonstrateOperators(){

        //Arithmetic Operators
        int a = 10;
        int b = 3;

        System.out.println( a +b );
        System.out.println( a - b );
        System.out.println( a / b );
        System.out.println( a * b );
        System.out.println( a % b );

        //int result = 10 + (5 * 2) - (4 / 2);


        //Bitwise Operators

        int x = 5;
        int y = 9;
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);

        //Conditional Operators
        boolean cond1 = (a > 5 && b < 3);
        boolean cond2 = (a > 5 || b < 3);

        //Comparison Operators
        System.out.println(a == b);
        //==
        //!=
        //>
        //<

        //shift operators
        //x << 1
        //y >> 1


        //Typecasting (implicitly/Explicitly)
        double d = 9.78;
        int castInt = (int) d;

        byte bt = 100;
        short st = bt;
        int in = st;
        float ft = in;

        char c = 'A';
        int cToInt = c;



    }

}
