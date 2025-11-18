import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();

        al.add(0);
        al.add(1);
        al.add(2);
        al.add(1,6);
        al.remove(1);
        al.removeFirst();
        al.removeLast();

        al.add(1);
        al.add(5);
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(1);
        al.add(19);

        Integer [] abc = {1,2,3,4,5,1};
        Arrays.asList(abc);
        Collections.sort(al);

        List<String> al1 = new ArrayList<>();
        al1.add("Rakesh");
        al1.add("Ramesh");
        al1.add("Rajesh");
         al1.add("Suresh");

        al1.remove("Ramesh");
        al.remove(Integer.valueOf(1));
        al.remove(Integer.parseInt("1"));

        al.add(1, 15);

        List<Integer> al2 = new ArrayList<>(15);

        List<Integer> ll1 = new LinkedList<>();

    }

}
