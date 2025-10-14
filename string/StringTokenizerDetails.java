import java.util.StringTokenizer;

public class StringTokenizerDetails {

    public static void main(String[] args) {

        String str = "This is a Java Program";


        StringTokenizer st = new StringTokenizer(str);

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


        String str1 = "This } is | a | Java Program";

        StringTokenizer st1 = new StringTokenizer(str1,"}|");

        System.out.println(st1.countTokens());

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }


        String str2 = "This } is | a | Java Program";

        StringTokenizer st2 = new StringTokenizer(str2,"}|", true);

        System.out.println(st2.countTokens());

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }


    }
}
