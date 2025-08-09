public class BitwiseOperators {

    public static void main(String[] args){

        //Computer stores data in binary

        // Purpose of Bitwise Operators :
        // 1. Working with binary flags eg. Managing user permissions like Read, Write
        // and Execute can be represented as individual bits in a integer
        // and perform operations to check, add or remove permissions.
        // like  int READ = ob0001; // Binary: 0001
        // 2. Optimizing calculations or storage eg Multiplying and Dividing by power of 2
        // 3. Performing masking operations eg. Masking is used to extract or
        // modify specific bits with in a number.
        // 4. Implementing algorithms that require direct manipulation of bits

        // This operator is quite faster then arithmetic as
        // we are doing the operations directly on bites
        // To operate on binary we need the bitwise operators
        // operands --> byte, short , int, long, char
        // (not on decimals numbers i.e. floating point types
        // because of how floating-point numbers are represented in memory)
        // [1-bit sign] [8-bit exponent : represents the scale (power of 2) of the number] [23-bit mantissa(fraction:represents the significant digits of the number )]
        // System.out.println(Float.floatToIntBits(1.5f));
        // and operators &
        // or operators |
        // xor ^
        // left shift <<
        // right shift >>
        // unsigned right shift >>>

        // & and operator

        int a = 7;
        System.out.println(Integer.toBinaryString(a));
        //00000000 00000000 00000000 00000111


        // Fetch the binary of below numbers and perform and operation
        int d = 5 & 6;

        System.out.println(Integer.toBinaryString(5)); //101
        System.out.println(Integer.toBinaryString(6)); //110
        System.out.println(Integer.toBinaryString(d));
        System.out.println(d);


        // OR Operator
        int e = 7 | 9 ;

        System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(e);


        //XOR Operator : If both the bits are different then bit value is 1
        int f = 2 ^ 7 ;

        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(f);

        //NOT Operator
        int g = 7 ;
        System.out.println(Integer.toBinaryString(g));
        int k = ~g;
        System.out.println(k);
        System.out.println(Integer.toBinaryString(k));


        // LEFT Shift Operator
        int j = 5;
        System.out.println(Integer.toBinaryString(j));
        //5 : 00000000 00000000 00000000 00000101
        int l = j << 1;
        //int l = j << 2;
        System.out.println(l);
        //System.out.println(k);
        //10 : 00000000 00000000 00000000 00001010
        System.out.println(Integer.toBinaryString(l));

        // RIGHT Shift Operator

        int m = 5;
        System.out.println(Integer.toBinaryString(m));
        //5 : 00000000 00000000 00000000 00000101
        int n = m >> 1;
        //int n = m >> 2;
        System.out.println(n);
        //10 : 00000000 00000000 00000000 00001010
        System.out.println(Integer.toBinaryString(n));


        //unsigned right shift operator shifts the bits of a number to the right , filling the leftmost bits with zeros regardless of the sign of the number.
        //Signed Right shift preserves the sign bit. If the number is negative , leftmost bits are filled with 1 and if the number is positive, the leftmost bits are filled with 0

        int r = -8;

        System.out.println(Integer.toBinaryString(r));
        //-8 : 11111111111111111111111111111000
        int t = r >>> 1;
        System.out.println(t); //2147483644
        System.out.println(Integer.toBinaryString(t)); //01111111111111111111111111111100

        int o = r >> 1;
        System.out.println(o); //-4
        System.out.println(Integer.toBinaryString(o)); //01111111111111111111111111111100


    }

}
