public class Car implements Vehicle, Vehicle1 {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void test() {
        Vehicle.super.test();
    }

   /* @Override
    public void test() {
        Vehicle.super.test();
    }*/
}
