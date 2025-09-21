
public class ReferenceValue {

    public static void main(String[] args) {
        int length = 10;
        Box box = new Box(10);
        test(box);
        System.out.println(box.size);
        System.out.println("----------------");
        testing(length);
        System.out.println(length);
    }

    public static void test(Box box){
        box.size = 11;
        System.out.println(box.size);
    }

    public static void testing(int length){
        length = 11;
        System.out.println(length);

    }

}
