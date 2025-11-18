import java.util.Stack;
import java.util.Vector;

public class StackExample {

    public static void main(String[] args) {

        Vector v = new Vector<>();
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());

        //System.out.println(s.search(10));
        System.out.println(s.empty());


    }
}
