import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(1);

        System.out.println(ls + " " +ls.size());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1111);

        //System.out.println(set + " " +set.size());

        //Add another set
        //set.addAll(ls);

        //Set<Integer> set1 = new HashSet<>();
        //System.out.println(set.isEmpty());
        //System.out.println(set1.isEmpty());

        System.out.println(Collections.max(set));
        System.out.println(Collections.min(set));
        Collections.sort(ls);


    }
}
