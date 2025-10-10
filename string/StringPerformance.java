public class StringPerformance {

    public static void main(String[] args) {

        long startTime, endTime;

        startTime = System.currentTimeMillis();
        String str = "Java";

        for(int i = 0 ;i < 100000;i++){
            str += "again ";
        }

        endTime = System.currentTimeMillis();

        System.out.println("String Time " + (endTime-startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder strSB = new StringBuilder("Java");

        for(int i = 0 ;i < 100000;i++){
            strSB.append("again");
        }

        endTime = System.currentTimeMillis();

        System.out.println("String Builder " + (endTime-startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuffer strSB1 = new StringBuffer("Java");

        for(int i = 0 ; i < 100000;i++){
            strSB1.append("again");
        }

        endTime = System.currentTimeMillis();

        System.out.println("String Buffer " + (endTime-startTime) + "ms");
    }

    }

