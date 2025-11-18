public class ExceptionPractice {

    public static void main(String[] args) {

        int c = divide(10,0);

        System.out.println(c);

        int[] numerators = {10,200,30,40};
        int[] denomenators = {1,2,0,4};

        for(int i=0;i<numerators.length;i++){
            System.out.println(divide(numerators[i],denomenators[i]));
        }

    }

    public static int divide(int a, int b) {

        /*int d = 0;

        try {
            d = a / b;
        } catch (Exception e) {

            System.out.println("I am in exception");
        }
        return d;*/

        return a/b;
    }



}
