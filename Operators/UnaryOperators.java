public class UnaryOperators {

    public static void main(String[] args) {

        int result = 2;
        System.out.println(result);

        result--;
        System.out.println(result);

        result++;
        System.out.println(result);

        result = -result;
        System.out.println(result);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);

        //++a pre-increment operator :
        // pre-increment operator increments the value of the variable before it is used in the expression
        //a++ post increment operator :
        // pre-increment operator increments the value of the variable after it is used in the expression

        int i = 4;
        System.out.println(++i);
        System.out.println(i);


        int w = 1;
        //++w increments w by 1 and then increment value is used in the calculation
        int p = ++w + w;
        System.out.println(p);
        int q =  w + ++w;
        System.out.println(q);
         int r =  w + w++ + w; //left to right
        System.out.println(r);

        //post increment operator
        int s = w++ + w ;
        System.out.println(s);

        int result1 =  10;

        int a= ++result1;
        int b = result1++;

        System.out.println(a + " " + b);

    }
    }
