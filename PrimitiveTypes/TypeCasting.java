public class TypeCasting {

    public static void main(String[] args){

        //Narrowing/explicit/manual Casting potential data loss
        //Widening/implicit/automatic conversion/casting

        byte a = 10; //1 byte
        short b = 10; // 2 bytes
        int c = 10; //4 bytes
        long d = 10; //8 bytes

        float e = 10.0f; //4 bytes
        double f = 10.0;  // 8 bytes

        byte t = (byte) c;
       int i = (int) (10 + 6.5);

        int g = (int) e;

        System.out.println(g);
        
        float j = c;
        System.out.println(j);

        int h = 'A';
    }

}
