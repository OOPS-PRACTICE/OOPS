public class PrimitiveDataType {

    public static void main(String[] args) {

        //variable name is case sensitive
        //Variable name can be the combination of digits, underscore, dollar sign, letters
        //cannot use Java keywords as variables
        //camel case
        //meaning full name
        //variable name cannot start with digit

        //Integral numbers
        //byte
        //short
        //int
        //long


        byte a = 127;
        short b = 20;
        int c = 20;
        long d = 2147483648L;


        /*byte >> short >> int >>     long*/
        byte u = (byte) 128;
        //2147483647   2147483648
        System.out.println("Long Value : "+ u);



        //Decimal/Floating/Real Numbers
        //float
        //double

        //6-7 digit precision
        float accountBalance = 1.11213123213123123f;
        System.out.println(accountBalance);

        float accountBalance1 = 1234676789.11f;
        System.out.println(accountBalance1);
        //1.2346767E9 means 1.2346767 * 10^9 equals to 1234676700.0
        // Floating point numbers inherently have a fractional part.
        //If we are working with integers (int or long), the result would be 1234676700
        // Java uses this notation to represent very large or very small numbers
        //in a very compact format.
        //The float data type stores only the first 7 significant digits and truncates the rest
        //Hence the 1234676789.11 become 1.2346767E9
        //Since the number is large (10^7). Java uses scientific notation to display compactly.
        //float accountBalance1 = 1234676700.0f;


        float negativeScientificNotation = 0.0000123f;
        //1.23E-5 means 1.23 * 10 ^-5 = 0.0000123
        System.out.println(negativeScientificNotation);

        //float accountBalance = 12.113232323232323232323f;
        System.out.println("Min Value : "+  Float.MIN_VALUE);
        System.out.println("Max Value : "+ Float.MAX_VALUE);

        //10 power 7
        float accountBalance2 = 11000000.123123213123123123213123123123232131232132443213232323f; //Scientific notation
        System.out.println(accountBalance2);
        float accountBalance3 = 110004324324234324234234234234234234234.199992443213499999999f;
        System.out.println(accountBalance3);

        //15-16 digit precision
        double accountBalance4 = 1.12356566556566578787;
        System.out.println(accountBalance4);

        System.out.println("Min Value : "+  Double.MIN_VALUE);
        System.out.println("Max Value : "+ Double.MAX_VALUE);



        //character
        //Every character assigned numeric value.
        //character store in memory as a number
        char newCharacter = 'B';
        System.out.println( (int) newCharacter);

        char newCharacter1 = '\u0000'; //unicode representation
        System.out.println( (int) newCharacter1);
        System.out.println( (char) 10078);
        System.out.println( (char) 2311);

        char newCharacter2 = '\u230A';
        System.out.println( (int) newCharacter2);
        System.out.println("Min Value : "+ (int) Character.MIN_VALUE);
        System.out.println("Max Value : "+ (int) Character.MAX_VALUE);


        //Ascii is the subset of unicode
        //ASCII stands for American Standard Code for Information Interchange,
        // and it assigns a unique integer value (from 0 to 127) to each character,
        // including letters, numbers, and special symbols.

        //boolean
        boolean check = false;
    }

}
