//Every method is have there own stack
// Local variables are the part of stack
// instance variables are the part of heap
class Calculator {

    int num = 5;

    public int add(int a, int b){
        System.out.println(num);
        return a + b ;
    }
}

public class Demo {

    public static void main(String[] args) {

        int data = 10;

        Calculator c = new Calculator();
        int res = c.add(1,1);
        System.out.println(res);


        /*c.num = 8;

        Calculator c1 = new Calculator();
        System.out.println(c.num);
        System.out.println(c1.num);*/

    }

}
