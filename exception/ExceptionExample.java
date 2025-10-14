public class ExceptionExample {

    public static void main(String[] args) {

        //int c = divide(10,0);

        int[] num = {10, 100, 200, 300};
        int[] demo = {10, 100, 0, 300};

        for(int i =0 ; i< 4; i++){
            System.out.println(divide(num[i], demo[i])) ;
        }

        //System.out.println(c);

    }

    public static int divide(int a, int b){
        int d = 0;

        try{
           d = a/b;
        }catch (Exception e){
            e.printStackTrace();

            System.out.println("In the Exception");
        }

        return d ;
    }


}
