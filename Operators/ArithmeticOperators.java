
public class ArithmeticOperators {

    public static void main(String[] args){


        //The Simple Assignment Operator "="
        int k = 10;

        //The Arithmetic Operators

        int result = 1 + 2;
        System.out.println("Addition operator : " + result);

        result = result - 1;
        System.out.println("Substraction operator : " + result);

        result = result * 4;
        System.out.println("Multiplication operator : " + result);

        result = result / 2;
        System.out.println("Division operator : " + result);

        //Modulus operator which returns the remainder
        result = result % 3;
        System.out.println("Remainder operator : " + result);


        //Precedence : /, * , % operators has more precedence than +,- operator.
        int result1 = 10 + 1 - 2; // if same priority operators in same line than priority shifts from left to right
        System.out.println(result1);
        result1 = result1 + 9 % 7; // Java compiler, by default add brackets surrounding the /,%,* operators like result1 + (9 % 7)
        System.out.println(result1);
        int result2 = (10 / 5) * 3;
        System.out.println(result2);
        int result3 = (10 / 5) + (3 * 2) - 1;
        System.out.println(result3);
        float result4 = (15 + ((0.2f / 3) * 4) - 1);
        System.out.println(result4);


        //The Compound assignment : +=, -=, *=, /=
        int result5 = 0;
        result5+=1;
        System.out.println(result5);

        //Compound assignment operators perform implicit conversion

          short x = 5;
          x += 10;
          x = (short) (x + 10);

         // compound assignment // implicit cast back to short
        // Step 1 : x is promoted to int internally
        // Step 2 : Perform the operation i.e. x + 10
        // Step 3 : After the operation, the result is implicitly cast back to short during the compound assignment x = (short) (x+10);

        x += 2.5;

        System.out.println(x);

        //int k =- 1;
        int l = +1; //it has a no effect on the value of 1
        System.out.println(l);

        //String concatenation
        System.out.println("1" + "2");

        //Arithmetic Exception : Any number divided by 0 always gives Arithmetic Exceptions
         //int q = 10/0;

        byte a = 100;
        byte b = 100;
        byte i = (byte) (a + b);
        //1.Promotion to int. In java when we perform arithmetic operations on byte or short or char values, so they promoted to int.
        //2. casting back to byte
        //3. Overflow (wrapping around)
        //Since 200 exceeds the highest byte value (127), it wraps around 2 complement arithmetic. A byte is 8 bits, so 200 is taken modulo (256)
        System.out.println(i);



        int c = 2147483647;
        int d = c * 2147483647;
        System.out.println(d);

        //When two int multiplies , it results will also store in the int.
        // If the result of the multiplication exceeds the maximum and minimum int value, integer overflow occurs.
        //How does this result is 1 ?
        //2147483647 binary is 01111111 11111111 11111111 11111111 (32 bits).
        // When multiplying the binary result overflows and only the least significant 32 bits of the result are retained.
        //Multiplication result (64 bits)
        // 00000000 00000000 00000000 00000001
        // 11111111 11111111 11111111 11111111



        float e = 10.0f;
        System.out.println(e/3);
        double f = 10;
        System.out.println(f/3);
        int g =  10 / 3;
        System.out.println(g);


    }
}
