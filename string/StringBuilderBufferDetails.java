public class StringBuilderBufferDetails {

    public static void main(String[] args) {

        String str = "Java!!! ";

        for(int i=0;i<8;i++){
            str = str + "Again ";
            System.out.println(str);
        }


        StringBuilder sb = new StringBuilder("Java!!! ");

        for(int i=0;i<6;i++){
            sb.append("Again ");
            System.out.println(sb);
        }

        //sb.append("Testing ").append("Testing ").reverse();
        System.out.println(sb.toString());

        //sb.capacity();


        StringBuffer sb1 = new StringBuffer("Java");
        //sb1.
    }
}
