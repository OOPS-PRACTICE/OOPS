public class TestCase {

    public static void main(String[] args){
        Test a = new Test();
        Test b = new Test();
        Test c = new Test();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        c.x = 3;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + Test.x);

    }

}
