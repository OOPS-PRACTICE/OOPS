public class Test {
    public static void main(String args[]){

        int x = 5;
        int y = 9;

        System.out.println(Integer.toBinaryString(x)); //0101
        System.out.println(Integer.toBinaryString(y)); //1001


        System.out.println(x & y);
        //System.out.println(Integer.toBinaryString(1));  //0001
        System.out.println(x | y);
        System.out.println(Integer.toBinaryString(13)); //1101
        System.out.println(x ^ y);
        System.out.println(~x);

        System.out.println(x == y);

    }
}
