
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args){


        System.out.println(Integer.MAX_VALUE);


        List<Integer> list = new LinkedList<>();

        int a = 10;
        //Autoboxing
        Integer k = a;


        Integer b = 1;

        //Integer.MAX_VALUE

        Integer c = Integer.valueOf(4);
        Float f = Float.valueOf(4.25f);
        Double d = Double.valueOf(4.25f);

        //Unboxing
        int h = c;

        Integer e = null;
//        int h = null;

    }
}
