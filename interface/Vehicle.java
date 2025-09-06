
public interface Vehicle {

    public static final int MAX_LIMIT = 200;

    public abstract void start();
    void stop();

    public default void test(){
       this.start();
    }

    public static void test1(){
       // this.start();
    }

  //  public void test2();
}
